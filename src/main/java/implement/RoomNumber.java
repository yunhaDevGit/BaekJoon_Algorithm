package implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;

public class RoomNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String numString[] = br.readLine().split("");
        int num = numString.length;
        int count69 = 0;
        int set = 0;
        HashMap<Integer, Integer> numMap = new HashMap<>();
        for(int i=0;i<=9;i++){
            numMap.put(i,0);
        }

        for(int i=0;i<num;i++){
            if("6".equals(numString[i])||"9".equals(numString[i]))
                count69++;
            else{
                int count = numMap.get(Integer.parseInt(numString[i]));
                numMap.put(Integer.parseInt(numString[i]),count+1);
            }
        }

        int maxCount = Collections.max(numMap.values());

        if(count69%2==0)
            set = count69/2;
        else
            set = count69/2 + 1;

        if(maxCount>set)
            System.out.println(maxCount);
        else
            System.out.println(set);
    }
}
