import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class UsefulFinancialInformation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken()); // 일수
        int N = Integer.parseInt(st.nextToken()); // 횟수
        int showCount = 0; // 노출
        int day = 0; // 날짜
        int dayCount = 0; // 노출 금지 일수
        String command;
        StringBuffer sb = new StringBuffer();

        while(true){
            command = br.readLine();
            switch (command){
                case "EXIT":
                    sb.append("\nBYE");
                    System.out.println(sb);
                    return;
                case "SHOW":
                    if(dayCount==0 && showCount<N){
                        showCount++;
                        sb.append("\n1");
                        break;
                    } else if(dayCount>0) {
                        dayCount--;
                        sb.append("\n0");
                        break;
                    } else if(showCount>=N){
                        dayCount = M;
                        sb.append("\n0");
                        break;
                    }
                case "NEXT":
                    sb.append("\n-");
                    if(showCount<N) {
                        if(day<M)
                            day++;
                        else{
                            showCount = 0;
                            day = 0;
                        }
                    } else {
                        showCount = 0;
                        day = 0;
                        dayCount = M;
                    }
                    break;
                case "NEGATIVE":
                    sb.append("\n0");
                    showCount = 0;
                    day=0;
                    dayCount = M;
                    break;
                default:
                    sb.append("\nERROR");
                    break;
            }
        }
    }
}
