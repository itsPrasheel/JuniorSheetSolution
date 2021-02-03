import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class antonAndLetters {

    public static void main(String[] args) {
        FastReader s = new FastReader();
        String str = s.nextLine();
        String str2 = str.substring(1,str.length() -1);
        int [] arr = new int[256];
//        System.out.println(str2);
        for (int i=0;i<str2.length();i=i+3)
        {
            ++arr[str2.charAt(i)];
        }
        int count =0;
        for (int i=0;i<256;i++)
        {
            if (arr[i]>0)
            {
                ++count;
//                System.out.println(arr[i]);
            }
        }
        System.out.println(count);
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
