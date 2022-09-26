package practical_exercises.pr_1;
import java.util.Scanner;

public class ex_1 {
    public static void meth() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n;

        if(sc.hasNextInt()) {
            n = sc.nextInt();
        }
        else {
            System.out.print("Error");
            return;
        }

        System.out.print("Enter array: ");

        int[] arr = new int[n];
        int sum = 0;

        for (int i = 0; i < n; ++i) {
            if(sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            }
            else {
                System.out.print("Error");
                return;
            }

            sum += arr[i];
        }

        System.out.println("Sum  = " + sum);
        System.out.println("Mean = " + (float)sum / n);

        sc.close();
    }

    public static void main(String[] args)
    {
        meth();
    }
}
