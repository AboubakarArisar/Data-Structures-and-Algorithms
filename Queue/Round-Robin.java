import java.util.*;
public class RoundRobin {
    int front  = 0 , rear =0;
    int size = 0;
    int currValues = 0;
    int array[];
        RoundRobin(int size) {
            array = new int[size];
            this.size = size;
        }

        public void add(int data) {
            if(rear + 1==front) {
                System.out.println("cant add");
                return;
            }
            array[rear] = data;
            rear = (rear+1)%size;
            currValues++;


        }
        public void remove() {
            front = (front + 1 ) % size;
            currValues--;
         }
         public void removeid(int id){
            for(int i = id; i<rear-1; i=((i+1)%size)){
                array[i] = array[i+1];
            }
            currValues--;
            rear = (rear - 1) % size;
         }
        public void display() {
        for(int i = front; i < rear; i++) {
            System.out.println(array[i]);
        }
        }
        public void Lab() {
            // int iter = 1;
            System.out.println(currValues);
            while(currValues > 0){
                // System.out.println("iteation no "+iter);
                for(int i = front ; i != rear; i=(i+1)%size){
                    if(array[i] > 0) {
                        array[i]--;
                        // System.out.println(array[i]);
                    }
                    else {
                        removeid(i--);
                    }
                }
                iter++;
            }
        }
    public static void main(String args[]) { 
        RoundRobin rb = new RoundRobin(5);
        rb.add(2);
        rb.add(3);
        rb.add(4);
        rb.add(5);
        rb.Lab();

        // rb.display();

    }
}
