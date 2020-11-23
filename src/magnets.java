import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class magnets {
        public static void main(String[] args) {
            FastReader s = new FastReader();
            int reps=s.nextInt();
            int count=1;
            int prev = s.nextInt();
            int coming;
            if(reps>1)
            {
                for(int i=1;i<reps;i++)
                {
                    coming = s.nextInt();
//                    System.out.println(prev +" "+ coming +" "+count+ (prev != coming) +"\n");

                    if(prev != coming)
                        ++count;
                    prev = coming;
                }
            }
            System.out.println(count);

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


