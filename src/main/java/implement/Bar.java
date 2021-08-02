package implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bar {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        int bar = 0;
        int length = 64;
        int count = 0;

        if(X!=length) {
            while (bar != X) {
                length = length/2;
                if (bar + length <= X) {
                    bar = bar + length;
                    count++;
                }
            }
            System.out.println(count);
        } else {
            System.out.println(1);
        }
    }
}
