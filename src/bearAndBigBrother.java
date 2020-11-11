import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bearAndBigBrother {
    public static void main(String[] args) {

        FastReader s = new FastReader();
        int a = s.nextInt();
        int b = s.nextInt();
//        System.out.println(((float)b/(float)a));
        double temp =Math.log((float)b/(float)a)/Math.log(1.5);
        if(Math.ceil(temp)==temp)
            System.out.println((int)(Math.ceil(Math.log((float)b/(float)a)/Math.log(1.5)))+1);
        else
            System.out.println((int)(Math.ceil(Math.log((float)b/(float)a)/Math.log(1.5))));

//        System.out.println((int)(Math.ceil(Math.log((float)b/(float)a)/Math.log(1.5))));
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
