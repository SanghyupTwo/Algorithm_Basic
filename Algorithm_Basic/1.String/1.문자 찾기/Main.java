import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next().toLowerCase();
        char c = sc.next().toLowerCase().charAt(0);

        int answer = 0;

        for (char ch : s.toCharArray()) {
            if (ch == c) answer++;
        }

        System.out.println(answer);

        sc.close();
    }
}
