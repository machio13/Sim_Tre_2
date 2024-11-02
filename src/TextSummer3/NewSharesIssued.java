package TextSummer3;

import java.math.BigDecimal;
import java.util.Scanner;

public class NewSharesIssued {

    public BigDecimal addSharesIssued() {
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        String userInputStr = "";
        BigDecimal userInput = null;

        while(check) {
            System.out.print("発行済み株式数>");
            try {
                userInputStr = scanner.nextLine();
                if (userInputStr.length() < 13) {
                    userInput = new BigDecimal(userInputStr);
                    check = false;
                }else {
                    System.out.println("12桁を超えた入力です。入力し直してください。");
                }
            }catch (NumberFormatException e) {
                System.out.println("数字を入力してください。");
            }
        }return userInput;
    }
}
