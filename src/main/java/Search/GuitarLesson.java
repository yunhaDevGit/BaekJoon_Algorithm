package Search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GuitarLesson {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int numCount = Integer.parseInt(st.nextToken()); // 레슨 수
        int bluRayCount = Integer.parseInt(st.nextToken()); // 블루레이 수
        int arr[] = new int[numCount];
        int sum = 0;
        int low=0;
        int high, mid;

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<numCount;i++){
            arr[i] = Integer.parseInt(st.nextToken());
            sum+=arr[i];
            low = Math.max(low, arr[i]);
        }
        high = sum;

        while(low<=high){
            int tempSum = 0;
            int count = 0;
            mid = (low+high)/2;

            for (int i=0;i<numCount;i++){
                if(tempSum+arr[i]>mid){
                    tempSum=0;
                    count+=1;
                }
                tempSum += arr[i];
            }

            if(tempSum>0)
                count++;

            if(count<=bluRayCount)
                high = mid - 1;
            else
                low = mid + 1;
        }

        System.out.println(low);

    }
}
