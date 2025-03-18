import java.util.Scanner;

public class AlternativeSolution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int answer = 0;

        for (char ch : str.toCharArray()) {
            // 문자가 숫자('0' ~ '9')이면 숫자로 변환하여 누적
            if ('0' <= ch && ch <= '9') {
                answer = answer * 10 + (ch - '0'); 
                // 현재 숫자를 10배 하고 새로운 숫자를 추가하여 자리수를 맞춤
            }
        }
        System.out.println(answer);

        sc.close();
    }
}