import java.util.*;
import java.lang.*;

public class spoj_ASP {

        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner s = new Scanner(System.in);
            long n = s.nextInt();

            long[] arr = new long[(int)n];
            long max =0 ;
            for(long i=0;i<n;i++)
            {
                arr[(int)i]= s.nextInt();
                if(arr[(int)i]>max)
                    max = arr[(int)i];
            }
            long[] f = new long[(int)(max+2)];
            f[1]=1;
            for(long i=2;i<=max;i++)
            {
                if(f[(int)i]==0)
                {
                    f[(int)i]=i;

                    long j=2;
                    while(i*j<=max)
                    {
                        f[(int)(i*j)]=i;
                        j++;
                    }
                }
            }
//            for(int i=0;i<=max;i++)
//            {
//                System.out.println(f[i]);
//            }
            long []a = new long[(int)max+2];
            for(long i=2;i<=max;i++)
            {
                a[(int)i] = a[(int)i-1] + f[(int)i];
            }

            for(int i=0;i<n;i++)
            {
                System.out.println(a[(int)arr[i]]);
            }
        }
    }
