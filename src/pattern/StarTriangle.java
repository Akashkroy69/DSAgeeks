package pattern;

public class StarTriangle {
        public static void nStarTriangle(int n) {

            // int n = sc.nextInt();
            for(int i = 0; i<= n;i++){
                for(int j =0; j< n-i;j++){
                    System.out.print(" ");
                }
                for(int k = 0; k <= i*2;k++)
                    System.out.print("*");
                System.out.println("");
            }

        }

        public static void main(String[] args) {
            // System.out.println("Try programiz.pro");
            nStarTriangle(5);
        }

}
