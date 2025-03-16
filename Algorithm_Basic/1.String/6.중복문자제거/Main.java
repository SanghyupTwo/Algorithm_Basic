import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();  // 사용자 입력 받기

        boolean[] alphabet = new boolean[26];  // 알파벳 a~z까지 방문 여부를 기록하는 배열

        for (char c : str.toCharArray()) {
            // 이미 출력한 문자는 다시 출력하지 않도록 체크
            if (alphabet[c - 'a']) continue;  // 알파벳이 이미 출력되었다면 건너뛰기
            alphabet[c - 'a'] = true;  // 해당 알파벳을 출력했음을 표시

            System.out.print(c);  // 출력하지 않은 문자만 출력
        }

        sc.close();
    }
}