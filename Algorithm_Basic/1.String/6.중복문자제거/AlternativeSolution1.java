import java.util.Scanner;

public class AlternativeSolution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        for (int i=0; i<str.length(); i++){
            if(i == str.indexOf(str.charAt(i))) System.out.print(str.charAt(i));
        }
        
       sc.close();
    }
}
