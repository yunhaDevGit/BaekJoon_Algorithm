package wooteco;

public class Solution5 {
    private static int solution(int number){
        return count(number);
    }

    private static int count(int number){
        int result = 0;
        int length;
        String num;
        for(int i=1;i<=number;i++){
            num = String.valueOf(i);
            length = num.length();
            for(int j=0;j<length;j++){
                char alphabet = num.charAt(j);
                if(alphabet=='3'||alphabet=='6'||alphabet=='9')
                    result++;
            }

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(solution(33));
    }
}
