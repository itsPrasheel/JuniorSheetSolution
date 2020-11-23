import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class policeRecruits {

    public static void main(String[] args) {
        FastReader s = new FastReader();
        int policeCount=0;
        int crime=0;
        int val;
        int n = s.nextInt();
        for(int i=0;i<n;i++)
        {
            val= s.nextInt();
            if(val<0)
            {
                if(policeCount==0)
                {
                    ++crime;
                }
                else {
                    --policeCount;
                }
            }
            else {
                policeCount+=val;
            }
//            ++crime;
        }
        System.out.println(crime);
//        for()
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
