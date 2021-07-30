package implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PCRoomPartTime {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] seat = (br.readLine()).split(" ");
        int[] reserved = new int[100];
        Arrays.fill(reserved, 0);
        int count = 0;
        int desiredSeat;
        for(int i=0;i<N;i++){
            desiredSeat = Integer.parseInt(seat[i])-1;
            if(reserved[desiredSeat]==0)
                reserved[desiredSeat] = 1;
            else
                count++;
        }
        System.out.println(count);
    }
}
