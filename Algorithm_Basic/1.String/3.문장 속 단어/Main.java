import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // 단어 배열 생성
        String[] words = sc.nextLine().split(" ");
        int maxLen = 0;        
        String answer = "";

        // 단어 수 만큼 반복
        for(int i=0; i<words.length; i++){
            // 가장 긴 단어인지 판단
            if (words[i].length() > maxLen){
                maxLen = words[i].length();
                answer = words[i];
            }
        }
        // 가장 긴 단어 출력
        System.out.println(answer);

        sc.close();
    }
}
