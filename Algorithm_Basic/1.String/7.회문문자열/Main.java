import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력받은 문자열을 소문자로 변환 (대소문자 구분 없이 비교하기 위해)
        String str = sc.next().toLowerCase();
        // 회문 여부를 저장할 플래그 변수 (초기값은 true)
        boolean flag = true;

        // 문자열의 절반만 순회하면서 앞뒤 문자를 비교
        for(int i = 0; i < str.length() / 2; i++) {
            // 앞쪽 문자와 뒤쪽 문자가 다르면 회문이 아님
            if(str.charAt(i) != str.charAt(str.length() - (1 + i))) {
                flag = false; // 회문이 아님을 표시
                break; // 하나라도 다르면 더 비교할 필요 없으므로 반복문 종료
            }
        }
        // 회문이면 "YES", 아니면 "NO" 출력
        System.out.println(flag ? "YES" : "NO");

        sc.close();
    }
}