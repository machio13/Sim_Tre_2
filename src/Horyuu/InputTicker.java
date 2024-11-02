//package Horyuu;
//
//import TextSummer3.CsvReader;
//import TextSummer3.Stock;
//import TextSummer3.UserInput;
//
//import java.io.File;
//import java.util.List;
//
//public class InputTicker extends UserInput {
//
//    @Override
//    public String menuTicker() {
//        return "銘柄コード>";
//    }
//
//    @Override
//    public boolean validation(String userInput, File csvFile) {
//        if (isTickerChecker(csvFile, userInput)) {
//            System.out.println("既に登録されている銘柄です。入力し直してください。");
//        }
//
//        if (userInput.matches("^\\d{4}$|^[0-9][ACDF-HJ-NPR-UW-Y0-9][0-9][ACDF-HJ-NPR-UW-Y0-9]")) {
//            return true;
//        } else {
//            System.out.println("正しく入力してください。(半角英数字、半角スペース、半角カッコのみ可能)");
//        }
//        return false;
//    }
//
//    public static Boolean isTickerChecker(File csvFile, String ticker) {
//        List<Stock> stockList = CsvReader.readingCsv(csvFile);
//        for (Stock stock : stockList) {
//            if (stock.getTicker().equals(ticker)) {
//                return true;
//            }
//        }return false;
//    }
//
//
//}
