import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases

        for (int test = 1; test <= t; test++) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int neg = 0, zero = 0;

            for (int j = 0; j < n; j++) {
                if (a[j] == -1)
                    neg++;
                else if (a[j] == 0)
                    zero++;
            }

            int ops = 0;

            if (zero > 0) {
                if (neg % 2 == 0)
                    ops = zero;
                else
                    ops = zero + 1;
            } else {
                if (neg % 2 == 0)
                    ops = 0;
                else
                    ops = 2;
            }

            System.out.println(ops);
        }

        sc.close();
    }
}