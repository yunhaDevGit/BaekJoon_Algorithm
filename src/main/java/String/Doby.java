package String;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Doby {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            int count = Integer.parseInt(bf.readLine());
            if(count==0)
                break;
            List<String> words = new ArrayList<>();
            for(int i=0;i<count;i++)
                words.add(bf.readLine());
            Collections.sort(words,String.CASE_INSENSITIVE_ORDER);
            System.out.println(words.get(0));

        }

    }
}
