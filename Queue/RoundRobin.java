import java.util.*;
public class RoundRobin {
    int front  = 0 , rear =0;
    int size = 0;
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
               rear = (rear+1)%size;
            array[rear] = data;


        }
        public void remove() {
            front = (front + 1 ) % size;
         }

        public void display() {
        for(int i = front; i < rear; i++) {
            System.out.println(array[i]);
        }
        }
        public void shufflingLabExam() {


            for(int i = front; i < rear ; i++){
                removal(array[i]);
            }
        }
        public void removal(int data){

            while(array[front] > 1) {
                array[front]--;
            }
            remove();
        }
    public static void main(String args[]) {
        RoundRobin rb = new RoundRobin(5);
        rb.add(10);
        rb.add(9);
        rb.add(8);
        rb.add(4);
        rb.shufflingLabExam();

        rb.display();

    }
}
