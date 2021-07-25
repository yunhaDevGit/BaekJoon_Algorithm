package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ReverseAddition {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String[] firstNums = (st.nextToken()).split("");
        String[] secondNums = (st.nextToken()).split("");

        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();
        int firstNumLength = firstNums.length;
        int secondNumLength = secondNums.length;

        for(int i=firstNumLength;i>0;i--){
            sb1.append(firstNums[i-1]);
        }
        for(int i=secondNumLength;i>0;i--){
            sb2.append(secondNums[i-1]);
        }

        int firstNum = Integer.parseInt(String.valueOf(sb1));
        int secondNum = Integer.parseInt(String.valueOf(sb2));

        String result = String.valueOf(firstNum+secondNum);
        String[] results = result.split("");
        StringBuffer sb3 = new StringBuffer();
        int resultLength = result.length();
        for(int i=resultLength;i>0;i--){
            sb3.append(results[i-1]);
        }

        System.out.println(Integer.parseInt(String.valueOf(sb3)));
    }
}
