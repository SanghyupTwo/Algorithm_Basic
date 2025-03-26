import java.util.Scanner;

public class AlternativeSolution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        // 배열 안쓰고 풀이
        int a = 1, b = 1, c;

        System.out.print(a + " " + b + " ");

        for (int i = 2; i < n; i++){
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }

        sc.close();
    }
}
