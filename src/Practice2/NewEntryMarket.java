package Practice2;

import java.util.Scanner;

public class NewEntryMarket {
    private static Market entryMarket;

    public static void addMarket() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("上場市場(Prime:P, Standard:S, Growth:G)>");
            String userInput = scanner.next();
            switch (userInput) {
                case "P" -> {
                    entryMarket = Market.Prime;
                }
                case "S" -> {
                    entryMarket = Market.Standard;
                }
                case "G" -> {
                    entryMarket = Market.Growth;
                }
                default -> {
                    System.out.println("入力に誤りがあります。もう一度入力してください。");
                    continue;
                }
            }break;
        }
    }

    public static Market getEntryMarket() {
        return entryMarket;
    }
}
