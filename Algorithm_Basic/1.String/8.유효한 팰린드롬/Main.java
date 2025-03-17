import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 문자열을 입력받아 모두 소문자로 변환 (대소문자 구분 없이 비교하기 위함)
        String str = sc.nextLine().toLowerCase();
        // 왼쪽 포인터(ld)와 오른쪽 포인터(rd) 초기화
        int ld = 0, rd = str.length() - 1;
        // 회문 여부를 판단하는 플래그 (초기값: true)
        boolean flag = true;

        // 양쪽에서 중앙으로 이동하며 문자를 비교
        while (rd > ld) {
            if (!Character.isAlphabetic(str.charAt(ld))) {
                // 왼쪽 문자가 알파벳이 아니면 한 칸 오른쪽으로 이동
                ld++;
            } else if (!Character.isAlphabetic(str.charAt(rd))) {
                // 오른쪽 문자가 알파벳이 아니면 한 칸 왼쪽으로 이동
                rd--;
            } else {
                // 양쪽 문자가 알파벳이라면 비교
                if (str.charAt(ld) != str.charAt(rd)) {
                    // 문자가 다르면 회문이 아님
                    flag = false;
                    break; // 불필요한 비교 방지를 위해 즉시 종료
                }
                // 포인터를 한 칸씩 중앙으로 이동
                ld++;
                rd--;
            }
        }
        // 회문이면 "YES", 아니면 "NO" 출력
        System.out.println(flag ? "YES" : "NO");

        sc.close();
    }
}