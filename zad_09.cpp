#ifdef _MSC_VER
#define _CRT_SECURE_NO_WARNINGS
#endif

#include <iostream>
#include <fstream>
#include <set>

template <typename T>
class Par {
public:
	T x, y;
	Par(T x, T y) : x(x), y(y) {};
	friend std::ostream& operator<<(std::ostream& os, const Par<T>& par) {
		os << "Par (" << par.x << ", " << par.y << ")" << std::endl;
		return os;
	}
	bool operator<(const Par<T>& d) const {
		return (this->x < d.x) || (this->x == d.x && this->y < d.y);
	}
	//struct MyComparator {
	//	bool operator()(const Par<T>& prvi, const Par<int>& drugi) const {
	//		if (prvi.x < drugi.x) {
	//			return true;
	//		}
	//		if (prvi.x == drugi.x && prvi.y < drugi.y) {
	//			return true;
	//		}
	//		return false;
	//	}
	//};
};


int main() {
	std::set<Par<int>> skupParova;
	FILE* f = fopen("ulaz_09.txt", "r");
	int x, y;
	int m = 10;
	while (!feof(f)) {
		if (m != 0) {
			fscanf(f, "%d%d", &x, &y);
			Par<int> par = Par<int>(x, y);
			if (skupParova.find(par) == skupParova.end()) {
				skupParova.insert(par);
				std::cout << par;
			}
			else {
				std::cout << "Nije moguce dodati element koji vec postoji u skupu" << std::endl;
				break;
			}
			m--;
		}
		else {
			break;
		}
	}

	fclose(f);


	std::cout << std::endl << "Usredjeni skup: " << std::endl;
	std::set<Par<int>>::iterator it;
	for (it = skupParova.begin(); it != skupParova.end(); it++) {
		std::cout << *it;
	}

	return 0;
}




//Za std::pair
//int main() {
//	FILE* file = fopen("ulaz_09.txt", "r");
//	std::set<std::pair<int, int>> parovi;
//
//	int m, x, y;
//	fscanf(file, "%d", &m);
//
//	int count = 0;
//	while (count != m) {
//		fscanf(file, "%d%d", &x, &y);
//		if (parovi.find(std::pair<int, int>(x, y)) == parovi.end()) {
//			parovi.insert(std::pair<int, int>(x, y));
//		}
//		else {
//			break;
//		}
//		count++;
//	}
//
//	fclose(file);
//
//	std::set<std::pair<int, int>>::iterator it;
//	for (it = parovi.begin(); it != parovi.end(); it++) {
//		std::cout << it->first << " " << it->second << std::endl;
//	}
//
//	
//}