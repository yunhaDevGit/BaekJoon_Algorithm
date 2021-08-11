package implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class RotationQueue {
    private static List<Integer> numArray;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int count = 0;

        int element[] = new int[M];
        numArray = new ArrayList<>();

        for(int i=0;i<N;i++)
            numArray.add(i+1);

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<M;i++) {
            element[i] = Integer.parseInt(st.nextToken());
            count += getElementCount(element[i]);
        }
        System.out.println(count);
    }

    static int getElementCount(int element){
        int numArrayLength = numArray.size();
        int index = 0;
        int count = 0;
        int num = 0;

        for(int i=0;i<numArrayLength;i++){
            if(element==numArray.get(i)){
                index = i;
                break;
            }
        }

        if(index>numArrayLength/2){
            for(int i=numArrayLength-1;i>=index;i--){
                count++;
                num = numArray.get(numArrayLength-1);
                numArray.remove(numArrayLength-1);
                numArray.add(0, num);
            }
        } else {
            for(int i=0;i<index;i++){
                count++;
                num = numArray.get(i);
                numArray.remove(i);
                numArray.add(num);
            }
        }

        numArray.remove(0);

        return count;
    }
}
