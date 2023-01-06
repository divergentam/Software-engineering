#include <iostream>
#include <vector>
#include <set>

class Trojka {
public:
    int a, b, c;

    Trojka(int a, int b, int c) : a(a), b(b), c(c) {}
    bool operator<(const Trojka& t) const {
        return (this->a < t.a) || (this->a == t.a && this->b < t.b) || (this->a == t.a && this->b == t.b && this->c < t.c);
    }
};

//struct Trojka_uredjenje
//{   // Tacka(a,b,c) < Tacka(m,n,p)
//    bool operator()(const Trojka& prva, const Trojka& druga)const{ // mora da bude konstantna fja
//        if (prva.a < druga.a) { // a < m
//            return true;
//        }
//        if (prva.a == druga.a) { // a == m onda b < n
//            if (prva.b < druga.b) {
//                return true;
//            }
//        }
//        if (prva.a == druga.a && prva.b == prva.b) { // a == m i b == n i c < p
//            if (prva.c < druga.c) {
//                return true;
//            }
//        }
//        return false;
//    }
//};

int main() {
    std::set<Trojka> skup;
    skup.insert(Trojka(1, 0, 2));
    skup.insert(Trojka(0, 1, 1));
    skup.insert(Trojka(3, 4, 5));
    skup.insert(Trojka(0, 0, 1));
    skup.insert(Trojka(2, 2, 2));


    std::set<Trojka>::iterator it;
    for (it = skup.begin(); it != skup.end(); it++) {
        std::cout << "Trojka(" << it->a << ", " << it->b << ", " << it->c << ")" << std::endl;
    }

    return 0;
}