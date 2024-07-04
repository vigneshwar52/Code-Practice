#include <iostream>
using namespace std;

class Node {
public:
    int data;
    Node* linker;

    // Constructor
    Node(int data = 0, Node* linker = nullptr) : data(data), linker(linker) {}
};

Node* head = nullptr; // Global head pointer initialized to nullptr

int main() {
    Node* ptr1 = new Node(5,nullptr);
    Node* ptr2 = new Node(10,nullptr); // Note that head is currently nullptr

    head = ptr1;
    ptr1->linker = ptr2;

    // Traversing the linked list
    Node* temp = head;
    while (temp != nullptr) {
        cout << "Node data: " << temp->data << endl;
        cout << "Node address: " << temp << endl;
        temp = temp->linker;
    }

    return 0;
}
