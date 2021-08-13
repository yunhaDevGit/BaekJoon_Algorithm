package Search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FindPrimeNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = 0;
        int num = 0;

        for(int i=0;i<N;i++) {
            num = Integer.parseInt(st.nextToken());
            if(isPrimeNumber(num))
                count++;
        }
        System.out.println(count);
    }

    static boolean isPrimeNumber(int num){
        if(num==1||(num%2==0 && num!= 2))
            return false;

        for(int i=3;i<num;i+=2){
            if(num%i==0)
                return false;
        }
        return true;
    }
}
