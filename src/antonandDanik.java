import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class antonandDanik {

    public static void main(String[] args) {
        FastReader s = new FastReader();
        int gamesPlayed = s.nextInt();
        String winner = s.nextLine();
        int danikCount = 0 ;
        int antonCount = 0 ;
        for(int i=0;i<gamesPlayed;i++)
        {
            if(winner.charAt(i) == 'D')
                ++danikCount;
            else
                ++antonCount;
        }

        if(danikCount > antonCount)
            System.out.println("Danik");
        else if (danikCount < antonCount)
            System.out.println("Anton");
        else
            System.out.println("Friendship");
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
