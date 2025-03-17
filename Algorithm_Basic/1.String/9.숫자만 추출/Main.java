import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        String str = sc.nextLine(); 
        String answer = ""; // 숫자를 저장할 문자열 변수 초기화

        // 입력받은 문자열의 각 문자를 순회
        for (char ch : str.toCharArray()) {
            // 문자가 숫자인 경우에만 answer 문자열에 추가
            if (Character.isDigit(ch)) answer += ch;
        }

        // 숫자로 변환하여 출력 (앞에 0이 있으면 자동으로 제거됨)
        System.out.println(Integer.parseInt(answer));

        sc.close();
    }
}