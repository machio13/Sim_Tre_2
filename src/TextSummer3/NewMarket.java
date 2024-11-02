package TextSummer3;

import javax.swing.plaf.ScrollBarUI;
import java.math.BigDecimal;
import java.util.Scanner;

public class NewMarket {

    public MarketBrand addMarket() {
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        String userInputStr = "";
        MarketBrand userInput = null;

        while (check) {
            System.out.print("上場市場(Prime:P, Standard:S, Growth:G)>");
            userInputStr = scanner.nextLine();

            switch (userInputStr) {
                case "P" -> {
                    userInput = MarketBrand.Prime;
                    check = false;
//                    return userInput;
                }
                case "S" -> {
                    userInput = MarketBrand.Standard;
                    check = false;
//                    return userInput;
                }
                case "G" -> {
                    userInput = MarketBrand.Growth;
                    check = false;
//                    return userInput;
                }
                default -> {
                    System.out.println("正しく入力してください。");
                    check = true;
                }
            }
        }return userInput;
    }
}
