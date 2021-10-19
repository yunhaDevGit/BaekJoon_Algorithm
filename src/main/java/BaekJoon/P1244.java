package BaekJoon;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1244 {
  private static int[] state;
  private static int N;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    N = Integer.parseInt(br.readLine()); // 스위치 개수
    state = new int[N];
    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i=0;i<N;i++){
      state[i] = Integer.parseInt(st.nextToken());
    }
    int count = Integer.parseInt(br.readLine());
    int sex, switchNum;

    for(int i=0;i<count;i++){
      st = new StringTokenizer(br.readLine());
      sex = Integer.parseInt(st.nextToken());
      switchNum = Integer.parseInt(st.nextToken());
      getSwitch(sex, switchNum);
    }

    StringBuffer sb = new StringBuffer("");
    for(int i=0;i<N;i++){
      if(N%20==0)
        sb.append("\n");
      sb.append(state[i]+" ");
    }
    System.out.println(sb);
  }

  private static int[] getSwitch(int sex, int switchNum){
    if(sex==1){ // 남학생
      int i = 1;
      while(switchNum<=N){
        if(state[switchNum-1] == 1)
          state[switchNum-1] = 0;
        else
          state[switchNum-1] = 1;
        i++;
        switchNum*=i;
      }
      return state;

    } else { // 여학생
      int i=1;
      switchNum-=1;

      if(state[switchNum] == 1)
        state[switchNum] = 0;
      else
        state[switchNum] = 1;

      while((switchNum-i) >= 0 && (switchNum+i) <= N){

        if(state[switchNum-i] == state[switchNum+i]){
          if(state[switchNum-i] == 1) {
            state[switchNum - i] = 0;
            state[switchNum + i] = 0;
          } else {
            state[switchNum - i] = 1;
            state[switchNum + i] = 1;
          }
        } else {
          return state;
        }
        i++;
      }
      return state;
    }
  }
}
