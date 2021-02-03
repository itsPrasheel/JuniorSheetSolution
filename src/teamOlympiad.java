import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class teamOlympiad {
    public static void main(String[] args) {

        FastReader s = new FastReader();
        int n = s.nextInt();
        int []arr = new int[4];
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        ArrayList<Integer> arr3 = new ArrayList<Integer>();

        for(int i=0;i<n;i++)
        {
            int temp = s.nextInt();
            ++arr[temp];
            if(temp==1)
            {
                arr1.add(i+1);
            }
            else if(temp==2)
                arr2.add(i+1);
            else
                arr3.add(i+1);
        }

        int count =Math.min(arr[1],Math.min(arr[2],arr[3]));
        System.out.println(count);
        for(int i=0;i<count;i++)
        {
            System.out.println(arr1.remove(0)+" "+arr2.remove(0)+" "+arr3.remove(0));
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
