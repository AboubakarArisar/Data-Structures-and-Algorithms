import java.util.Stack;
class Queue {
    Stack<Integer> st1 = new Stack<>();
    Stack<Integer> st2 = new Stack<>();
    
    //checking for empty queue
    public boolean isEmpty() {
        return st1.isEmpty();
    }
    
    //adding value using stacks
    public void add(int data) {
        while(!st1.isEmpty()) {
            st2.push(st1.pop());
        }
        st1.push(data);
        while(!st2.isEmpty()) {
            st1.push(st2.pop());
        }
    }
    
    //remvoing value using stacks
    public int remove() {
        if(st1.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return st1.pop();
    }
    
    //peek method using stacks
    
    public int peek() {
        if(st1.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return st1.peek();
    }
    
    
    //printing values 
    public void display() {
        if(isEmpty()) {
            System.out.println("Queue is empty, nothing to display");
            return;
        }
        
        for(int i = st1.size() - 1 ; i >= 0; i--) {
            System.out.println(st1.get(i));
        }
        
    }
    
}
class Test {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(0);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        
        q.display();
	q.remove();
	System.out.println("display after removing elements");
	q.display();
    }
}
