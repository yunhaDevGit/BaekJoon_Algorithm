package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GroupWordChecker {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        String word = null;
        for(int i=0;i<N;i++){
            word = br.readLine();
            if(checker(word))
                count++;

        }
        System.out.println(count);
    }

    static boolean checker(String word){
        int length = word.length();
        boolean check[] = new boolean[26];
        for(int i=0;i<length;i++){
            char alphabet = word.charAt(i);
            if(check[alphabet-'a'])
                return false;
            else {
                if(i<length-1 && alphabet != word.charAt(i+1))
                    check[alphabet-'a'] = true;
            }
        }
        return true;
    }
}
