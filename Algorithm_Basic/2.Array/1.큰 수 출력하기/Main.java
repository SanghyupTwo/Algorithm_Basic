import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // 개행 문자 제거

        // int형 배열 입력받기
        int[] arr = Arrays.stream(sc.nextLine().split(" "))
        .mapToInt(Integer::parseInt).toArray();

        // 첫 번째는 무조건 출력
        System.out.print(arr[0]);

        // 바로 앞 수보다 큰 수만 출력
        for (int i = 1; i<n; i++){
            if(arr[i] > arr[i-1]) System.out.print(" " + arr[i]);
        }

        sc.close();
    }
}
