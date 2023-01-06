#include <iostream>
#include <vector>

template <typename T>
std::vector<T> longestVecBS(std::vector<T> array) {
	int max = 1;
	int len = 1;
	std::vector<T> temp;
	std::vector<T> maxVec;

	for (int i = 0; i < array.size() - 1 ; i = i + 2) { // da bi se ogranicili da prvo if ne pukne - puca u slucaju kad imamo neparni broj el stavljamo da i ide do size - 1 
		// poenta je da se dodaje i + 1 elemnt u svakoj iteraciji
		if (array[i] < array[i + 1]) {
			if (len == 1) {
				temp.push_back(array[i]);
			}
			len++;
			temp.push_back(array[i+1]);
		}else{
			if (max < len){
				max = len;
				maxVec = temp;
				len = 1;
				temp.clear();
				break; // ne mogu da dodam i + 2 el ako u + 1 nisam dodala
			}
		}
		if (i + 2 >= array.size()) { // puca kad imamo paran broj elemenata u nizu pa zato pisemo ovo
			if (max < len) {
				max = len;
				maxVec = temp;
				len = 1;
				temp.clear();
				break;
			}
			break;
		}
		if (array[i + 1] > array[i + 2]) {
			len++;
			temp.push_back(array[i + 2]);
		}else{
			if (max < len) {
				max = len;
				maxVec = temp;
				len = 1;
				temp.clear();
			}
		}
	}
	if (max < len) {
		maxVec = temp;
	}
	return maxVec;

}

int main() {
	std::vector<int> in;
	in.push_back(1);
	in.push_back(7);
	in.push_back(3);
	in.push_back(4);
	in.push_back(2);
	//in.push_back(8);
	//in.push_back(9);
	//in.push_back(1);
	//in.push_back(2);
	//in.push_back(5);


	std::vector<int> out = longestVecBS(in);
	std::vector<int>::iterator it;
	for (it = out.begin(); it != out.end(); it++) {
		std::cout << *it << " ";
	}

	return 0;

	return 0;
}