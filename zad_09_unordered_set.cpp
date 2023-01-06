#ifdef _MSC_VER
#define _CRT_SECURE_NO_WARNINGS
#endif

#include <iostream>
#include <fstream>
#include <unordered_set>

template <typename T>
class Par {
public:
	T x, y;
	Par(T x, T y) : x(x), y(y) {};
	friend std::ostream& operator<<(std::ostream& os, const Par<T>& par) {
		os << "Par (" << par.x << ", " << par.y << ")" << std::endl;
		return os;
	}
	bool operator==(const Par<T>& d) const {
		return (this->x == d.x) && (this->y == d.y);
	}

	struct HashFunction {
		size_t operator()(const Par<T>& p) const {
			size_t h = 0;

			h = 19 * h + std::hash<int>()(p.x);
			h = 19 * h + std::hash<int>()(p.y);

			return h;
		}
	};
};

int main() {
	std::unordered_set<Par<int>, Par<int>::HashFunction> skupParova;
	FILE* f = fopen("zad_09_unordered_set.txt", "r");
	int x, y;
	while (!feof(f)) {
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
	}

	fclose(f);



	std::unordered_set<Par<int>, Par<int>::HashFunction>::iterator it;
	for (it = skupParova.begin(); it != skupParova.end(); it++) {
		std::cout << *it;
	}

	return 0;
}