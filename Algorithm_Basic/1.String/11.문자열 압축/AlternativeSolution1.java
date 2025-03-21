import java.util.Scanner;

public class AlternativeSolution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력받은 문자열에 공백 추가 (마지막 문자까지 압축을 위해)
        String s = sc.nextLine() + " ";

        int cnt = 1; // 연속된 문자의 개수
        String answer = ""; // 압축된 문자열 저장

        for(int i = 0; i < s.length() - 1; i++){
            if(s.charAt(i) == s.charAt(i + 1)) cnt++; // 연속된 문자 개수 증가
            else {
                answer += s.charAt(i); // 문자 추가
                if (cnt > 1) answer += cnt; // 연속된 개수가 2 이상이면 숫자 추가
                cnt = 1; // 개수 초기화
            }
        }
        System.out.println(answer); 

        sc.close();
    }
}