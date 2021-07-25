package implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class RollCake {
    static int audieceGetCakePieceCount[];
    static int cakePiece[];

    static void distributeCake(int audienceNum, int start, int end){
        int count = 0;
        for(int i=start;i<=end;i++){
            if(cakePiece[i]==0) {
                cakePiece[i] = audienceNum;
                count++;
            }
        }
        audieceGetCakePieceCount[audienceNum] = count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int cakeSize = Integer.parseInt(br.readLine());
        int audienceNums = Integer.parseInt(br.readLine());

        cakePiece = new int[cakeSize+1];
        Arrays.fill(cakePiece, 0);
        audieceGetCakePieceCount = new int[audienceNums+1];

        for(int i=1;i<audienceNums+1;i++){
            st = new StringTokenizer(br.readLine());
            distributeCake(i, Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        int max = 0;
        int num = 0;
        for(int i=1;i<audienceNums+1;i++){
            if(audieceGetCakePieceCount[i]>max){
                max = audieceGetCakePieceCount[i];
                num = i;
            }
        }

        System.out.println(max);
        System.out.println(num);
    }
}
