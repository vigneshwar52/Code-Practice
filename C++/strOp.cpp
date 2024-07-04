#include <iostream>
#include <string>
using namespace std;

bool isPalindrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }
        int i=0,val = x,n= 0;
        while(x>n){
            n = (n *10) + x%10;
            x = x/10;
        }
        cout<<"n value = "<< n <<endl;
        cout<<"x value = "<< x <<endl;
        return x == n || x == n / 10;
    }

int main() {
    cout <<"palindrome = "<<isPalindrome(1121211);
    return 0;
}
