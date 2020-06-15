import java.util.*;
import java.io.*;
public class VasyaAndSocks_460A {
    public static void main(String[] args) throws IOException {
        FastScanner s = new FastScanner();
        int n = s.nextInt()-1;
        int m = s.nextInt();
        int i=1;
        while (true)
        {
            if(i%m==1)
                ++n;
            if(n==0)
            {
                System.out.println(i-1);
                break;
            }
            --n;
            ++i;

        }
    }

    static class FastScanner {
        StringTokenizer tok = new StringTokenizer("");
        BufferedReader in;

        FastScanner() {
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
    }
}