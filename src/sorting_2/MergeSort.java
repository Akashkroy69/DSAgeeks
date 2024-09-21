package sorting_2;

public class MergeSort {

    public static void merging(int[] arr,int i,int j,int k){
        int lengthArrayLeft = j - i +1;
        int lengthArrayRight = k- j +2;

        int[] arrLeft = new int[lengthArrayLeft];
        int[] arrRight = new int[lengthArrayRight];

        for (int l=i;l<j;l++){
            arrRight[l] = arr[l];
        }

        for (int l=0;l<lengthArrayLeft;l++){
            arrLeft[l] = arr[l];
        }



    }

    public static void mergeSort(int[] arr, int i, int k){
        int j = 1;
        if(i<k){
            j = (i+k)/2;
        }
        mergeSort(arr,i,j);
        mergeSort(arr,j+1,k);
    }
}
