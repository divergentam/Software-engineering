#include <iostream>
#include <vector>

class Figura {
public:
	std::string ime;
	virtual void opis() = 0;
};

class Dim2 {
public:
	virtual double povrsina() = 0;
};

class Dim3 {
public:
	virtual double zapremina() = 0;
};

template <typename T>
class Kvadrat : public Figura, public Dim2 {
public:
	T a;
	Kvadrat(T a) : a(a) {
		ime = "Kvadrat";
	};
	void opis() override {
		std::cout << "Kvadrat: (a =" << a << ")" << std::endl;
	}
	double povrsina() override {
		return a * a;
	}
};

template <typename T>
class Krug : public Figura, public Dim2 {
public:
	T r;
	Krug(T r) : r(r) {
		ime = "Krug";
	};
	void opis() override {
		std::cout << "Krug: (r = " << r << ")" << std::endl;
	}
	double povrsina() override {
		return r * r * 3.14;
	}
};

template <typename T>
class Kocka : public Figura, public Dim3 {
public:
	T a;
	Kocka(T a) : a(a) {
		ime = "Kocka";
	};
	void opis() override {
		std::cout << "Kocka: (a = " << a << ")" << std::endl;
	}
	double zapremina() override {
		return a * a * a;
	}
};

template <typename T>
class Kupa : public Figura, public Dim3 {
public:
	T r, h;
	Kupa(T r, T h) : r(r), h(h) {
		ime = "Kupa";
	};
	void opis() override {
		std::cout << "Kupa: (r = " << r << ", h = " << h << ")" << std::endl;
	}
	double zapremina() override {
		return (r*r*3.14*h)/3;
	}
};

int main() {
	std::vector<Figura*> figure;
	Kvadrat<double>* k1 = new Kvadrat<double>(4);
	Kvadrat<double>* k2 = new Kvadrat<double>(3);

	Krug<double>* krug1 = new Krug<double>(2);
	Krug<double>* krug2 = new Krug<double>(3.5);

	Kocka<double>* kocka1 = new Kocka<double>(4);
	Kocka<double>* kocka2 = new Kocka<double>(4.5);

	Kupa<double>* kupa1 = new Kupa<double>(2, 3);
	Kupa<double>* kupa2 = new Kupa<double>(2.5, 4);

	figure.push_back(k1);
	figure.push_back(k2);
	figure.push_back(krug1);
	figure.push_back(krug2);
	figure.push_back(kocka1);
	figure.push_back(kocka2);
	figure.push_back(kupa1);
	figure.push_back(kupa2);

	for (int i = 0; i < figure.size(); i++) {
		figure[i]->opis();
	}


	double sum_dim2 = 0.0;
	for (int i = 0; i < figure.size(); i++) {
		if (figure[i]->ime == "Krug"){
			Krug<double>* krug = dynamic_cast<Krug<double>*>(figure[i]);
			//Krug<double>* krug = (Krug<double>*)figure[i];
			sum_dim2 += krug->povrsina();
		}if (figure[i]->ime == "Kvadrat"){
			Kvadrat<double>* kvadrat = dynamic_cast<Kvadrat<double>*>(figure[i]);
			sum_dim2 += kvadrat->povrsina();
		}
	}
	std::cout << "Suma povrsina dvodimenzionalnih figura je: " << sum_dim2 << std::endl;

	double sum_dim3 = 0.0;
	for (int i = 0; i < figure.size(); i++) {
		if (figure[i]->ime == "Kocka") {
			Kocka<double>* kocka = dynamic_cast<Kocka<double>*>(figure[i]);
			sum_dim3 += kocka->zapremina();
		}if (figure[i]->ime == "Kupa") {
			Kupa<double>* kupa = dynamic_cast<Kupa<double>*>(figure[i]);
			sum_dim3 += kupa->zapremina();
		}
	}
	std::cout << "Suma zapremin trodimenzionalnih figura je: " << sum_dim3 << std::endl;


	return 0;
}