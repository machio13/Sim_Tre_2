package Practice;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NewEntryTicker {
    private static String entryTicker;

//    public NewEntryTicker(String entryTicker) {
//        this.entryTicker = entryTicker;
//    }

    public static void addTicker(File csvFile) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("銘柄名コード>");
            entryTicker = scanner.nextLine();
            if (isTickerCheck(csvFile, entryTicker)) {
                System.out.println("同じ銘柄が既に記入されています。やり直してください。");
                continue;
            }
            if (entryTicker.matches("^\\d{4}$|^[0-9][ACDF-HJ-NPR-UW-Y0-9][0-9][ACDF-HJ-NPR-UW-Y0-9]")) { //BEIOQVZを除く
                break;

            }else {
                System.out.println("使用できません。やり直してください。");
            }
        }
    }

    public static boolean isTickerCheck(File csvFile, String ticker) {
        List<Stock> stockList = CsvReader.readCsv(csvFile);
        for (Stock stock : stockList) {
            if (stock.getTicker().equals(ticker)) {
                return true;
            }
        }
        return false;
    }

    public static String getEntryTicker() {
        return entryTicker;
    }
}
