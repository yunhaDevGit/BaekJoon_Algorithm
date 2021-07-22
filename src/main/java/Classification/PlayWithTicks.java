package Classification;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class PlayWithTicks {
    //    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static Scanner scanner = new Scanner(System.in);
    private static int AN, BN;

    static String whoseWinner(List<Integer> listA, List<Integer> listB){
        int countA, countB = 0;
        for(int i=4;i>0;i--){
            countA = Collections.frequency(listA, i);
            countB = Collections.frequency(listB, i);
            if(countA > countB)
                return "A";
            else if(countA < countB)
                return "B";
        }
        return "D";
    }
    public static void main(String[] args) throws IOException {
        int N = scanner.nextInt();
        List<Integer> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();

        for(int i=0;i<N;i++){
            listA.clear();
            listB.clear();

            AN = scanner.nextInt();
            for(int j=0;j<AN;j++){
                listA.add(scanner.nextInt());
            }
            BN = scanner.nextInt();
            for(int j=0;j<BN;j++){
                listB.add(scanner.nextInt());
            }
            System.out.println(whoseWinner(listA, listB));
        }
    }
}
