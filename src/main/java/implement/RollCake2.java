package implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class RollCake2 {
    static int audieceGetCakePieceCount[]; // 청중이 갖게 된 케이크 길이
    static int cakePiece[];
    static int start, end;

    static void distributeCake(int audienceNum){
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
        int cakeSize = Integer.parseInt(br.readLine()); // 케이크 길이
        int audienceNums = Integer.parseInt(br.readLine()); // 청중 번호

        cakePiece = new int[cakeSize+1];
        Arrays.fill(cakePiece, 0);
        audieceGetCakePieceCount = new int[audienceNums+1];

        int maxExpected = 0; // 가장 많이 받길 기대한 청중이 적은 개수
        int maxExpectedAudienceNum = 0; // 가장 많이 받길 기대한 청중 번호
        for(int i=1;i<audienceNums+1;i++){
            st = new StringTokenizer(br.readLine());
            start = Integer.parseInt(st.nextToken());
            end = Integer.parseInt(st.nextToken());
            distributeCake(i);
            if((end-start+1)>maxExpected) {
                maxExpected = end - start + 1;
                maxExpectedAudienceNum = i;
            }
        }

        int max = 0; // 가장 많이 받은 개수
        int num = 0; // 가장 많이 받은 청중 번호
        for(int i=1;i<audienceNums+1;i++){
            if(audieceGetCakePieceCount[i]>max){
                max = audieceGetCakePieceCount[i];
                num = i;
            }
        }

        System.out.println(maxExpectedAudienceNum);
        System.out.println(num);
    }
}
