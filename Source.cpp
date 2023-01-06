#include<iostream>
#include<vector>

using namespace std;


// 1 2 3 9 8 1 4 5
//1 0 2 0 3 0 9 0 8 0 1 0 4 0 5

template<typename T>
vector<T> writeBetween(vector<T> v, int x) {
	vector<T> result;

	for (int i = 0; i < v.size(); i++) {
		if (i == v.size() - 1) {
			result.push_back(v[i]);
		}
		else {
			result.push_back(v[i]);
			result.push_back(x);
		}
	}
	return result;

}

int main() {
	vector<int> v;
	v.push_back(1);
	v.push_back(2);
	v.push_back(3);
	v.push_back(9);
	v.push_back(8);
	v.push_back(1);
	v.push_back(4);
	v.push_back(5);

	vector<int> res = writeBetween(v, 0);
	vector<int>::iterator it;
	for (it = res.begin(); it != res.end(); it++) {
		cout << *it << " ";
	}
	return 0;
}














