import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();        
        // 연속된 문자의 개수를 세기 위한 변수
        int cnt = 1;
        String answer = "";

        // 문자열의 두 번째 문자부터 끝까지 반복하면서 이전 문자와 비교
        for(int i=1; i<str.length(); i++){
            // 현재 문자와 이전 문자가 같으면 cnt 증가
            if(str.charAt(i) == str.charAt(i-1)){
                cnt++;
            }else{
                // 연속된 문자가 끝났다면 현재 문자와 그 갯수를 answer에 추가
                answer += str.charAt(i-1) + "" + cnt;
                // cnt를 1로 초기화 (새로운 문자가 등장했으므로)
                cnt = 1;
            }
        }
        // 마지막 문자 처리 (루프 밖에서 추가된 문자를 처리)
        answer += str.charAt(str.length() - 1) + "" + cnt;
        // 연속된 문자 중 하나만 있을 경우 '1'을 제거하고 결과 출력
        System.out.println(answer.replaceAll("1", ""));
        
        sc.close();
    }
}