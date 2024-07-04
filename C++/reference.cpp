#include<iostream>
using namespace std;

int refer(int &x){
    x=40;
    cout <<"X value = "<<x<<endl;
    return x;
}

int main(){
    int num = 7;
    refer(num);
    cout<<"num value = "<<num;
}