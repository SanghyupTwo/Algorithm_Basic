import java.util.Scanner;

public class AlternativeSolution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int answer = 0;
        int[] arr = new int[n + 1]; // 0으로 초기화된 배열 (인덱스: 0~n)

        // 2부터 n까지 반복하며 소수 판별
        for (int i = 2; i <= n; i++) {
            if (arr[i] == 0) { // 아직 체크되지 않은 숫자는 소수
                answer++; // 소수 개수 증가

                // i의 배수들을 모두 체크하여 합성수로 표시
                for (int j = i; j <= n; j += i) {
                    arr[j] = 1; // i의 배수는 소수가 아니므로 1로 표시
                }
            }
        }

        System.out.println(answer); // 소수 개수 출력
        sc.close();
    }
}