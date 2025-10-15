import java.util.*;

public class question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases
        
        for (int i = 0; i < t; i++) {
            String a = sc.next();
            String b = sc.next();
            String c = sc.next();
            
            // Print the first character of each string
            System.out.println("" + a.charAt(0) + b.charAt(0) + c.charAt(0));
        }
        
        sc.close();
    }
}