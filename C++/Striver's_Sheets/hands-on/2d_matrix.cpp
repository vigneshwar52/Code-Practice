#include <iostream>
#include <unordered_set>
#include <vector>

using namespace std;

unordered_set<int> setRows;
unordered_set<int> setColumns;

void printMatrix(const vector<vector<int>>& matrix) {
    for (const auto& row : matrix) {
        for (int num : row) {
            cout << num << " ";
        }
        cout << endl;
    }
}

int main() {
    // Define the matrix
    vector<vector<int>> matrix = {
        {1, 0, 3},
        {4, 5, 6},
        {7, 8, 9}
    };

    // Get the size of the matrix
    int n = matrix.size();
    int m = matrix[0].size();

    // Display the original matrix
    cout << "Original Matrix:" << endl;
    printMatrix(matrix);

    // Iterate through the matrix to find zeros
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            if (matrix[i][j] == 0) {
                setRows.insert(i);
                setColumns.insert(j);
            }
        }
    }

    // Display the rows and columns with zeros
    cout << "\nRows with zeros:" << endl;
    for (int row : setRows) {
        cout << row << " ";
    }
    cout << endl;

    cout << "Columns with zeros:" << endl;
    for (int col : setColumns) {
        cout << col << " ";
    }
    cout << endl;

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            if (setRows.count(i) || setColumns.count(j)) {
                matrix[i][j] = 0;
            }
        }
    }

    // Display the modified matrix
    cout << "\nModified Matrix:" << endl;
    printMatrix(matrix);

    return 0;
}
