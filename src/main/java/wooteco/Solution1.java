package wooteco;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int money = Integer.parseInt(br.readLine());
        int count[] = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
        int answer[] = new int[9];
        int countLength = 9;
        for(int i=0;i<countLength;i++){
            answer[i] = money/count[i];
            money = money%count[i];
        }

        System.out.println(Arrays.toString(answer));

    }
}
