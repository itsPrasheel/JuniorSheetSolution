import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class games {
    public static void main(String[] args) {
        FastReader s = new FastReader();
        int n  = s.nextInt();
        int [] arr1 = new int[100];
        int [] arr2 = new int[100];
        for(int i=0;i<n;i++)
        {
            ++arr1[s.nextInt()-1];
            ++arr2[s.nextInt()-1];
        }
        int total = 0;
        for(int i=0;i<100;i++)
        {
            total = total + arr1[i]*arr2[i];
        }
        System.out.println(total);
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
                catch (IOException e)
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
