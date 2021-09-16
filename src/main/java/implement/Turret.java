package implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Turret {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());
    for(int i=0;i<T;i++){
      String testCase = br.readLine();
      countLocation(testCase);
    }
  }

  private static void countLocation(String testCase){
    String[] location = testCase.split(" ");
    int x1 = Integer.parseInt(location[0]);
    int y1 = Integer.parseInt(location[1]);
    int x2 = Integer.parseInt(location[2]);
    int y2 = Integer.parseInt(location[3]);
    int r1 = Integer.parseInt(location[4]);
    int r2 = Integer.parseInt(location[5]);

    double distance = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));

    if (distance==0 && r1 == r2) {
      System.out.println(-1);
    } else if (distance > r1+r2) {
      System.out.println(0);
    } else if (distance==0 && r1!=r2) {
      System.out.println(0);
    } else if (r2-r1>distance || r1-r2>distance){
      System.out.println(0);
    } else if (distance == r1+r2) {
      System.out.println(1);
    } else if(r2-r1==distance || r1-r2==distance) {
      System.out.println(1);
    } else {
      System.out.println(2);
    }

  }
}
