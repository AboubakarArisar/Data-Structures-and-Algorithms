
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
        public int remove() {
            if(head == null) {
                System.out.println("list empty");
                return -1;
            }
            int val = head.data;
            head = head.next;

            return val;
        }
        public Node arrange(Node head) {
            if (head == null) {
                System.out.println("List is empty");
                return null;
            }
        
            Node evenHead = null, evenTail = null; // first part of linkedlist will be even and tail for connection with 2nd list 
            Node oddHead = null, oddTail = null; // second part of linkedlist will be odd  and tail for connection
            Node zeroHead = null, zeroTail = null; //middle part of linkedlist will be for zeros nodes
        
            Node curr = head;
        
            while (curr != null) {
                Node nextNode = curr.next; //take the current next node 
                curr.next = null; // cut current next node from original list
                if (curr.data == 0) {
                    if (zeroHead == null) {
                        zeroHead = curr;
                        zeroTail = curr;
                    } else {
                        zeroTail.next = curr;
                        zeroTail = curr;
                    }
                }
                else if (curr.data % 2 == 0) {  
                    if (evenHead == null) {
                        evenHead = curr;
                        evenTail = curr;
                    } else {
                        evenTail.next = curr;
                        evenTail = curr;
                    }
                } else {
                    if (oddHead == null) {
                        oddHead = curr;
                        oddTail = curr;
                    } else {
                        oddTail.next = curr;
                        oddTail = curr;
                    }
                }
        
                curr = nextNode;
            }
        
            // Connect the even and odd parts by the help of even odd head and tails

            if(oddHead!=null) {
                if(zeroHead!=null) {
                    oddTail.next = zeroHead;
                    zeroTail.next = evenHead;
                    head = oddHead;
                }
                else {
                    oddTail.next = evenHead;
                    head = oddHead;
                }
            }
            else {
                if(zeroHead!=null) {
                    zeroTail.next = evenHead;
                    head = zeroTail;
                }
                else {
                    head = evenHead;
                }
            }
                
            return head;
            
        }
        
    public static void main(String[] args) {
        int count = 0 ;
        LL l = new LL();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(0);
        l.add(0);

        Node curr = l.arrange(l.head);
            while (curr != null) {
                System.out.println(curr.data);
                curr = curr.next;
            }


    }
    
}

