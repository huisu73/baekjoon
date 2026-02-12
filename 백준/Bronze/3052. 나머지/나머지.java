import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            int number = sc.nextInt();
            int remain = number % 42;

            set.add(remain);
        }

        System.out.println(set.size());
    }
}
