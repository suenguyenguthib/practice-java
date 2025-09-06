package dsa_codeforces.blue.lesson01;

import java.util.Scanner;
import java.util.ArrayList;

public class FashionInBerland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        ArrayList<Integer> buttons = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            buttons.add(scanner.nextInt());
        }

        if (buttons.size() == 1) {
            System.out.println(buttons.getFirst() == 1 ? "YES" : "NO");
        }

        else {
            int count = 0;
            for (Integer i : buttons) {
                if (i == 0)
                    count++;
            }
            System.out.println(count == 1 ? "YES" : "NO");
        }

        scanner.close();
    }
}
