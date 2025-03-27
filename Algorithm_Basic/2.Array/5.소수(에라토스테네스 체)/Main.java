import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); 
        int answer = 0; 

        // 2부터 n까지의 숫자 중 소수를 찾음
        for(int i = 2; i <= n; i++){
            boolean flag = true; // 현재 숫자가 소수인지 판별하는 플래그

            // 2부터 sqrt(i)까지의 숫자로 나누어 소수 여부 확인
            for(int j = 2; j <= Math.sqrt(i); j++){
                if(i % j == 0){ // 나누어 떨어지면 소수가 아님
                    flag = false;
                    break; // 더 이상 검사할 필요 없으므로 종료
                }
            }
            if(flag) answer++; // 소수라면 개수 증가
        }

        System.out.println(answer); // 최종 소수 개수 출력
        sc.close(); 
    }
}