import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 게임 횟수 입력
        int n = sc.nextInt();
        sc.nextLine(); // 개행 문자 제거

        // A와 B의 선택을 배열로 저장
        int[] a = Arrays.stream(sc.nextLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
        int[] b = Arrays.stream(sc.nextLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

        // 가위(1), 바위(2), 보(3) 기준으로 승패 결정
        for (int i = 0; i < n; i++) {
            if (a[i] == b[i]) { 
                // 같은 선택을 하면 무승부
                System.out.println("D");
            } else if (a[i] == 1) { 
                if (b[i] == 2) System.out.println("B"); 
                else System.out.println("A"); 
            } else if (a[i] == 2) { 
                if (b[i] == 1) System.out.println("A"); 
                else System.out.println("B"); 
            } else if (a[i] == 3) { 
                if (b[i] == 1) System.out.println("B"); 
                else System.out.println("A"); 
            }
        }
        sc.close();
    }
}