import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class helpfulMaths {

    public static void main(String[] args) {
        FastReader s = new FastReader();
        String str = s.nextLine();
        int [] arr = new int[3];
        for(int i=0;i<str.length();i=i+2)
        {
            if(str.charAt(i)=='1')
                ++arr[0];
            else if(str.charAt(i)=='2')
                ++arr[1];
            else
                ++arr[2];
        }
//        if(arr[0]>1)
//        {
//            System.out.print();
//            --arr[0]
//        }
    boolean flag = false;


        for(int i=0;i<3;i++)
        {
            while (arr[i]!=0)
            {
                --arr[i];

                if(flag==false)
                {
                    System.out.print((i+1));
                    flag = true;
                    continue;
                }
                System.out.print("+"+(i+1));
                flag = true;
            }
        }
    }



    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
