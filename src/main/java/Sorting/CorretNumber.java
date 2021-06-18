package Sorting;

import java.util.*;

class CorrectNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Integer> scoreMap = new HashMap<>();
        int score = 0;
        for(int i=0;i<8;i++){
            score = scanner.nextInt();
            scoreMap.put(score,i+1);
        }
        Object[] mapKey = scoreMap.keySet().toArray();
        Arrays.sort(mapKey);


    }
}
