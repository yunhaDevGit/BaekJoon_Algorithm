import java.util.*;

public class Solution1 {

    public static int[] method1(int region, int num, int[][] info) {
        int peopleCount = info.length;
        int answer[] = new int[peopleCount];
        Arrays.fill(answer, -1);

//주택 청약 가점 = (무주택 기간 + 1) x 2 + (청약 통장 가입 기간 + 2) + (부양가족 수 + 1) x 5
        Map<Integer, Integer> inRegion = new HashMap<>();
        Map<Integer, Integer> outRegion = new HashMap<>();

        for(int i=0;i<peopleCount;i++) {
            int score = ((info[i][1] + 1)*2 + (info[i][2] + 2) + (info[i][3] + 1) * 5);
            if(info[i][0]==region) { // 해당 지역
                inRegion.put(i, score);
            } else { // 외 지역
                outRegion.put(i, score);
            }
        }

        int ranking = 1;
        List<Integer> listKeySet = new ArrayList<>(inRegion.keySet());
        Collections.sort(listKeySet, (value1, value2) -> (inRegion.get(value2).compareTo(inRegion.get(value1))));
        for (Integer key : listKeySet) {
            answer[key] = ranking;
            ranking++;
            if(ranking>num) {
                return answer;
            }
        }

        List<Integer> listKeySet2 = new ArrayList<>(outRegion.keySet());
        Collections.sort(listKeySet2, (value1, value2) -> (outRegion.get(value2).compareTo(outRegion.get(value1))));
        for (Integer key : listKeySet2) {
            answer[key] = ranking;
            ranking++;
            if(ranking>num) {
                return answer;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int region =2;
        int num = 4;
        int[][] info = {{1, 0, 2, 1}, {2, 6, 5, 2}, {3, 10, 2, 4}, {1, 1, 5, 6}, {2, 7, 10, 2}, {3, 8, 6, 3}};

        System.out.println(Arrays.toString(method1(region, num, info)));
    }
}
