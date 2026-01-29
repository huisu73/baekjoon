import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int n = (int)str.charAt(0); // srting을 int로 변환하면 아스키코드 값을 출력해 줌

        System.out.println(n);
    }
}