package Practice;

import javax.swing.plaf.ScrollBarUI;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Scanner;

public class NewEntrySharedIssued {
    private static BigDecimal entrySharedIssued;

    public static void addSharedIssued() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("発行済み株式数>");
                String userInput = scanner.nextLine();
                if (userInput.length() < 13) {
                    entrySharedIssued = new BigDecimal(userInput);
                    break;
                } else {
                    System.out.println("12桁を超えています。");
                }
            } catch (NumberFormatException e) {
                    System.out.println("数字を入力してください。");
            }
        }
    }

    public static BigDecimal getEntrySharedIssued() {
        return entrySharedIssued;
    }
}
