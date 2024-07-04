#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
    std::vector<std::string> fruits = {"Apple", "Banana", "Orange", "Grapes"};

    // Iterate over the vector using a range-based for loop
    for (const string& fruit : fruits) {
        std::cout << fruit << " " << endl;
    }

    vector<vector<int>> matrix;
    matrix.push_back({1, 2, 3});
    matrix.push_back({3, 4, 5});
    matrix.push_back({6, 7, 8});

    cout << "Element at [0,1] is " << matrix[0][1] << endl;

    for (auto& row : matrix) {
        row.erase(remove(row.begin(), row.end(), 3), row.end());
    }

    for (const auto& row : matrix) {
        cout << endl;
        bool RemovedFirstelement = true;  // Flag to check if it's the first element in the row
        for (auto element : row) {
            if (!RemovedFirstelement) {
                cout << " ";
            }
            cout << element;
            RemovedFirstelement = false;
        }
    }

    return 0;
}
