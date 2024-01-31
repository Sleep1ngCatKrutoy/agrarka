//4
import java.util.Scanner;
public class sdfggsd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("введите a");
        int a = scan.nextInt();
        System.out.println("введите b");
        int b= scan.nextInt();
        System.out.println("введите c");
        int c= scan.nextInt();
        System.out.println("введите d");
        int d= scan.nextInt();
        int q =a%2;
        int w =b%2;
        int e =c%2;
        int t =d%2;
        int r = 0;
        if(q<=0){r+=1;};
        if(w<=0){r+=1;};
        if(e<=0){r+=1;};
        if(t<=0){r+=1;};
        System.out.println("всего четных чисел - "+r);
    }
}