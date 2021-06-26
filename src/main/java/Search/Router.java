package Search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Router {

    static int N,M,maxDistance;
    static List<Integer> house;
    public static void main(String[] args) throws IOException {
        System.out.println("input");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        house = new ArrayList<>();
        for(int i=0;i<N;i++){
            house.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(house);

        int low = 0;
        int high = N-1;
        maxDistance = house.get(0);

        while(low<=high){
            int mid = (low+high)/2;
            if(distance(mid,M)){
                low = mid + 1;
                maxDistance = Math.max(mid, maxDistance);
            }else{
                high = mid - 1;
            }
        }
        System.out.println(maxDistance);
    }

    public static boolean distance(int mid, int M){
        int count = M-2;
        int prev = house.get(0);
        for(int i=0;i<house.size();i++){
            if(house.get(i) - prev >= mid){
                count--;
                prev = house.get(i);
            }
        }
        return count < 0 ? true : false;
    }
}
