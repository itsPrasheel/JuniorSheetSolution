import java.util.*;
import java.io.*;

public class vanyaAndFence {
    public static void main(String[] args) {
    FastReader s = new FastReader();
    int n = s.nextInt();
    int hLim = s.nextInt();
    int temp;
    int width =0;
    for(int i=0;i<n;i++) {
        temp = s.nextInt();
        if(temp > hLim) width+=2;

        else width+=1;
    }
        System.out.println(width);
    }
    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
}