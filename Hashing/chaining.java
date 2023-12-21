package DSAFinal;
import java.util.*;
public class Hashing {
    public static void main(String[] args) {
        hash hs = new hash(5);
        hs.insert(0);
        hs.insert(1);
        hs.insert(2);
        hs.insert(3);
        hs.insert(4);
        hs.insert(5);
    }
}

class hash{
    int size;
    List<Integer>[] list;
    hash(int size) {
        this.size = size;
        list = new List[size];
        for(int i = 0; i < size; i++) {
            list[i] = new LinkedList<>();
        }
    }
    public void insert(int data) {
        int key = data % size;
        list[key].add(data);
    }
    public void display() {
        for(int i = 0; i < size; i++) {
            System.out.print(i+" : ");
            for(int j = 0; j < list[i].size(); j++) {
                System.out.print(" --> "+list[i].get(j));
            }
            System.out.println();
        }
    }
}
