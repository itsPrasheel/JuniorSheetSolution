import java.io.*;
import java.util.*;

public class BuyAShovel_732A {
    public static void main(String[]args) throws IOException {
        boolean flag=false;
        FastScanner scan =new FastScanner();
        int priceOfShowel=scan.nextInt();
        int diffCoin=scan.nextInt();
        if(priceOfShowel==diffCoin)
            System.out.println(1);
//        System.out.println(priceOfShowel+" "+diffCoin);
        else {
            for (int i = 1; i <= 9; i++) {
                if ((priceOfShowel * i - diffCoin) % 10 == 0 || (priceOfShowel * i) % 10 == 0) {
                    System.out.println(i);
                    flag = true;
                    break;
                }
            }
            if(!flag)
                System.out.println("10");
        }

    }
    static class FastScanner {
        StringTokenizer tok = new StringTokenizer("");
        BufferedReader in;

        FastScanner()  {
            in = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() throws IOException {
            while (!tok.hasMoreElements())
                tok = new StringTokenizer(in.readLine());
            return tok.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }
}}
