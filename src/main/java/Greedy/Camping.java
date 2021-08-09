package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Camping {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int L, P, V;
        int index = 0;
        StringBuilder sb = new StringBuilder("");

        while(true){
            index++;
            L = Integer.parseInt(st.nextToken());
            P = Integer.parseInt(st.nextToken());
            V = Integer.parseInt(st.nextToken());
            if(L==0 && P==0 && V==0)
                break;
            sb.append("Case ").append(index).append(": ");
            sb.append(dayCount(L, P, V))
            .append("\n");
            st = new StringTokenizer(br.readLine());
        }
        System.out.println(sb);

    }
    static int dayCount(int L, int P, int V){
        int remain = 0;
        if(V%P>=L)
            remain =  L*(V/P) + L;
        else
            remain =  L*(V/P) + V%P;
        return remain;
    }
}
