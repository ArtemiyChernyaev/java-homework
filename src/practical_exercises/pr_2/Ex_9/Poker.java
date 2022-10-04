package Ex_9;

import java.util.Scanner;
import java.util.Random;

public class Poker {
    public static void main(String[] args) {
        String[] suits = {"Сlub", "Spade", "Diamond", "Heart"};
        String[] ranks = {" 1", " 2", " 3", " 4", " 5", " 6", " 7", " 8", " 9", "10", " J", " Q", " K", " A" };
        boolean[][] deck = new boolean[suits.length][ranks.length];

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of players: ");
        int n = sc.nextInt();

        Random random = new Random();

        for (int i = 0; i < suits.length; ++i)
            for (int j = 0; j < ranks.length; ++j)
                deck[i][j] = false;

        for(int i = 0; i < n; ++i) {
            System.out.printf("Player %d: \n", (i + 1));

            for (int j = 0; j < 5; ++j) {
                int s = Math.abs(random.nextInt()) % suits.length;
                int r = Math.abs(random.nextInt()) % ranks.length;

                while(deck[s][r]) {
                    s = Math.abs(random.nextInt()) % suits.length;
                    r = Math.abs(random.nextInt()) % ranks.length;
                }
                System.out.println(ranks[r] + suits[s]);
                deck[s][r] = true;
            }
            System.out.println();
        }
    }
}
