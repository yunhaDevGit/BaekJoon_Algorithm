package wooteco;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution7 {
    private static String solution(String cryptogram) {

        String word[] = cryptogram.split("");
        List<String> list = Arrays.asList(word);
        List<String> cryp_list = new ArrayList<>();
        cryp_list.addAll(list);
        boolean check = true;

        while(check){
            check = false;

            for(int i=0;i<cryp_list.size()-1;i++){
                if(cryp_list.get(i).equals(cryp_list.get(i+1))) {
                    cryp_list.remove(i+1);
                    cryp_list.remove(i);
                    check = true;
                    break;
                }
            }

        }

        StringBuilder sb = new StringBuilder("");
        for(String s : cryp_list)
            sb.append(s);

        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(solution("zyelleyz"));
    }
}
