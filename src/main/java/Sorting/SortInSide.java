package Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class SortInSide {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arrays = br.readLine().split("");
        Arrays.sort(arrays, Collections.reverseOrder());
        for(String array : arrays)
            System.out.print(array);
    }
}
