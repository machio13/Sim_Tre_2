package TextSummer3;

import javax.swing.plaf.ScrollBarUI;
import java.util.Scanner;

public class NewMarket {
    private MarketBrand newMarket;

    public void addMarket() {
        Scanner scanner = new Scanner(System.in);
        boolean check = true;

        while (check) {
            System.out.print("上場市場(Prime:P, Standard:S, Growth:G)>");
            String userInput = scanner.nextLine();
            switch (userInput) {
                case "P" -> {
                    newMarket = MarketBrand.Prime;
                    check = false;
                }
                case "S" -> {
                    newMarket = MarketBrand.Standard;
                    check = false;
                }
                case "G" -> {
                    newMarket = MarketBrand.Growth;
                    check = false;
                }
                default -> {
                    newMarket = MarketBrand.Non;
                    System.out.println("正しく入力してください。");
                    check = true;
                }
            }
        }
    }

    public MarketBrand getNewMarket() {
        return newMarket;
    }
}
