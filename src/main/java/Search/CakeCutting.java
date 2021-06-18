package com.algorithm.easy.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


class CakeCutting {

  static int low, high, mid;
  static ArrayList<Integer> list = new ArrayList<>();

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st =new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    int L = Integer.parseInt(st.nextToken());

    for(int i=0;i<M;i++){
      list.add(Integer.parseInt(br.readLine()));
    }

    int answer = 0;

    for(int j=0;j<N;j++){
      int count = Integer.parseInt(br.readLine());
      low = 0;
      high = L;
      while(low<=high){
        mid = (low + high)/2;
        if(find(mid,count)){
          low = mid + 1;
          answer = Math.max(mid, answer);
        }else{
          high = mid - 1;
        }
      }
      System.out.println(answer);
    }

  }

  static boolean find(int mid, int count){
    int q = count;
    int temp = 0;
    for(int i=0;i<list.size();i++){
      if(list.get(i) - temp >= mid){
        q--;
        temp = list.get(i);
      }
    }
    return q <= 0 ? true : false;
  }

}
