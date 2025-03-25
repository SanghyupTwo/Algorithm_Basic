import java.util.Arrays;
import java.util.Scanner;

public class AlternativeSolution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int[] a = Arrays.stream(sc.nextLine().split(" ")) 
            .mapToInt(Integer::parseInt) 
            .toArray(); 

        int[] b = Arrays.stream(sc.nextLine().split(" ")) 
            .mapToInt(Integer::parseInt) 
            .toArray(); 

        for (int i = 0; i < n; i++) {
            // 같은 선택을 했으면 무승부
            if (a[i] == b[i]) System.out.println("D");
            // 가위(1) vs 보(3), 바위(2) vs 가위(1), 보(3) vs 바위(2)일 때 A가 이김
            else if (a[i] == 1 && b[i] == 3) System.out.println("A");
            else if (a[i] == 2 && b[i] == 1) System.out.println("A");
            else if (a[i] == 3 && b[i] == 2) System.out.println("A");
            // 그 외의 경우는 B가 이김
            else System.out.println("B");
        }

        sc.close(); 
    }
}