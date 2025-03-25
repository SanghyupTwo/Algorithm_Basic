import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        // 문자의 개수 입력 받기
        int n = sc.nextInt();
        sc.nextLine(); // 개행 문자 처리
        
        // 암호 문자열 입력 받기
        String s = sc.nextLine();

        // 입력받은 문자열을 7자리씩 잘라 변환
        for (int i = 0; i < n; i++) {
            // 앞의 7자리 추출 후 # → 1, * → 0 변환
            String tmp = s.substring(0, 7)
                .replace('#', '1')
                .replace('*', '0');

            // 2진수를 10진수 정수로 변환
            int num = Integer.parseInt(tmp, 2);
            // 10진수 값을 아스키 문자로 변환하여 출력
            System.out.print((char)num);
            // 변환한 7자리 부분을 제거하고 다음 문자 처리
            s = s.substring(7);
        }

        sc.close();
    }
}