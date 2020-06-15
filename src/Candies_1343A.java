import java.util.*;
import java.io.*;

public class Candies_1343A {
    public static void main(String[] args) throws IOException {
        FastScanner s=new FastScanner();
        int j=0;
        j++;
        int t;
        t = s.nextInt();
        for(int i=0;i<t;i++)
        {
            int total=s.nextInt();
            int val=3;
            while(true)
            {
                if(total%val==0)
                {
                    System.out.println(total/val);
                    break;
                }
            val=2*val+1;
            }
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
    }
}
