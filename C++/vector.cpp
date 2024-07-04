#include <iostream>
#include <vector>
using namespace std;

int main() {
    std::vector<std::string> fruits = {"Apple", "Banana", "Orange", "Grapes"};

    // Iterate over the vector using a range-based for loop
    for (const auto& fruit : fruits) {
        std::cout << fruit << " "<<endl;
    }

    vector<vector<int>> matrix;
    matrix.push_back({1,2});
    cout<<"Elemnet at [0,1] is " << matrix[0][1]<<endl;

    return 0;
}