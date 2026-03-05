import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            if (isGroupWord(word)) {
                count++;
            }
        }

        System.out.println(count);
    }

    private static boolean isGroupWord(String word) {
        for (int i = 0; i < word.length() - 1; i++) {
            char current = word.charAt(i);
            char next = word.charAt(i + 1);

            if (current != next) {
                for (int j = i + 1; j < word.length(); j++) {
                    if (word.charAt(j) == current) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}