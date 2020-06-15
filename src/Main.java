import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int k,n,w,value;
        Scanner scan=new Scanner(System.in);
        k=scan.nextInt();
        n=scan.nextInt();
        w=scan.nextInt();
        value=k*w*(w+1)/2-n;
        System.out.println(value>0?value:0);
    }
}
