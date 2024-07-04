#include <iostream>

// Define a node structure
struct Node {
    int data;      // Data of the node
    Node* next;    // Pointer to the next node

    // Constructor to initialize node
    Node(int value) : data(value), next(nullptr) {}
};
class LinkedList {
private:
    Node* head;  // Pointer to the first node

public:
    // Constructor
    LinkedList() : head(nullptr) {}

    // Function to add a new node at the beginning of the list
    void addNode(int value) {
        Node* newNode = new Node(value);  // Create a new node
        newNode->next = head;             // Set the new node's next to the current head
        head = newNode;                   // Update the head to the new node
    }

    // Function to print the linked list
    void printList() {
        Node* current = head;  // Start from the head
        while (current != nullptr) {
            std::cout << current->data << " ";  // Print the data of the current node
            current = current->next;            // Move to the next node
        }
        std::cout << std::endl;
    }
};
int main() {
    LinkedList myList;

    // Add nodes to the linked list
    myList.addNode(1);
    myList.addNode(2);
    myList.addNode(3);

    // Print the linked list
    myList.printList();

    return 0;
}
