public class Node {
    int data;
    Node next;

    //default constructor
    Node(){
        data = 0;
        next = null;
    }
    
    //copy constructor
    Node(int d){
        data = d;
        next = null;
    }
}