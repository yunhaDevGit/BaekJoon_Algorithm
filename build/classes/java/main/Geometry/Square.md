import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Square {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            int x[] = new int[4];
            int y[] = new int[4];

            for(int j=0;j<4;j++){
                String input[] = br.readLine().split(" ");
                x[j] = Integer.parseInt(input[0]);
                y[j] = Integer.parseInt(input[1]);
            }
            System.out.println(isSquare(x, y));
        }
    }

    private static int isSquare(int[] x, int[] y){
        HashSet <Integer> lengthHash = new HashSet<>();

        for(int i=0;i<4;i++){
            for (int j=i+1;j<4;j++){
                lengthHash.add((x[i] - x[j])*(x[i] - x[j]) + (y[i] - y[j])*(y[i] - y[j]));
            }
        }

        if(lengthHash.size()==2)
            return 1;
        else
            return 0;
    }
}
