
/*
Selection Sorting Ascending order
*/

public class Main {
  public static void main(String[] args) {
    int array[] = {5,7,8,4,2};
    for(int i = 0 ; i < array.length -1 ; i++){
      int smallest = i;
      for(int j = i+1; j < array.length; j++){
        if(array[smallest] > array[j]) {
          smallest = j;
        }
        
      }
      int temp = array[smallest];
      array[smallest] = array[i];
      array[i] = temp;
      
    }
    for(int arr : array){
          System.out.print(arr + " ");
      }
  }
}

/*
Time complexity worst case O(n^2)
/*
