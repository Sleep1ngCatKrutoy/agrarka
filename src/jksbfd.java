//5
import java.util.Scanner;
public class jksbfd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("введите a");
        int a = scan.nextInt();
        System.out.println("введите b");
        int b= scan.nextInt();
        System.out.println("введите c");
        int c= scan.nextInt();
        int q =a%3;
        int w =b%3;
        int e =c%3;
        int r = 0;
        if(q == 0){r+=a;};
        if(w == 0){r+=b;};
        if(e == 0){r+=c;};
        System.out.println("сумма чисел кратных 3 - "+r);
    }
}