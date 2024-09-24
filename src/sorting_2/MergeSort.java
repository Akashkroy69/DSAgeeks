package sorting_2;
// 0 1 2 3 4 5 6 7 8
//{1,2,3,4,5,6,7,8,9}
//j--> 4
public class MergeSort {

    public static void merging(int[] arr,int startI,int midI,int lastI){
        int lengthArrayLeft = midI - startI +1;
        int lengthArrayRight = lastI-midI;

        int[] arrLeft = new int[lengthArrayLeft+1];
        int[] arrRight = new int[lengthArrayRight+1];

        for(int l=0;l<lengthArrayLeft;l++){
            arrLeft[l] = arr[startI+l];
        }
        arrLeft[lengthArrayLeft] = Integer.MAX_VALUE;

        for (int l=0;l<lengthArrayRight;l++){
            arrRight[l] = arr[midI+1+l];
        }
        arrRight[lengthArrayRight] = Integer.MAX_VALUE;

        int i =0,j =0;
        for(int l = startI;l<=lastI;l++){
            if (arrLeft[i] < arrRight[j]){
                arr[l] = arrLeft[i];
                i++;
            }else {
                arr[l] = arrRight[j];
                j++;
            }
        }
    }

    public static void mergeSort(int[] arr, int startI, int lastI){
        if(startI>=lastI){
            return;
        }
        int midI = (startI+lastI)/2;
        mergeSort(arr,startI,midI);
        mergeSort(arr,midI+1,lastI);
        merging(arr,startI,midI,lastI);
    }

    public static void display(int[] arr){
        for (int j : arr) {
            System.out.print(j+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {23,1,43,28,66,8,39,75,49,22,48};
        mergeSort(arr,0,arr.length-1);
        System.out.println("\n------------------------\n");
        display(arr);
    }
}
