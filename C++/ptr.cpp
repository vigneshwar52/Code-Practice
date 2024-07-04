#include<iostream>
#include <vector>
using namespace std;

int main() {
    vector<int> vect1;
    int i = 0, value;

    while (i < 5) {
        vect1.push_back(i);
        i++;
    }

    i = 0; // Reset i to 0 before using it again

    while (i < vect1.size()) {
        cout << "value at " << i << " is " << vect1[i] << endl;
        i++;
    }

    return 0;
}
