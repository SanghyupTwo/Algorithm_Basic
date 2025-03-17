import java.util.Scanner;

public class AlternativeSolution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 입력받은 문자열을 소문자로 변환 (대소문자 구분 없이 비교하기 위함)
        String str = sc.next().toLowerCase();
        // 왼쪽 포인터(ld)와 오른쪽 포인터(rd) 초기화
        int ld = 0, rd = str.length() - 1;
        // 회문 여부를 판단하는 플래그 (초기값: true)
        boolean flag = true;

        // 양쪽 끝에서부터 문자를 비교하며 중앙으로 이동
        while (rd > ld) {
            if (str.charAt(ld) != str.charAt(rd)) { // 문자가 다르면 회문이 아님
                flag = false;
                break; // 더 이상 비교할 필요 없음, 즉시 반복문 종료
            }
            ld++; // 왼쪽 포인터 한 칸 오른쪽으로 이동
            rd--; // 오른쪽 포인터 한 칸 왼쪽으로 이동
        }

        // 회문이면 "YES", 아니면 "NO" 출력
        System.out.println(flag ? "YES" : "NO");

        sc.close(); 
    }
}