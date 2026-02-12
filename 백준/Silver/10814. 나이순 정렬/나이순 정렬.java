import java.util.*;

public class Main {
    static class Member {
        int age;
        String name;

        Member(int age, String name) {
            this.age = age;
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        List<Member> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int age = sc.nextInt();
            String name = sc.next();
            list.add(new Member(age, name));
        }

        Collections.sort(list, (a, b) -> a.age - b.age);

        StringBuilder sb = new StringBuilder();
        for (Member m : list) {
            sb.append(m.age).append(" ").append(m.name).append("\n");
        }
        System.out.print(sb);
    }
}