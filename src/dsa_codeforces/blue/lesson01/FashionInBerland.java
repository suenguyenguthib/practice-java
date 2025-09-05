package dsa_codeforces.blue.lesson01;

import java.util.Scanner;
import java.util.ArrayList;

public class FashionInBerland {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        ArrayList<Integer> buttons = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            buttons.add(input.nextInt());
        }

        if (n == 1) {
            System.out.println(buttons.getFirst() == 1 ? "YES" : "NO");
        }

        else {
            int countUnfastenedButton = 0;
            for (int i = 0; i < n; i++) {
                if (buttons.get(i) == 0) {
                    countUnfastenedButton++;
                }
            }

            System.out.println(countUnfastenedButton == 1 ? "YES" : "NO");
        }
    }
}
