package mathematics;

public class AreaManipulation {

    static int areaChange(double l, double b, double p, double q) {
        // code here
        double oldArea = (l * b);
        double newArea = (l + (l * p / 100)) * (b + (b * q / 100));

        return Double.compare(newArea, oldArea);

        //return 1;
    }

    public static void main(String[] args) {
        double l = 10;
        double b = 10;
        double p = -20;
        double q = 25;
        System.out.println(l + (p / 100));
        System.out.println(b + (q / 100));
        double oldArea = (l * b);
        double newArea = (l + (l * (p / 100))) * (b + (b * (q/ 100)));
        System.out.println(oldArea);
        System.out.println(newArea);

        System.out.println(areaChange(10, 10, -20, 25));
    }
}
