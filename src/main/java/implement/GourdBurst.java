package implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GourdBurst {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int sum = 0;

        sum = (K+1)*K/2;


        if(sum>N)
            System.out.println(-1);
        else if((N-sum)%K==0)
            System.out.println(K-1);
        else
            System.out.println(K);
    }
}
