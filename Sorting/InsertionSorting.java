
/*
Insertion Sorting Asccending order
*/

public class Main {
  public static void main(String[] args) {
    int array[] = {5,7,8,4,2};
    for(int i = 1 ; i < array.length ; i++){
      int current = array[i];
      int key = i - 1;
      while(key >=0 && current < array[key]) {
        
        array[key+1] = array[key];
        key--;
      }
      array[key+1] = current;
      
    }
    for(int arr : array){
          System.out.print(arr + " ");
      }
  }
}

/*
Time complexity worst case O(n^2)
*/
