package sorting_1;

public class InsertionSort {

    public static void insertionSort(int[] arr){

        for(int i = 0; i< arr.length;i++){
           for(int j = i;j>=1;j--){
              if(arr[j]<arr[j-1]){
                  int temp = arr[j];
                  arr[j] = arr[j-1];
                  arr[j-1] = temp;
              }
           }
        }

    }
    public static void display(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
        public static void main(String[] args){
            int[] arrIS = {13,46,24,52,20,9};
            display(arrIS);
            insertionSort(arrIS);
            System.out.println("\n------------------------\n");
            display(arrIS);
        }

}
