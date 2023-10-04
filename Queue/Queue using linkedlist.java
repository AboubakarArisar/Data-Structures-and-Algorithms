class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class Queue {
    //implementaiton of queue using linkedlist
    //two pointers head and tail as front and rear in queue
    Node front = null ,rear = null;
    
    //Empty method
    public boolean isEmpty() {
        return front == null && rear == null;
    }
    
    //enqueue mehthod
    public void add(int data) {
        Node newNode = new Node(data);
        if(isEmpty()) {
            front = newNode;
            rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }
    
    //dequeue method
    public int remove() {
        if(isEmpty()) {
            System.out.print("Queue is empty ");
            return -1;
            //will return -1 if queue is empty
        }
        int value = front.data;
        if(front == rear) {
            rear = null;
        }
        front = front.next;
        return value;
    }
    
    //display method for displaying values
    
 public void display() {
    if(isEmpty()) {
        System.out.println("Queue is empty, nothing to display");
        return;
    }
    Node curr = front;
    while(curr != null) {
        System.out.print(curr.data);
        if (curr.next != null) {
            System.out.print(" --> ");
        } else {
            System.out.println(); // Print a newline at the end
        }
        curr = curr.next;
    }
}

    
    public static void main(String[] args) {
        Queue q = new Queue();
        //firstly check queue is empty or not
        
        System.out.println("Is Queue Empty ? "+q.isEmpty());
        System.out.println();
        
        //adding some values and then printing those values
        
        q.add(0);
        q.add(1);
        q.add(2);
        q.add(3);
        q.remove();
        q.display();
    }
    
    
}
