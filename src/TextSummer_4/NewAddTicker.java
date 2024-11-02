package TextSummer_4;

import java.io.File;
import java.util.List;
import java.util.Scanner;

public class NewAddTicker {

    public String addTicker(File marketFile) {
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        String userInput = "";
        while (check) {
            System.out.print("銘柄コード>");
            userInput = scanner.nextLine();
            if (isTickerCheck(marketFile, userInput)) {
                System.out.println("既に入力されている銘柄コードです。やり直して。");
            }

            if (userInput.matches("^\\d{4}$|^[0-9][0-9ACDF-HJ-NPR-UW-Y][0-9][0-9ACDF-HJ-NPR-UW-Y]")) {
                check = false;
            }else {
                System.out.println("正しく入力されていません。やり直して。");
            }
        }return userInput;
    }

    public boolean isTickerCheck(File marketFile, String ticker) {
        List<Stock> stockList = MarketReader.readMarket(marketFile);
        for (Stock stock : stockList) {
            if (stock.getTicker().equals(ticker)) {
                return true;
            }
        }return false;
    }
}
