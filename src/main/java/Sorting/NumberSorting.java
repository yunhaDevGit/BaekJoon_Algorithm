package Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
public class NumberSorting {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader((System.in)));

        StringBuilder sb = new StringBuilder();
        int count = Integer.parseInt(bufferedReader.readLine());
        List<Integer> number = new ArrayList<>();

        for(int i=0;i<count;i++){
            number.add(Integer.parseInt(bufferedReader.readLine()));
        }

        // Arrays.sort(number);를 하면 시간 초과
        // Arrays.sort() 퀵 소트 알고리즘으로 구현되어있다. O(nlogn) ~ O(n*n)
        // Collections.sort() : Timsort (Merge Sort(합병 정렬) + Insert Sort(삽입 정렬)). O(n)~O(nlogn)
       Collections.sort(number);

        for (int value : number) {
            sb.append(value + "\n");
        }

        System.out.println(sb);
    }
}
