import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int tmp = 1; // 피보나치 수열 값을 저장할 변수 (초기값 1)

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) { 
            // 첫 번째와 두 번째 값은 기본적으로 1 (tmp의 초기값이 1이므로 자동으로 적용됨)
            // 세 번째 값부터는 이전 두 수의 합으로 계산
            if (i > 1) tmp = arr[i - 2] + arr[i - 1]; 
            arr[i] = tmp;
        }

        // 배열을 문자열로 변환 후 대괄호([])와 쉼표(,) 제거하여 출력
        System.out.println(Arrays.toString(arr).replaceAll("[\\[\\],]", ""));

        sc.close();
    }
}