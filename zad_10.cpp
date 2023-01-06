#ifdef _MSC_VER
#define _CRT_SECURE_NO_WARNINGS
#endif

#include <iostream>
#include <vector>
#include <unordered_map>


class Trougao {
public:
	int a, b, c;
	Trougao(int a, int b, int c) : a(a), b(b), c(c) {};
	bool operator==(const Trougao& t) const {
		return (this->a == t.a) && (this->b == t.b) && (this->c == t.c);
	}
	friend std::ostream& operator<<(std::ostream& os, const Trougao& t) {
		os << "(" << t.a << ", " << t.b << ", " << t.c << ")";
		return os;
	}
	struct HashFunction {
		size_t operator() (const Trougao& t) const {
			size_t h = 7;
			h = 19 * h + std::hash<int>()(t.a);
			h = 19 * h + std::hash<int>()(t.b);
			h = 19 * h + std::hash<int>()(t.c);
			return h;
		}
	};
};


//
//class Trougao_jednakost {
//public:
//	bool operator()(const Trougao& t1, const Trougao& t2)const {
//		return ((t1.a == t2.a) && (t1.b == t2.b) && (t1.c == t2.c));
//	}
//};

int main() {
	std::unordered_map<Trougao, int, Trougao::HashFunction> mapa;
	/*std::vector<Trougao> listaEl = std::vector<Trougao>();
	std::vector<int> listaPon = std::vector<int>();*/
	FILE* f = fopen("ulaz_10.txt", "r");
	int a, b, c;
	while (!feof(f)) {
		fscanf(f, "%d%d%d", &a, &b, &c);
		Trougao trougao = Trougao(a, b, c);
		std::cout <<  trougao;
		/*listaEl.push_back(trougao);*/
		if (mapa.find(trougao) == mapa.end()) {
			mapa[trougao] = 1;
			//listaPon.push_back(1);
		}
		else {
			int val = mapa[trougao];
			mapa[trougao] = val + 1;
			//listaPon.push_back(val + 1);
		}
		std::cout << " [" << mapa[trougao] << "] ";

	}

	std::cout << std::endl << std::endl << "*****************************************************************" << std::endl;
	std::unordered_map<Trougao, int, Trougao::HashFunction>::iterator it;
	for (it = mapa.begin(); it != mapa.end(); it++) {
		std::cout << it->first << " = " << it->second << std::endl;
	}

	/*for (int i = 0; i < listaEl.size(); i++) {
		std::cout << listaEl[i] << " [" << listaPon[i] << "]";
	}*/

}