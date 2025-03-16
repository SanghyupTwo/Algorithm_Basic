import java.util.Scanner;

public class AlternativeSolution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        for(int i=0; i<n; i++){
            StringBuffer str = new StringBuffer(sc.next()).reverse();
            System.out.println(str);
        }
        sc.close();
    }
}
