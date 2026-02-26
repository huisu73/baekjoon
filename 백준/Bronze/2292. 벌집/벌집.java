import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());

        int start = 1;
        int cnt = 0;

        while (start < n) {
            start += (6 * cnt);
            cnt++;
        }
        
        System.out.println(cnt + 1);
    }
}
