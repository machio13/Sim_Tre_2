package TextSummer3;

import java.io.File;
import java.util.List;
import java.util.Scanner;

public class NewTicker {

//    record Ticker(String ticker) implements Stock.tickers{}

    public String addTicker(File csvFile) {
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        String userInput = "";

        while (check) {
            System.out.print("銘柄コード>");
            userInput = scanner.nextLine();
            if (isTickerChecker(csvFile, userInput)) {
                System.out.println("既に登録されている銘柄です。入力し直してください。");
            }

            if (userInput.matches("^\\d{4}$|^[0-9][ACDF-HJ-NPR-UW-Y0-9][0-9][ACDF-HJ-NPR-UW-Y0-9]")) {
                check = false;
            }else {
                System.out.println("正しく入力してください。(半角英数字、半角スペース、半角カッコのみ可能)");
            }
        }return userInput;
    }

    public static Boolean isTickerChecker(File csvFile, String ticker) {
        List<Stock> stockList = CsvReader.readingCsv(csvFile);
        for (Stock stock : stockList) {
            if (stock.getTicker().equals(ticker)) {
                return true;
            }
        }return false;
    }

}
