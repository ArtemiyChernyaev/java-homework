import java.util.Scanner;
import java.util.Random;
import java.util.*;

public class Ex_4 {
    public static int[] add(int Arr[], int n)
    {
        int [] newArr = new int[Arr.length+1];

        for (int i = 0; i < Arr.length; i++){
            newArr[i] = Arr[i];
        }
        newArr[Arr.length] = n;

        return newArr;
    }

    public static void main(String[] args) {
        int minN = 10;
        Scanner sc = new Scanner(System.in);
        int n;

        while(true){
            System.out.println("Enter integer num more than " + minN + ":");
            n = sc.nextInt();
            if(n > minN){
                break;
            }
        }

        Random random = new Random();
        int [] Arr = new int[n];

        for (int i = 0; i < n; i++) {
            Arr[i] = random.nextInt(n+1);
        }

        for (int i = 0; i < n; i++) {
            System.out.println(Arr[i]);
        }

        int [] ArrEven = new int[0];

        for (int i = 0; i < n; i++){
            if(Arr[i]%2 == 0){
                ArrEven = add(ArrEven, Arr[i]);
            }
        }

        System.out.println("\n");

        for (int i = 0; i < ArrEven.length; i++) {
            System.out.println(ArrEven[i]);
        }

    }
}
