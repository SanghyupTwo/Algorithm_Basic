import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AlternativeSolution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int[] arr = Arrays.stream(sc.nextLine().split(" "))
            .mapToInt(Integer::parseInt) 
            .toArray(); 

        // 결과를 저장할 ArrayList 생성
        ArrayList<Integer> answer = new ArrayList<>();
        
        // 첫 번째 숫자는 무조건 포함시킴
        answer.add(arr[0]);

        // 배열에서 두 번째 숫자부터 비교 시작
        for(int i = 1; i < n; i++) {
            // 현재 값이 이전 값보다 클 경우 리스트에 추가
            if (arr[i] > arr[i - 1]) answer.add(arr[i]);
        }

        // ArrayList의 내용을 출력할 때, 대괄호와 쉼표를 제거
        System.out.println(answer.toString().replaceAll("[\\[\\],]", ""));

        sc.close(); 
    }
}