import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class FruitGame {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fruitWeightStr[] = br.readLine().replaceAll("fruitWeights: \\[","").replaceAll("]","").split(" ");

        int k = Integer.parseInt(br.readLine().replaceAll("k: ",""));
        int fruitCount = fruitWeightStr.length;
        int fruitWeights[] = new int[fruitCount];
        for (int i=0;i<fruitCount;i++){
            fruitWeights[i] = Integer.parseInt(fruitWeightStr[i]);
        }

        int NumberOfCase = fruitCount-k+1;
        List<Integer> maxWeight = new ArrayList<>();
        int maxInCase = 0;

        for(int i=0;i<NumberOfCase;i++){
            for(int j=i;j<i+k;j++){
                if(maxInCase<fruitWeights[j])
                    maxInCase = fruitWeights[j];
            }
            maxWeight.add(maxInCase);
            maxInCase=0;
        }

        Collections.sort(maxWeight);
        HashSet<Integer> set = new HashSet<>(maxWeight);
        System.out.println(set);
    }
}
