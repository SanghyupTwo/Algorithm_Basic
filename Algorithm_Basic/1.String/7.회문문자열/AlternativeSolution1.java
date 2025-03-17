import java.util.Scanner;

public class AlternativeSolution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력받은 문자열을 소문자로 변환
        String str = sc.next().toLowerCase();
        // StringBuilder를 사용해 문자열을 뒤집음
        String reversed = new StringBuilder(str).reverse().toString();
        // 원본 문자열과 뒤집은 문자열이 같으면 "YES", 아니면 "NO" 출력
        System.out.println(str.equals(reversed) ? "YES" : "NO");

        sc.close(); 
    }
}
