package TextSummer3;

import javax.swing.plaf.ScrollBarUI;
import java.util.Scanner;

public class NewMarket {
    private MarketBrand newMarket;

    public void addMarket() {
        Scanner scanner = new Scanner(System.in);
        boolean check = true;

        while (check) {
            System.out.print("上場市場>");
            String userInput = scanner.nextLine();
            switch (userInput) {
                case "P" -> newMarket = MarketBrand.Prime;
                case "S" -> newMarket = MarketBrand.Standard;
                case "G" -> newMarket = MarketBrand.Growth;
                default -> newMarket = MarketBrand.Non;
            }
        }
    }

    public MarketBrand getNewMarket() {
        return newMarket;
    }
}
