package pattern;

public class RotatedTriangle {
    public static void nStarTriangle(int n) {
        for (int i = 0; i<n;i++){
            for (int j =0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n; i>0;i--){
            for (int j =0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        nStarTriangle(50);
    }
}
