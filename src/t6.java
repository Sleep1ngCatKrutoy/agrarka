import java.util.Scanner;

public class t6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("введите a");
        double a = scan.nextDouble();
        System.out.println("введите b");
        double b = scan.nextDouble();
        System.out.println("введите c");
        double c = scan.nextDouble();
        double min = a;
        double max = a;
        double[] arr = new double[3];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("максимальное значение - " + max);
        System.out.println("минимальное значение - " + min);
    }
}