import java.util.Scanner;

public class Ex_3 {
    public static int sum(int[] arr){
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }

        return sum;
    }

    public static float mean(int[] arr){
        return (float)sum(arr) / arr.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");

        int n;

        n = sc.nextInt();

        System.out.print("Enter array: ");

        int[] arr = new int[n];

        for (int i = 0; i < n; ++i) {
                arr[i] = sc.nextInt();
        }

        System.out.println("Sum  = " + sum(arr));
        System.out.println("Mean = " + mean(arr));

        sc.close();
    }
}
