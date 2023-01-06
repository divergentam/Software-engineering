#include <iostream>
#include <vector>

template <typename T>
std::vector<std::vector<T>> allSubarray(std::vector<T> v) {
	int len = 1;
	std::vector<T> temp;
	std::vector<std::vector<T>> maxVector;
	std::vector<T> last;

	for (int i = 1; i < v.size(); i++) {
		if (v[i - 1] < v[i]) {
			if (len == 1) {
				temp.push_back(v[i - 1]);
			}
			len++;
			temp.push_back(v[i]);
		}
		else {
			if (i == v.size() - 1) {
				last.push_back(v[i]);
			}
			maxVector.push_back(temp);
			temp.clear();
			len = 1;
		}
	
		std::cout << "tmp: ";
		for (int ti = 0; ti < temp.size(); ti++) {
			std::cout << temp[ti] << " ";
		}
		std::cout << std::endl;
	}
	if (temp.size() != 0) {
		maxVector.push_back(temp);
	}
	if (last.size() != 0) {
		maxVector.push_back(last);
	}
	
	return maxVector;
}

int main() {
	std::vector<int> vector;
	vector.push_back(1);
	vector.push_back(2);
	vector.push_back(3);
	vector.push_back(1);
	vector.push_back(5);
	vector.push_back(3);
	//vector.push_back(5);

	std::vector<std::vector<int>> res = allSubarray(vector);
	std::vector<std::vector<int>>::iterator it;
	std::vector<int>::iterator it2;


	for (it = res.begin(); it != res.end(); it++) {
		std::cout << "[ ";
		for (it2 = (*it).begin(); it2 != (*it).end(); it2++) {
			std::cout << *it2 << " ";
		}
		std::cout << "]" << std::endl;
	}

	return 0;
}