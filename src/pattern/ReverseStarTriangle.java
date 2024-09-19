package pattern;
import java.util.*;
public class ReverseStarTriangle {

        public static void nStarTriangle(int n) {

            // int n = sc.nextInt();
            for(int i = n-1; i>= 0;i--){
                for(int j =0; j< n-i-1;j++){
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
