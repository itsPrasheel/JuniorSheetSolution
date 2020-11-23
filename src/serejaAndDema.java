import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class serejaAndDema {
    public static void main(String[] args) {
        FastReader s = new FastReader();
        int n = s.nextInt();
        int [] arr = new int [n];
        for(int i=0;i<n;i++)
        {
            arr[i]= s.nextInt();
//            System.out.println("Input Done");
        }
//        int serej=0,dema=0;
        int[] sum = new int[2];
        int i=0,j=arr.length-1;
        int flag = 0;
//        System.out.println("Input Done");
        while(i<=j)
        {
            if(arr[i]>arr[j])
            {
                sum[flag]+=arr[i];
                i++;
            }
            else
            {
                sum[flag]+=arr[j];
                j--;
            }
            flag = 1-flag;

        }
        System.out.println(sum[0]+" "+sum[1]);

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
