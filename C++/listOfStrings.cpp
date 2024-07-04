#include<iostream>
#include<vector>
using namespace std;

void passmyvector(const std::vector<std::string> &name){
    for(const string &refer : name){
    std::cout << refer <<endl;
    }
}

void doubleValues( vector<int> &num){
    for (int val :num){
        //val*=2;
        cout<<val<<endl;
    }
}
int main(){
    vector<string> nameofvector;

    nameofvector.push_back("value1");
    nameofvector.push_back("value2");
    
    passmyvector(nameofvector);

vector<int> numbers = {2,3,2,5};
    doubleValues(numbers);
}