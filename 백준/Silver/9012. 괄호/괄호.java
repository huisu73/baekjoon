import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        
        for(int i=0; i<T; i++) {
            String ps = br.readLine();
            System.out.println(isVPS(ps));
        }
    }

    public static String isVPS(String ps) {
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<ps.length(); i++) {
            char c = ps.charAt(i);

            if(c == '(') {
                stack.push(c);
            } else {
                if (stack.empty()) {
                    return "NO";
                }
                stack.pop();
            }
        }

        return stack.empty() ? "YES" : "NO";
    }
}
