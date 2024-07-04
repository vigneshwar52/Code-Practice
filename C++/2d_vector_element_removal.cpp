#include <iostream>
#include <vector>

int main() {
    std::vector<std::vector<int>> matrix = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9},
        {7, 8, 9}
    };

    // Index to be removed
    size_t rowIndexToRemove = 1;
    size_t columnIndexToRemove = 2;

    // Check if the indices are valid
    if (rowIndexToRemove < matrix.size() && columnIndexToRemove < matrix[0].size()) {
        // Erase the element at the specified index
        matrix[rowIndexToRemove].erase(matrix[rowIndexToRemove].begin() + columnIndexToRemove);
    }

    // Display the updated matrix
    for (const auto& row : matrix) {
        for (int element : row) {
            std::cout << element << " ";
        }
        std::cout << std::endl;
    }
    std::cout<<"Size of the matrix : "<<matrix.size() <<std::endl;
    std::cout<<"capacity of the matrix : " << matrix.capacity()<<std::endl;

    return 0;
}
