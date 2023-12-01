
/*
Bubble Sorting Descending order
*/

public class Main {
  public static void main(String[] args) {
    int array[] = {5,7,8,4,2};
    for(int i = 0 ; i < array.length -1 ; i++){
      for(int j = 0; j < array.length - i - 1; j++){
        if(array[j] < array[j+1]){
          int temp = array[j];
          array[j] = array[j+1];
          array[j+1] = temp;
        }
      }
      
    }
    for(int arr : array){
          System.out.print(arr + " ");
      }
  }
}


/*
Time Complexity Worst case O(n)
*/
