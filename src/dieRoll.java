import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class dieRoll {

    public static void main(String[] args) {
        FastReader s = new FastReader();
        int a = s.nextInt();
        int b = s.nextInt();
        int prob = Math.max(a,b);
        prob = 6-prob+1;
//        prob = prob /
        if(prob == 6)
        System.out.println("1/1");
        else if (prob % 3 ==0)
        {
//            prob = prob/3;
            System.out.println("1/2");
        }
        else if(prob % 2 == 0)
        {
            prob = prob /2;
//            int val =
            System.out.println(prob+"/3");
        }
        else
            System.out.println(prob+"/6");


//        System.out.println();
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
