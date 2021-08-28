import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClimbStairs {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int first, second, third, temp;
        if(N==1){
            System.out.println(1);
            return;
        } else if(N==2){
            System.out.println(2);
            return;
        } else if(N==3){
            System.out.println(4);
            return;
        } else {
            first = 1;
            second = 2;
            third = 4;
            for(int i=0;i<N-3;i++){
                temp = first;
                first = second;
                second = third;
                third += temp+first;
            }
            System.out.println(third);
            return;
        }
    }
}
