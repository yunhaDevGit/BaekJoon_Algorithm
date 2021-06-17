package com.algorithm.easy.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class CakeCutting {

  static int low, high, mid;
  static boolean result = false;
  static ArrayList<Integer> list;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st =new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    int L = Integer.parseInt(st.nextToken());

    for(int i=0;i<M;i++){
      list.add(Integer.parseInt(br.readLine()));
    }

    for(int j=0;j<N;j++){
      low = 0;
      high = M-1;
      mid = (low + high)/2;
      while(low<=high){
        if(find(mid,M)){

        }else{

        }
      }
    }

  }

  static boolean find(int mid, int M){
    int count = M;
    for(int i=0;i<list.size();i++){

    }
    return result;
  }

}
