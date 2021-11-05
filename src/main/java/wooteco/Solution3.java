package wooteco;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] word = br.readLine().toCharArray();
        int wordLength = word.length;
        StringBuilder sb = new StringBuilder("");
        char alphabet;

        List<Character> alphabets = new ArrayList<>(Arrays.asList('A','B','C','D','E','F','G','H','I','J', 'K', 'L', 'M', 'N', 'O','P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X','Y', 'Z'));

        for (int i=0;i<wordLength;i++){

            if(word[i]==' '){
                sb.append(" ");
            } else if(Character.isLowerCase(word[i])) { // 소문자일 경우
                alphabet = alphabets.get(25 - alphabets.indexOf(Character.toUpperCase(word[i])));
                sb.append(Character.toLowerCase(alphabet));
            } else if (Character.isUpperCase(word[i])) { // 대문자일 경우
                alphabet = alphabets.get(25 - alphabets.indexOf(word[i]));
                sb.append(alphabet);
            }
        }
        System.out.println(sb);
    }
}