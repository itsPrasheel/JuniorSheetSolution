import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class shaassAndOskols {
    public static void main(String[] args) {
        FastReader s = new FastReader();
        int noOfWires = s.nextInt();
        int[] wireCount = new int[noOfWires];
        for (int i=0;i<noOfWires;i++)
            wireCount[i]=s.nextInt();
        int x,y;
        int m= s.nextInt();
        for(int i=1;i<=m;i++)
        {
            x= s.nextInt();
            x--;
            y= s.nextInt();
//            int a = wireCount[x];
            if(x<(noOfWires-1))
                wireCount[x+1] = wireCount[x+1] + wireCount[x] - y;
            if(x>0)
                wireCount[x-1] += y-1;
            wireCount[x] = 0;
//            System.out.println(x+" "+y);
        }
        for (int i=0;i<noOfWires;i++)
            System.out.println(wireCount[i]);

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
