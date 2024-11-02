package TextSummer_4;

import java.util.Scanner;

public class NewAddMarket {
    private MarketCollect newMarket;

    public void addMarket() {
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        while (check) {
            System.out.print("上場市場(Prime:P, Standard:S, Growth:G)>");
            String userInput = scanner.nextLine();
            switch (userInput) {
                case "P" -> {
                    newMarket = MarketCollect.Prime;
                    check = false;
                }
                case "S" -> {
                    newMarket = MarketCollect.Standard;
                    check = false;
                }
                case "G" -> {
                    newMarket = MarketCollect.Growth;
                    check = false;
                }
                default -> {
                    System.out.println("正しく入力してください。");
                    check = true;
                }
            }
        }
    }

    public MarketCollect getNewMarket() {
        return newMarket;
    }
}
