import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class FakeReceipt {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String receipt = br.readLine();

        if(!receipt.equals("0")) {
            String pattern = "^[1-9]{1}[0-9]{0,2}(\\,[0-9]{3})*$";
            boolean regex = Pattern.matches(pattern, receipt);
            System.out.println(regex);
        } else
            System.out.println(true);
    }
}
