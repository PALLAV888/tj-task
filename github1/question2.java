import java.util.*;

public class question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases

        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();
            int n = sc.nextInt();

            if (n % 2 == 0)
                System.out.println(0);
            else
                System.out.println(x);
        }

        sc.close();
    }
}