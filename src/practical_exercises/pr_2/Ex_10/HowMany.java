package Ex_10;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter line:");
        String line = sc.nextLine();

        int count = 0;

        if(line.length() != 0){
            count++;
            for (int i = 0; i < line.length()-1; i++) {
                if(line.charAt(i) == ' ' && line.charAt(i+1) != ' '){
                    count++;
                }
            }
        }

        System.out.println(count+" words in line");
    }
}