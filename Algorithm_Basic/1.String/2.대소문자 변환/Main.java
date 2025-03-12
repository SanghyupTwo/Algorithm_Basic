import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String answer = "";

        // 문자열 돌면서 대문자 -> 소문자, 소문자 -> 대문자
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)){
                answer += Character.toLowerCase(c);
            } else {
                answer += Character.toUpperCase(c);
            }
        }
        System.out.println(answer);

        sc.close();
    }
}
