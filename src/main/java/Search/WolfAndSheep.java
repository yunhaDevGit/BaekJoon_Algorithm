package Search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 다시 풀기
public class WolfAndSheep {

    private static int[] dx = {-1, 1,0, 0};
    private static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        String[][] pasture = new String[R][C];

        for(int i=0;i<R;i++) {
            String str = br.readLine();
            for(int j=0;j<C;j++) {
                pasture[i][j] = String.valueOf(str.charAt(j));
            }
        }

        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                if(pasture[i][j].equals("W")){
                    for(int dir = 0; dir < 4; dir++){
                        int nx = i + dx[dir];
                        int ny = j + dy[dir];

                        // nx, ny 값이 목장 안쪽 일 때
                        if(0 <= nx && nx < R && 0 <= ny && ny < C){
                            if(pasture[nx][ny].equals("."))
                                pasture[nx][ny] = "D";
                            else if (pasture[nx][ny].equals("S")){
                                System.out.println(0);
                                return;
                            }
                        }
                    }
                }

            }
        }
        System.out.println(1);
        for (int i=0;i<R;i++){
            for (int j=0;j<C;j++){
                System.out.print(pasture[i][j]);
            }
            System.out.println();
        }
    }
}
