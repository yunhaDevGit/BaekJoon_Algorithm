package Search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindFraction {

    static void whatFraction(int num) {
        int cnt=0;
        int n = 0;
        while (true) {
            n++;
            cnt +=n;
            if(cnt>=num) {
                if(n%2==0) {
                    System.out.println(num-cnt+n+"/"+(cnt-num+1));
                }else {
                    System.out.println((cnt-num+1)+"/"+(num-cnt+n));
                }
                break;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        whatFraction(n);
    }
}
