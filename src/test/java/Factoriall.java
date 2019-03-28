package PACKAGE_NAME;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Factoriall {
    public static void main (String[] args) {

        static int factcalculate (int n){
            int resalt = 1;
            for (int i = 1; i < n;i++ ){
                resalt = resalt*i;
            }
            System.out.println(resalt);
        }
        //Stream<Integer> fact = new
        public long factUsingStreams(int n){
            return LongStream.rangeClosed(1,n)
                    .reduce(1(long x, long y) -> x*y);
        }

    }
}
