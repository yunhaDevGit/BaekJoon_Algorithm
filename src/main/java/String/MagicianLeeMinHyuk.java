package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MagicianLeeMinHyuk {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        String [][] card = new String[R*2][C*2];
        String [] strings = new String[R*2];
        String input;


        for(int i=0;i<R;i++){
            input = br.readLine();
            strings[i] = input + new StringBuilder(input).reverse().toString();
            card[i] = (strings[i]).split("");
        }
        for(int i=R;i<R*2;i++){
            strings[i] = strings[R*2-i-1];
            card[i] = (strings[i]).split("");
        }

        st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken()) - 1;
        int B = Integer.parseInt(st.nextToken()) - 1;
        if(card[A][B].equals("."))
            card[A][B] = "#";
        else if(card[A][B].equals("#"))
            card[A][B] = ".";

        for (int i=0;i<R*2;i++){
            for(int j=0;j<C*2;j++)
                System.out.print(card[i][j]);
            System.out.println();
        }

    }
}
