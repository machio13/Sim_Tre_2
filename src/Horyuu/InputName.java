//package Horyuu;
//
//import TextSummer3.CsvReader;
//import TextSummer3.Stock;
//import TextSummer3.UserInput;
//
//import java.io.File;
//import java.util.List;
//
//public class InputName extends UserInput {
//
//    @Override
//    public String menuTicker() {
//        return "銘柄名>";
//    }
//
//    @Override
//    public boolean validation(String userInput, File csvFile) {
//        if (isNameChecker(csvFile, userInput)) {
//            System.out.println("既に登録されている銘柄名です。入力し直してください。");
//        }
//
//        if (userInput.matches("[a-zA-Z0-9 .()]*")) {
//            return true;
//        }else {
//            System.out.println("正しく入力してください。(半角英数字、半角スペース、半角カッコのみ可能)");
//        }
//        return false;
//    }
//
//    public static boolean isNameChecker(File csvFile, String name) {
//        List<Stock> stockList = CsvReader.readingCsv(csvFile);
//        for (Stock stock : stockList) {
//            if (stock.getName().equals(name)) {
//                return true;
//            }
//        }return false;
//    }
//}
