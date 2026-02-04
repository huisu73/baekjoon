import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        scanner.nextLine();
        String word = scanner.nextLine();

        int sum = 0;

        for (int i=0; i<count; i++) {
            int number = word.charAt(i)-48;
            sum += number;
        }

        System.out.println(sum);
    }
}