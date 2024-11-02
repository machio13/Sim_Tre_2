//package Horyuu;
//
//import TextSummer3.UserInput;
//
//import java.io.File;
//import java.math.BigDecimal;
//
//public class InputSharesIssued extends UserInput {
//    @Override
//    public String menuTicker() {
//        return "発行済み株式数>";
//    }
//
//    @Override
//    public boolean validation(String userInput, File csvFile) {
//        try {
//            if (userInput.length() < 13) {
//                new BigDecimal(userInput);
//                return true;
//            }else {
//                System.out.println("12桁を超えた入力です。入力し直してください。");
//            }
//        }catch (NumberFormatException e) {
//            System.out.println("数字を入力してください。");
//        }
//
//        return false;
//    }
//}
