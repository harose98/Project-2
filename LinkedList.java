

public class LinkedList {

     Node head;
    
    //insert method
    //O(1) insertion at beginning and O(N) for every insertion after
    public void insert(int data){
        Node new_node = new Node(data); 
        if (head == null) { 
                head = new_node; 
        } 
        else { 
            Node last = head; 
            while (last.next != null) { 
                 last = last.next; 
            } 
            last.next = new_node; 
        }  
    }

    //print out linked list
    //O(N)
    public void printList() 
    { 
        Node currNode = head; 
        System.out.print("LinkedList: "); 
        while (currNode != null) { 
            System.out.print(currNode.data + " "); 
            currNode = currNode.next; 
        } 
        System.out.println();
    } 

    //get first element
    //O(1)
    public void front(){
        if(head != null){
            Node currNode = head;
            System.out.println("first element: " + currNode.data);
        } else {
            System.out.println("List is empty");
        }
    }

    //get last element
    //O(N)
    public void back(){
        if(head != null){
            Node currNode = head;
            while (currNode != null) { 
                if(currNode.next == null){
                    System.out.println("Last element: " + currNode.data);
                }
                currNode = currNode.next; 
            }
        } else {
            System.out.println("List is empty");
        }
    }

    //remove first element
    //O(1)
    public void pop_Front() {
        if (head!=null){
            head = head.next;
        } else {
            System.out.println("List is empty");
        }
    }

    //remove last element
    //O(N)
    public void pop_Last() {
        if(head != null){
            Node currNode = head;
            while (currNode.next.next != null) {
                currNode = currNode.next;
            }
            currNode.next = null;
        } else {
            System.out.println("List is empty");
        }
    }

    //check if list is empty
    //O(1)
    public void empty(){
        if(head != null){
            System.out.println("List is not empty");
        } else {
            System.out.println("List is empty");
        }
    }

    //get size of list
    //O(N)
    public void size(){
        int counter = 0;
        if(head != null){
            Node currNode = head;
            while (currNode != null) { 
                if(currNode.next == null){
                    counter += 1;
                    System.out.println("List size = " + counter);
                }
                counter++;
                currNode = currNode.next; 
            }
        } else {
            System.out.println("List is empty");
        }
    }

    //reverse order of linked list
    //O(N)
    public void reverse(){
        Node previous = null;
        Node current = head;
        Node next;
		while (current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
        head = previous;
    }

    //merge lists
    //O(N)
    public void merge(LinkedList list) {
        if(list.head == null) {
            return;
        } else {
            Node curr = list.head;
            while(curr != null) {
                insert(curr.data);
                curr = curr.next;
            }
        }
    }


    public static void main (String[] args){
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        LinkedList list3 = new LinkedList();
        list1.insert(1);
        list1.insert(3);
        list1.insert(5);
        list1.insert(7);
        list1.insert(9);
        list1.insert(11);
        list3.insert(2);
        list3.insert(4);
        list3.insert(6);
        list1.printList();
        list1.front();
        list1.back();
        list1.pop_Front();
        list1.pop_Last();
        list1.printList();
        list2.empty();
        list1.empty();
        list1.size();
        list1.reverse();
        list1.printList();
        list1.merge(list3);
        list1.printList();
    }
}
