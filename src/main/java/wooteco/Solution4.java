package wooteco;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Solution4 {
    private static int solution(int[] pobi, int[] crong){

        Integer pobiResult[] = new Integer[4];
        Integer crongResult[] = new Integer[4];

        boolean page = validation(pobi, crong);
        if(!page)
            return -1;

        pobiResult[0] = getSum(pobi[0]);
        pobiResult[1] = getMultiple(pobi[0]);
        pobiResult[2] = getSum(pobi[1]);
        pobiResult[3] = getMultiple(pobi[1]);

        Arrays.sort(pobiResult, Collections.reverseOrder());

        crongResult[0] = getSum(crong[0]);
        crongResult[1] = getMultiple(crong[0]);
        crongResult[2] = getSum(crong[1]);
        crongResult[3] = getMultiple(crong[1]);

        Arrays.sort(crongResult, Collections.reverseOrder());

        if(pobiResult[0]>crongResult[0])
            return 1;
        else if(pobiResult[0]<crongResult[0])
            return 2;
        else if(pobiResult[0]==crongResult[0])
            return 0;
        else
            return -1;
    }

    private static boolean validation(int[] pobi, int[] crong){

        if(pobi[1]-pobi[0]!=1)
            return false;
        if(crong[1]-crong[0]!=1)
            return false;

        return true;
    }

    private static int getSum(int num){ // 각 자릿수 합
        int sum = 0;

        while(num!=0) {
            sum += num%10;
            num = num/10;
        }

        return sum;
    }

    private static int getMultiple(int num) { // 각 자릿수 곱
        int count = 1;

        while(num>=1) {
            int k = num % 10;
            if (k == 0) {
                k = 1;
            }
            num = num / 10;
            count *= k;
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        int pobi[] = {97,98};
        int crong[] = {197, 198};

        System.out.println(solution(pobi, crong));;

    }
}
