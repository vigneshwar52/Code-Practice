#include <iostream>
using namespace std;

struct Node
{
    int data;
    Node *linker = nullptr;

    Node(int data = 0, Node *linker = nullptr) : data(data), linker(linker){};
};
Node *head = nullptr;

class nodeOp
{

public:
    void insertNode(int value)
    {
        Node *newNode = new Node(value);
        newNode->linker = head;
        head = newNode;
    };
    void deleteNode(int value){
        Node *temp = head;
        Node *prev = nullptr;

        while(temp != nullptr && temp->data != value){
            prev = temp;
            temp = temp->linker;
        }
        if(temp == nullptr)
        cout<<"node not found or value not found or list is empty"<<endl;

        if(prev == nullptr){
            head=temp->linker;
        }else{
            prev->linker = temp->linker;
        }
        delete temp;
    }
    void printNode()
    {
        Node *temp = head;
        while (temp != nullptr)
        {
            cout << head<<" " << temp->data << "->"<<temp->linker<<endl;
            temp = temp->linker;
        }
    }
};

int main()
{
    nodeOp op;
    op.insertNode(100);
    op.insertNode(200);
    op.insertNode(300);
    op.insertNode(400);
    op.insertNode(500);
    op.insertNode(600);
    op.insertNode(700);
    op.insertNode(800);
    op.insertNode(900);
    op.insertNode(040);
    op.insertNode(2670);
    op.insertNode(30653);

    op.deleteNode(500);

    op.printNode();
}