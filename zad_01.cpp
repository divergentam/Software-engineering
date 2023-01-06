#include <iostream>
#include <vector>

template <typename T>
std::vector<std::vector<T>> allSubArrays(std::vector<T> array) {
	int len = 1;
	std::vector<std::vector<T>> result;
	std::vector<T> temp;
	std::vector<T> last;

	for (int i = 0; i < array.size() - 1; i++) {
		if (array[i] < array[i + 1]) {
			if (len == 1) {
				temp.push_back(array[i]);
			}
			len++;
			temp.push_back(array[i + 1]);
		}
		else {
			if (i == array.size() - 2) {
				last.push_back(array[i + 1]);
			}
			result.push_back(temp);
			temp.clear();
			len = 1;
		}
	}
	if (temp.size() != 0) {
		result.push_back(temp);
	}
	if (last.size() != 0) {
		result.push_back(last);
	}
	return result;
}

int main() {
	std::vector<int> v;
	v.push_back(1);
	v.push_back(2);
	v.push_back(3);
	v.push_back(1);
	v.push_back(5);
	v.push_back(3);

	std::vector<std::vector<int>> res = allSubArrays(v);
	std::vector<std::vector<int>> ::iterator it;
	std::vector<int>::iterator it2;
	for (it = res.begin(); it != res.end(); it++) {
		for (it2 = (*it).begin(); it2 != (*it).end(); it2++) {
			std::cout << *it2 << " ";
		}
		std::cout << " * ";
	}


	return 0;
}