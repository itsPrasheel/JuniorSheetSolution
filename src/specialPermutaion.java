import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class specialPermutaion {

    public static void main(String[] args) {
        FastReader s = new FastReader();
        int n = s.nextInt();
        int [] arr = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]= s.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                for(int j=arr[i];j>0;j--)
                {
                    System.out.print(j+" ");
                }
                System.out.println();
            }
            else
            {
                for(int j=2;j<=arr[i];j++)
                {
                    System.out.print(j+" ");
                }
                System.out.println(1);
            }
        }
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
