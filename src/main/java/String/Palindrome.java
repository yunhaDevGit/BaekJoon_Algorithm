package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Palindrome {
    public static void main(String[] args) throws IOException {
        System.out.println("input");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>(N);

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0;i<N;i++){
            list.add(Integer.parseInt(st.nextToken()));
        }

        int M = Integer.parseInt(br.readLine());
        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            int index1 = Integer.parseInt(st.nextToken())-1;
            int index2 = Integer.parseInt(st.nextToken());
            List<Integer> string1 = new ArrayList<>(list.subList(index1,index2));
            String str1 = string1.toString();
            Collections.reverse(string1);
            String str2 = string1.toString();
            if(str1.equals(str2))
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}
