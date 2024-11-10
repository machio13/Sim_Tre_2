package NewSimSummer;

import java.util.Scanner;

public class PlusMarket {

    public ExchangeMarket addMarket() {
        Scanner scanner = new Scanner(System.in);
        ExchangeMarket userInput = null;
        String userInputStr = "";
        boolean check = true;
        while (check) {
            System.out.print("上場市場(Prime:P, Standard:S, Growth:G)>");
            userInputStr = scanner.nextLine();
            switch (userInputStr) {
                case "P" -> {
                    userInput = ExchangeMarket.Prime;
                    check = false;
                }
                case "S" -> {
                    userInput = ExchangeMarket.Standard;
                    check = false;
                }
                case "G" -> {
                    userInput = ExchangeMarket.Growth;
                    check = false;
                }
                default -> {
                    System.out.println("記入が正しくありません。やり直し。");
                    check = true;
                }
            }
        }
        return userInput;
    }
}
