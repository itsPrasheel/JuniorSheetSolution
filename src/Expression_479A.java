import java.util.*;
public class Expression_479A {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        System.out.println(Math.max(a+b+c,Math.max(a*b*c,Math.max((a+b)*c,Math.max(a+b*c,Math.max(a*b+c,a*(b+c)))))));
    }
}
