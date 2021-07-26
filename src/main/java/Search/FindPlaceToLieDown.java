package Search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FindPlaceToLieDown {

    static int size;
    static String room[][];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        size = Integer.parseInt(st.nextToken());
        room = new String[size][size];
        for(int i =0;i<size;i++){
            room[i] = (br.readLine()).split("");
        }

        System.out.print(getWidthCount() + " " + getLengthCount());

    }

    static int getWidthCount(){ // 가로
        int count = 0;
        int length = 0;
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++) {
                if (room[i][j].equals(".")) {
                    length++;
                } else {
                    if(length>1)
                        count++;
                    length = 0;
                }
            }
            if(length>=2)
                count+=1;
            length = 0;
        }
        return count;
    }

    static int getLengthCount(){ // 세로
        int count = 0;
        int length = 0;
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++) {
                if (room[j][i].equals(".")) {
                    length++;
                } else {
                    if(length>1)
                        count++;
                    length = 0;
                }
            }
            if(length>=2)
                count+=1;
            length = 0;
        }
        return count;
    }

}
