package sorting_1;

public class BubbleSort {

//    compares in pair
    public static void bubbleSort(int[] arr){
        int countOfIteration = 0;
    for (int j =0; j<arr.length;j++){
        int numberOfSwaps = 0;
        for (int i =0;i<arr.length-j-1;i++){
            if (arr[i]>arr[i+1]){
//                swap
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                numberOfSwaps++;
            }
            countOfIteration++;
        }
        if (numberOfSwaps == 0){
            System.out.println("\n\n\nNumber of iteration: "+countOfIteration+"\nno swap is needed further");
            break;
        }
    }



    }
    public static void display(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
    public static void main(String[] args) {
        int[] arrBS = {23,11,9,8,7,6,4,3,1};
        display(arrBS);
        bubbleSort(arrBS);
        System.out.println("\n------------------------\n");
        display(arrBS);
    }
}

//The time complexity of Bubble Sort is:
//
//Best Case: O(n) — This happens when the array is already sorted. In this case, Bubble Sort can stop
// early if no swaps are made during the first pass.

//Average Case: O(n^2) — This happens when the elements are in random order and require multiple swaps.

//Worst Case: O(n^2) — This occurs when the array is sorted in reverse order, requiring the maximum
// number of swaps.
