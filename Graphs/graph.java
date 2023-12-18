import java.util.*;
public class practice {
    Map<Integer, List<Integer>>graph;
    practice(){
        graph = new HashMap<>();
    }
    public void addVertex(int data){
        graph.put(data, new ArrayList<>());
    }
    public void addEdge(int src, int dest){
        graph.get(src).add(dest);
        graph.get(dest).add(src);
    }
    public void removeEdge(int src, int dest){
        List<Integer> srcList = graph.get(src);
        List<Integer> destList = graph.get(dest);
    
        if (srcList != null && destList != null) {
            srcList.remove(Integer.valueOf(dest));
            destList.remove(Integer.valueOf(src));
        }
    }
    public void removeVertex(int vertex) {
        if(graph.containsKey(vertex)){
            graph.remove(vertex);
            return ;
        }
        System.out.println("vertex does not exist");
    }
    
    public void print() {
       
        System.out.println(graph);
    }
    public static void main(String[] args) {
        practice prc = new practice();
        prc.addVertex(1);
        prc.addVertex(3);
        prc.addVertex(4);
        prc.addVertex(2);
        prc.addVertex(0);
        prc.addEdge(1, 3);
        prc.print();
        // prc.removeEdge(1, 3);
        prc.removeVertex(0);
        prc.print();
        
    }
    
}

