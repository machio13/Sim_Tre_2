//package Horyuu;
//
//import TextSummer3.MarketBrand;
//import TextSummer3.UserInput;
//
//import java.io.File;
//
//public class InputMarket extends UserInput {
//    @Override
//    public String menuTicker() {
//        return "上場市場>";
//    }
//
//    @Override
//    public boolean validation(String userInput, File csvFile) {
//        switch (userInput) {
//            case "P" -> {
//                String.valueOf(MarketBrand.Prime);
//                return true;
//            }
//            case "S" -> {
//                String.valueOf(MarketBrand.Standard);
//                return true;
//            }
//            case "G" -> {
//                String.valueOf(MarketBrand.Growth);
//                return true;
//            }
//            default -> {
//                String.valueOf(MarketBrand.Non);
//                System.out.println("正しく入力してください。");
//            }
//        }return false;
//    }
//}
