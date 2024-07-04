#include<iostream>
using namespace std;

class animal{
  public:
  string name = "xyz";
  virtual void makesound(){
    cout << "kee";
  }
  void print(){
    cout<<name;
  }
};

class Reptile : public animal{

};
class birds :public animal{
  
};
class mammal :public animal{

};
int main()
{
    birds myBird;
    mammal myDog;

    cout << "Bird's name: ";
    myBird.print();
    cout << endl;

    cout << "Dog's name: ";
    myDog.print();
    cout << endl;

    return 0;
}
