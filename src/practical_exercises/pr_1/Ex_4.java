import java.util.Scanner;

public class Ex_4 {
    public static int max(int[] arr){
        int max = arr[0];
        int i = 0;

        while(i < arr.length){
            if(arr[i] > max) max = arr[i];
            i++;
        }

        return max;
    }

    public static int min(int[] arr){
        int min = arr[0];
        int i = 0;

        while(i < arr.length){
            if(arr[i] < min) min = arr[i];
            i++;
        }

        return min;
    }

    public static int sum(int[] arr){
        int sum = 0;
        int i = 0;

        while(i < arr.length){
            sum += arr[i];
            i++;
        }

        return sum;
    }

    public static float mean(int[] arr){
        return (float)sum(arr) / arr.length;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");

        int n;
        n = sc.nextInt();

        System.out.println("Enter array: ");

        int[] arr = new int[n];

        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Sum  = " + sum(arr));
        System.out.println("Min = " + min(arr));
        System.out.println("Max = " + max(arr));

        sc.close();
    }
}
