package Calendar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class WhatDayIsIt {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String day[] ={"SUN","MON","TUE","WED","THU","FRI","SAT"};
        int dates[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        int count = 0;
        int month = Integer.parseInt(st.nextToken());
        int date = Integer.parseInt(st.nextToken());

        for(int i=0;i<month-1;i++){
            count+=dates[i];
        }
        count+=date;

         System.out.println(day[count%7]);

    }
}
