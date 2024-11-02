package TextSummer_4;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Scanner;

public class NewAddSharesIssued {

    public BigDecimal addSharesIssued() {
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        String userInputStr = "";
        BigDecimal userInput = null;

        while (check) {
            System.out.print("発行済み株式数>");
            userInputStr = scanner.nextLine();
            try {
                if (userInputStr.length() < 13) {
                    userInput = new BigDecimal(userInputStr);
                    check = false;
                }else {
                    System.out.println("12桁を超えています。入力し直してください。");
                }
            }catch (NumberFormatException e) {
                System.out.println("数字を入力してください。");
            }
        }return userInput;
    }
}
