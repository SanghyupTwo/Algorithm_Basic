import java.util.Scanner;

public class AlternativeSolution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 받은 문자열을 대문자로 변환하고, 알파벳(A-Z) 이외의 문자는 제거
        String str1 = sc.nextLine().toUpperCase().replaceAll("[^A-Z]", "");

        // str1을 뒤집은 문자열을 생성
        String str2 = new StringBuilder(str1).reverse().toString();

        // 원본 문자열과 뒤집은 문자열이 같으면 "YES", 다르면 "NO" 출력 (회문 판별)
        System.out.println(str1.equals(str2) ? "YES" : "NO");

        sc.close();
    }
}