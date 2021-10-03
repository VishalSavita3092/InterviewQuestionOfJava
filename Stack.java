package com.linked.list;

public class Stack {
    static final int Max = 100;
    int aar[] = new int[Max];
    int top;

    Stack(){
        top = -1;
    }

    boolean isFull(){
        return (top + 1) > (Max -1);
    }

    boolean  isEmpty(){
        return (top < 0);
    }

    boolean push(int data){
        if(isFull()){
            System.out.println("Over Flow");
            return false;
        }
        else {
            aar[++top] = data;
            return  true;
        }
    }

    int pop(){
        if(isEmpty()){
            System.out.println("Under Flow");
            return 0;
        }
        else {
            int temp = aar[top];
            top--;
            return temp;
        }
    }
    void printStack(){
        for(int i=top;i>-1;i--){
            System.out.print(aar[i]+" ");
        }
        System.out.println();
    }

    void reverseStack(){
        for(int i=0;i<=top;i++){
            System.out.print(aar[i]+" ");
        }
        System.out.println();
    }

    boolean searchEle(int key){
        boolean result = false;
        for(int i=top;i>-1;i--){
            if(aar[i]==key){
                result = true;
            }
        }
        return result;
    }

}
 class Main{
    public static void main(String[] args) {
        Stack newStack = new Stack();

        newStack.push(20);
        newStack.push(10);
        newStack.push(50);
        newStack.push(100);
        newStack.printStack();
        newStack.reverseStack();
        newStack.pop();
        newStack.pop();
        newStack.printStack();
        System.out.println(newStack.searchEle(20));
    }
}
