import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // n개의 단어만큼 반복
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            // 단어 입력
            String str = sc.next(); 
            // 단어 뒤집기
            for (int j=str.length()-1; j>=0; j--){
                System.out.print(str.charAt(j));
            }
            System.out.println();
        }
        sc.close();
    }
}
