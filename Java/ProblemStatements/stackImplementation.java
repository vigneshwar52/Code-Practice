package ProblemStatements;

public class stackImplementation {
    private int[] arr;
    private int size;
    private int top = 0;
    private boolean didPrinted = true;

    public stackImplementation(int size){
        this.size = size;
        this.arr = new int[size];
    }

    public void push(int ele){
        if(!this.isFull()){
            arr[top] = ele;
            top++;
            System.out.println("the inserted element in this stack is"+ele);
        }else
        System.out.println("Stack is currently full");
    }

    public int pop(){
        if(!this.isEmpty()){
            if(didPrinted)
            System.out.println("top index = "+top);
            didPrinted = false;
            top --;
            int returntop = arr[top];
            return returntop;
        }else{
        System.out.println("stack is empty unable to pop the element");
        return -1;
        }
    }
    public int peak(){
        if(!this.isEmpty())
        return arr[top];
        else
        System.out.println("Stack is empty");
        return -1;
    }
    
    public boolean isEmpty(){
        return (top==-1);
    }
    public boolean isFull(){
        return (top==size);
    }
    public void printAll(){
        for(int i=0;i<this.top;i++){
            System.out.println(arr[i]);
        }
    }
    //----------------------------------------------//
    public static void main(String[] args) {
        stackImplementation stack = new stackImplementation(10);
        stack.push(20);
        stack.push(21);
        stack.push(22);
        stack.push(23);
        stack.push(24);
        stack.push(25);
        stack.push(26);
        stack.push(27);
        stack.push(28);
        stack.push(29);

        System.out.println("-------------------");
       int val1 = stack.pop();
       int val2 = stack.pop();
       System.out.println("Poped elements are "+ val1+"\t"+val2);
       System.out.println("-------------------");
       stack.printAll();
    }
}
