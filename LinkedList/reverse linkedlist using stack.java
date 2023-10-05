import java.util.Stack;

class LL {
    Node head;
    class Node {
        Node next;
        int data;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
        LL() {
            this.head = null;
        }

        public void add(int data) {
            Node newNode = new Node(data);
            if(head == null) {
                head = newNode;
            }
            else {
                Node curr = head;
                while(curr.next!=null) {
                    curr =curr.next;
                }
                curr.next = newNode;
            }
        }
        public Node findNode(Node head, int n, int size) {
            int target = size - n + 1;
            int i = 1;
            Node curr = head;
            while(i!=target) {
                i++;
                curr = curr.next;
            }
            return curr;
        }
        public int remove() {
            if(head == null) {
                System.out.println("list empty");
                return -1;
            }
            int val = head.data;
            head = head.next;

            return val;
        }
    public static void main(String[] args) {
        int count = 0 ;
        LL l = new LL();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(5);
        l.add(4);

        Stack<Integer> st = new Stack<>();
        st.push(l.remove());
        st.push(l.remove());
        st.push(l.remove());
        st.push(l.remove());
        st.push(l.remove());

        l.add(st.pop());
        l.add(st.pop());
        l.add(st.pop());
        l.add(st.pop());
        l.add(st.pop());

        Node curr = l.head;
        while(curr!=null) {
           System.out.println(curr.data);
            curr = curr.next;
        }
       
        // curr  = l.head;
        // while(curr!=null) {
        //     System.out.println(curr.data);
        //     curr = curr.next;
        // }
       


    }
    
}

