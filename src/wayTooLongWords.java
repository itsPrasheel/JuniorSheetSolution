import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class wayTooLongWords {

    public static void main(String[] args) {
        FastReader s = new FastReader();
        int l = s.nextInt();
        String str;
        int len=0;
        for(int i=0;i<l;i++)
        {
            str = s.nextLine();
            if(str.length()>10)
            {
                len = str.length()-2;
                System.out.println(str.charAt(0)+""+ len+ "" +str.charAt(str.length()-1));
            }
            else {
                System.out.println(str);
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
