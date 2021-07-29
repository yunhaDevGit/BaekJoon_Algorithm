package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class WordStudy {
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        String upperWord = word.toUpperCase();
        String[] words = upperWord.split("");
        Map<String, Integer> wordCount = new HashMap<>();

        int wordLength = words.length;

        for(int i=0;i<wordLength;i++){
            if(!wordCount.containsKey(words[i]))
                wordCount.put(words[i], 1);
            else {
                Integer value = wordCount.get(words[i]);
                wordCount.put(words[i], ++value);
            }
        }

        int max = 0;
        boolean same = false;
        String answer = null;
        for(Map.Entry<String, Integer> entry : wordCount.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();
            if(max<value){
                max = value;
                answer = key;
                same = false;
            } else if(max==value) {
                same = true;
            }
        }
        if(same==true)
            System.out.println("?");
        else
            System.out.println(answer);
    }
}
