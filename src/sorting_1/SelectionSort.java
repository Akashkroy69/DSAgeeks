package sorting_1;

public class SelectionSort {

    public static void selectAndSort(int[] arr){
// assume the first index is sorted
        int iterationCount = 0;
        int sortingIndex;
        for(int j = 0;j<arr.length-1;j++){
// assume the sorted index has the smallest element which most likely is not true.
            int smallestElementIndex = sortingIndex = j;
// start comparing from the next to find the index that has the smallest element
            for(int i =j+1;i<arr.length;i++){
                if(arr[smallestElementIndex]>arr[i]){
                    smallestElementIndex = i;
                }
                iterationCount++;
            }
// swapping the smallest element with the sorting index
            int temp = arr[sortingIndex];
            arr[sortingIndex] = arr[smallestElementIndex];
            arr[smallestElementIndex] = temp;
// increment the sorting index in each phase as in each
// phase the smallest element is sorted
            sortingIndex++;
        }

        System.out.println("\n\nnumber of elements: "+arr.length+"\n\niteration count : "+iterationCount);
    }

    public static void display(int[] arr){
        for (int j : arr) {
            System.out.print(j+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {23,11,9,8,7,6,4,3,1};
        display(arr);
        selectAndSort(arr);
        System.out.println("\n------------------------\n");
        display(arr);
    }
}

//Time complexity for selection sort: O(N2), (where N = size of the array), for the best, worst, and average cases.
