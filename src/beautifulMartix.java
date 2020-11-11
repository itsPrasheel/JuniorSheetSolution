import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class beautifulMartix {
    public static void main(String[] args) {
        int temp;
        FastReader s = new FastReader();
        int rowNum=0;
        int colNum=0;
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
               if(s.nextInt()==1)
               {
                   rowNum=i;
                   colNum=j;
                   break;
               }
            }
        }
        System.out.println(Math.abs(2-rowNum)+Math.abs(2-colNum));

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
