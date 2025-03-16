import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 문자열 입력
        String[] str = sc.next().split("");  // 공백 없이 한 줄로 입력받아서 문자 배열로 변환
        int lt = 0, rt = str.length - 1;

        // lt와 rt가 교차할 때까지 반복
        while (rt > lt) {
            // 1. 첫 번째 문자와 마지막 문자가 알파벳이라면 둘이 교체
            if (Character.isAlphabetic(str[lt].charAt(0)) && Character.isAlphabetic(str[rt].charAt(0))) {
                String tmp = str[rt];
                str[rt] = str[lt];
                str[lt] = tmp;
                lt++;  // lt를 증가시켜 왼쪽으로 이동
                rt--;  // rt를 감소시켜 오른쪽으로 이동
            }
            // 2. 첫 번째 문자가 알파벳이 아니라면 두 번째 문자로
            else if (!Character.isAlphabetic(str[lt].charAt(0))) {
                lt++;  // 알파벳이 아닌 문자는 건너뛰고 lt 증가
            }
            // 3. 첫 번째 문자가 알파벳이고 마지막 문자가 알파벳이 아니면 뒤에서 두 번째 문자로
            else {
                rt--;  // 알파벳이 아닌 문자는 건너뛰고 rt 감소
            }
        }

        // 최종 문자열 출력
        System.out.println(String.join("", str));

        sc.close();
    }
}