import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
            String ps = br.readLine();

            bw.write(isVPS(ps) + "\n");
        }

        bw.flush();
    }

    public static String isVPS(String ps) {
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<ps.length(); i++) {
            char psChar = ps.charAt(i);

            if(psChar == '(') {
                stack.push(psChar);
            }
            else if(psChar == ')' && !stack.empty()) {
                stack.pop();
            }
            else if(psChar == ')' && stack.empty()) {
                return "NO";
            }
        }

        if(stack.empty()) {
            return "YES";
        } else {
            return "NO";
        }
    }
}