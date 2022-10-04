import java.util.Scanner;

public class Ex_7 {
    public static void main(String[] args) {
        System.out.println("Enter number to factorization:");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int res = 1;

        for (int i = 1; i <= n; ++i)
            res *= i;

        System.out.println("Answer:");
        System.out.println(res);
    }
}