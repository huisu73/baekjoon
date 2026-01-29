import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean[] check = new boolean[42];

        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            int r = num % 42;
            check[r] = true;
        }

        int count = 0;
        for (int i = 0; i < check.length; i++) {
            if (check[i]) {
                count++;
            }
        }

        System.out.println(count);
    }
}