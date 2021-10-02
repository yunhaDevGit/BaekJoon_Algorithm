package implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class GoodSection {
    static int L;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        L = Integer.parseInt(br.readLine());
        String s = br.readLine();
        String n = br.readLine();

        if(s.contains(n)) {
            System.out.println(0);
            return;
        }

        String[] S = s.split(" ");

        int[] array = new int[L];
        for(int i=0;i<L;i++){
            array[i] = Integer.parseInt(S[i]);
        }

        Arrays.sort(array);

        getSolution(array, Integer.parseInt(n));
    }

    private static void getSolution(int[] array, int n){
        int answer = 0;

        for(int i=0;i<L;i++){
            if(array[i]<n&&array[i+1]>n){
                for(int j=array[i]+1;j<n;j++){
                    answer += (array[i+1]-n);
                }
                answer += array[i+1]-1-n;
                System.out.println(answer);
                return;
            }
        }
    }
}
