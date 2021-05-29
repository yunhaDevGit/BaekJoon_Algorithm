package Search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 다시 풀기
public class WolfAndSheep {
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
                    if(i!=0&&(i+1)<R){
                        if(j!=0&&(j+1)<C){
                            if(pasture[i-1][j].equals("S")){
                                System.out.println(0);
                                return;
                            } else if(pasture[i-1][j].equals("."))
                                pasture[i-1][j] = "D";
                            if(pasture[i+1][j].equals("S")){
                                System.out.println(0);
                                return;
                            } else if(pasture[i+1][j].equals("."))
                                pasture[i+1][j] = "D";
                            if(pasture[i][j-1].equals("S")){
                                System.out.println(0);
                                return;
                            } else if(pasture[i][j-1].equals("."))
                                pasture[i][j-1] = "D";
                            if(pasture[i][j+1].equals("S")){
                                System.out.println(0);
                                return;
                            } else if(pasture[i][j+1].equals("."))
                                pasture[i][j+1] = "D";
                        } else if(j==0){
                            //...
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
