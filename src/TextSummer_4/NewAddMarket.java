package TextSummer_4;

import java.util.Scanner;

public class NewAddMarket {

    public MarketCollect addMarket() {
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        String userInputStr = "";
        MarketCollect userInput = null;
        while (check) {
            System.out.print("上場市場(Prime:P, Standard:S, Growth:G)>");
            userInputStr = scanner.nextLine();
            switch (userInputStr) {
                case "P" -> {
                    userInput = MarketCollect.Prime;
                    check = false;
                }
                case "S" -> {
                    userInput = MarketCollect.Standard;
                    check = false;
                }
                case "G" -> {
                    userInput = MarketCollect.Growth;
                    check = false;
                }
                default -> {
                    System.out.println("正しく入力してください。");
                    check = true;
                }
            }
        }return userInput;
    }
}
