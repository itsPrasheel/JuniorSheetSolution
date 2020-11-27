import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class uniqueBidAuction {

    public static void main(String[] args) {
        FastReader s = new FastReader();
        int t = s.nextInt();
        for(int z=0;z<t;z++)
        {
            int flag = 0;
            int n = s.nextInt();
            int [] arr = new int[n+1];
            int [] arr2 = new int[n+1];
            int temp;
            for(int i=0;i<n;i++)
            {
                temp = s.nextInt();
                ++arr[temp];
                arr2[temp]=i;
            }
            for(int i=1;i<=n;i++)
            {
                if(arr[i]==1)
                {
                    flag = 1;
                    System.out.println(arr2[i]+1);
                    break;
                }
            }
            if(flag==0)
                System.out.println("-1");

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
