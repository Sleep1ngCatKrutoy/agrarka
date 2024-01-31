import java.util.Arrays;
import java.util.Scanner;

public class t7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("введите a");
        double a = scan.nextDouble();
        System.out.println("введите b");
        double b = scan.nextDouble();
        System.out.println("введите c");
        double c = scan.nextDouble();
        double[] arr = new double[3];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
        Arrays.sort(arr);
        double q = arr[arr.length-1] + arr[arr.length-2];
        System.out.println("сумма двух максимальных значений "+q);
        }
    }
