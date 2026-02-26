import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        int tc = 1;

        while (n-- > 0) {
            Stack<String> stk = new Stack<>();

            st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens())
                stk.push(st.nextToken());

            sb.append("Case #").append(tc++).append(": ");
            
            while (!stk.empty()) {
                sb.append(stk.pop());
                if (!stk.empty()) sb.append(" ");
            }
            sb.append("\n");
        }

        System.out.print(sb.toString());
    }
}
