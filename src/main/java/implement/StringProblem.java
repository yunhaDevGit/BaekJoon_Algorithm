import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class StringProblem {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String A = st.nextToken();
        String B = st.nextToken();

        int lengthA = A.length();
        int lengthB = B.length();
        int diff = lengthB - lengthA;
        int min = 50;


        for(int j=0;j<=diff;j++){
            int count = 0;
            for(int i=0;i<lengthA;i++){
                if(A.charAt(i)!=B.charAt(i+j))
                    count++;
            }
            if(count<min)
                min=count;
        }
        System.out.println(min);

    }
}
