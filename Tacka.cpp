#include <iostream>
#include <math.h>
#include <vector>
#include <unordered_map>

using namespace std;

class IMera {
public:
	virtual double getMera() = 0;
};

template <typename T>
class Tacka : public IMera{
public:
	T x, y;
	Tacka() : x(0), y(0) {};
	Tacka(T x, T y) : x(x), y(y){};
	double getMera() override {
		return sqrt(pow(x, 2) + pow(y, 2));
	}

	friend bool operator==(const Tacka<T>&, const Tacka<T>&);
	friend ostream& operator<<(ostream& os, const Tacka<T>& tacka) {
		os << "Tacka (" << tacka.x << ", " << tacka.y << ")" << endl;
		return os;
	}
};

template <typename T>
bool operator==(const Tacka<T>& a, const Tacka<T>& b) {
	return a.getMera() == b.getMera();
}

int main() {
	vector<Tacka<int>> v;
	v.push_back(Tacka<int>(5, 1));
	v.push_back(Tacka<int>(10, 2));
	v.push_back(Tacka<int>(1, 5));
	v.push_back(Tacka<int>(3, 2));

	std::unordered_map<double, Tacka<int>> map = std::unordered_map<double, Tacka<int>>();
	for (int i = 0; i < v.size(); i++) {
		if (map.find(v[i].getMera()) == map.end()) { //ako ne postoji 
			map[v[i].getMera()] = v[i];
		}
	}
	
	std::unordered_map<double, Tacka<int>>::iterator mapit;
	for (mapit = map.begin(); mapit != map.end(); mapit++) {
		std::cout << "[" << mapit->first << "] = " << mapit->second << std::endl;
	}


	return 0;
}