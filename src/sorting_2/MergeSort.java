package sorting_2;
// 0 1 2 3 4 5 6 7 8
//{1,2,3,4,5,6,7,8,9}
//j--> 4
public class MergeSort {

    public static void merging(int[] arr,int i,int j,int k){
        int lengthArrayLeft = j - i +1;
        int lengthArrayRight = k-j;

        int[] arrLeft = new int[lengthArrayLeft+1];
        int[] arrRight = new int[lengthArrayRight+1];

        for(int l=0;l<lengthArrayLeft;l++){
            arrLeft[l] = arr[i+l];
        }
        arrLeft[lengthArrayLeft] = Integer.MAX_VALUE;

        for (int l=0;l<lengthArrayRight;l++){
            arrRight[l] = arr[j+1+l];
        }
        arrRight[lengthArrayRight] = Integer.MAX_VALUE;

        for(int l = i;l<=k;l++){
            if (arrLeft[i] < arrRight[j]){
                arr[l] = arrLeft[i];
                i++;
            }else {
                arr[l] = arrRight[j+1];
                j++;
            }
        }




    }

    public static void mergeSort(int[] arr, int i, int k){
        int j = 0;
        if(i<k){
            j = (i+k)/2;

        }else return;
        mergeSort(arr,i,j);
        mergeSort(arr,j+1,k);
        merging(arr,i,j,k);
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
