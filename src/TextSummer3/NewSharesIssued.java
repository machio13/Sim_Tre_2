package TextSummer3;

import javax.swing.plaf.ScrollBarUI;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Scanner;

public class NewSharesIssued {
    private BigDecimal newSharesIssued;

    public void addSharesIssued() {
        Scanner scanner = new Scanner(System.in);
        boolean check = true;

        while(check) {
            System.out.print("発行済み株式数>");
            try {
                String userInput = scanner.nextLine();
                if (userInput.length() < 13) {
                    newSharesIssued = new BigDecimal(userInput);
                    check = false;
                }else {
                    System.out.println("12桁を超えた入力です。入力し直してください。");
                }
            }catch (NumberFormatException e) {
                System.out.println("数字を入力してください。");
            }
        }
    }

    public BigDecimal getNewSharesIssued() {
        return newSharesIssued;
    }
}
