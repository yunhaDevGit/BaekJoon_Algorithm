package implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class GuiterLine {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    int sixLinePrice[] = new int[M];
    int linePrice[] = new int[M];
    String price=null;
    for(int i=0;i<M;i++){
      price = br.readLine();
      sixLinePrice[i] = Integer.parseInt(price.split(" ")[0]);
      linePrice[i] = Integer.parseInt(price.split(" ")[1]);
    }

    Arrays.sort(sixLinePrice);
    Arrays.sort(linePrice);

    // 묶음으로만 산 경우
    int buySixLine = (N/6+1)*sixLinePrice[0];
    // 묶음+낱개로 산 경우
    int buyLineAndSixLine = N/6*sixLinePrice[0] + N%6*linePrice[0];
    // 낱개로 산 경우
    int buyLine = N*linePrice[0];

    int min=buySixLine;
    if(min>buyLineAndSixLine)
      min=buyLineAndSixLine;
    if(min>buyLine)
      min=buyLine;
    System.out.println(min);
  }

}
