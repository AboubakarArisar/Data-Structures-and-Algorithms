public class BST {
    class Node {
        Node right, left;
        int data;
        Node(int data) {
            this.data = data;
            right = left = null;
        }
    }
    Node root;
    BST() {
        root = null;
    }
    public void add(int data) {
        Node node = new Node(data);
        if(root == null) {
            root = node;
        }
        else {
            addHelper(root, node);
        }
    }
    public void addHelper(Node current, Node node) {
        if(current == null) {
            current = node;
        }
        else {
            if(node.data < current.data) {
                if (current.left == null) {
                    current.left = node;
                } else {
                    addHelper(current.left, node);
                }
            }
            else {
                if (current.right == null) {
                    current.right = node;
                } else {
                    addHelper(current.right, node);
                }
            }
        }
    }
    public boolean search(int data) {
        if(root.data == data) {
            return true;
        }
        else {
            return searchHelper(root, data);
        }
    }
    private boolean searchHelper(Node root, int data) {
        if(root == null) {
            return false;
        }
        else {
            if(root.data == data) {
                return true;
            }
            else {
                if(data < root.data) {
                    return searchHelper(root.left, data);
                }
                else {
                    return searchHelper(root.right, data);
                }
            }
        }
    }

    public void remove(int data) {
        if(search(data)){
        if(root == null) {
            return;
        }
        else {
            removeHelper(root, data);
        }
    }
    else{
        System.out.println(data+" is not found in the BST");
    }
    }
    private Node removeHelper(Node root, int data) {
        if (root == null) {
            return root;
        }
    
        if (data < root.data) {
            root.left = removeHelper(root.left, data);
        } else if (data > root.data) {
            root.right = removeHelper(root.right, data);
        } else {
            // node with no leaf nodes
            if (root.left == null && root.right == null) {
                root = null;
            }
            // node with one node (no left node)
            else if (root.left == null) {
                root = root.right;
            }
            // node with one node (no right node)
            else if (root.right == null) {
                root = root.left;
            }
            // nodes with two nodes
            // search for min number in right sub tree
            else {
                Node temp = minValue(root.right);
                root.data = temp.data;
                // Delete the node duplicate from right sub tree
                root.right = removeHelper(root.right, temp.data);
            }
        }
        return root;
    }
    
    private Node minValue(Node root) {
        if (root.left != null) {
            return minValue(root.left);
        }
        return root;
    }
    public void print() {
        printHelper(root);
        System.out.println();
    }
    private void printHelper(Node root) {
        
        //base condition
        if(root == null) {
            return;
        }
        //pre-order-display
        
        System.out.print(root.data+" ");
        printHelper(root.left);
        printHelper(root.right);

        //in-order-display
        /*      
        printHelper(root.left);
        System.out.print(root.data+" ");
        printHelper(root.right);
        */
        
        //post-order display
        /* 
        printHelper(root.left);
        printHelper(root.right);
        System.out.print(root.data+" ");
        */
    }
    public static void main(String[] args) {
        BST bst = new BST();
        bst.add(4);
        bst.add(2);
        bst.add(6);
        bst.add(5);
        bst.add(7);
        bst.add(1);
        bst.add(3);
        bst.print();
        // bst.remove(4);
        // bst.print();
        
    }
}
