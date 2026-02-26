import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
       
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        int daily = A - B;
        int height = V - A;
        
        int days;
        if (height <= 0){
            days = 0;
        } else {
            days = (height + daily - 1) / daily;
        }

        System.out.println(days + 1);
    }
}