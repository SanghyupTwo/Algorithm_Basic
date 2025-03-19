import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력받을 원소 개수 n
        int n = sc.nextInt();
        sc.nextLine(); // 개행 문자 제거

        // 보이는 학생 수 (첫 번째 학생은 항상 보이므로 1로 초기화)
        int answer = 1;
        
        // 공백을 기준으로 나눈 후, 정수 배열로 변환
        int[] arr = Arrays.stream(sc.nextLine().split(" "))
                          .mapToInt(Integer::parseInt)
                          .toArray();

        // 첫 번째 학생의 키를 기준으로 설정
        int h = arr[0];

        // 두 번째 학생부터 반복
        for (int i = 1; i < n; i++) {
            // 현재 학생의 키가 기존 최대 키보다 크면
            if (arr[i] > h) {
                h = arr[i]; // 최대 키 업데이트
                answer++;   // 보이는 학생 수 증가
            }
        }
        System.out.println(answer);

        sc.close();
    }
}