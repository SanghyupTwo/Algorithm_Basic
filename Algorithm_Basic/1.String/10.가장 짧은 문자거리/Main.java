import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char t = sc.next().charAt(0);

        // 결과를 저장할 배열 (각 문자마다 최소 거리 값 저장)
        int[] answer = new int[s.length()];
        // 임시 거리값을 아주 큰 값으로 초기화
        int cnt = 1001;

        // 왼쪽에서 오른쪽으로 이동하면서 t와의 거리 계산
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t) { 
                cnt = 0; // 현재 위치에 t가 있으면 거리 0
            }
            answer[i] = cnt; // 현재 거리 저장
            cnt++; // 거리 증가
        }

        // 다시 큰 값으로 초기화 (오른쪽에서 왼쪽으로 탐색하기 위해)
        cnt = 1001;

        // 오른쪽에서 왼쪽으로 이동하면서 더 작은 거리로 업데이트
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == t) {
                cnt = 0; // 현재 위치에 t가 있으면 거리 0
            } else {
                cnt++; // 거리 증가
                // 기존 값보다 작으면 업데이트 (최소 거리 유지)
                if (answer[i] > cnt) {
                    answer[i] = cnt;
                }
            }
        }
        for (int i : answer) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}