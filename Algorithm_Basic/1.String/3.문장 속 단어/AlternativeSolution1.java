import java.util.Scanner;

public class AlternativeSolution1 {
    public static void main(String[] args) {
        // subString(), indexOf() 이용
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int max = 0, pos;
        String answer = "";

        while ((pos = s.indexOf(" ")) != -1) {
            String tmp = s.substring(0, pos);
            if (tmp.length() > max) {
                max = tmp.length();
                answer = tmp;
            }
            // pos + 1을 사용해서 공백을 건너뛰기
            s = s.substring(pos + 1);
        }
        // 마지막 단어 비교
        if (s.length() > max){
            answer = s;
        }

        System.out.println(answer);

        sc.close();
    }
}
