import java.util.Scanner;

public class NewYearandHurry_750A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int idealTime = 5 * n * (n + 1) / 2;
        if (idealTime <= 240 - k)
            System.out.println(n);
        else
            System.out.println((int) Math.floor((-1 + Math.sqrt(1 + 1.6 * (240 - k))) / 2));

    }
}
