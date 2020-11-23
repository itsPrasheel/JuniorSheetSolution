import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boyOrGirl {
    public static void main(String[] args) {
        FastReader s = new FastReader();
        String str = s.nextLine();
        boolean []alpha = new boolean[26];
        int count = 0;
//        for(int i=0;i<str.length();i++)
//        {
//            System.out.print(alpha[i]+" ");
//        }
        for(int i=0;i<str.length();i++)
        {
            if(alpha[str.charAt(i)-'a']==false)
            {
                alpha[str.charAt(i)-'a']=true;
            }
        }
//        for(int i=0;i<str.length();i++)
//        {
//            System.out.print(alpha[i]+" ");
//        }
        for(int i=0;i<26;i++)
        {
            if(alpha[i]==true)
                ++count;
        }
//        System.out.println(count);
        if(count%2==0)
            System.out.println("CHAT WITH HER!");
        else
            System.out.println("IGNORE HIM!");

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
