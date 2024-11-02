//package TextSummer3;
//
//import java.io.File;
//import java.util.Scanner;
//
//public abstract class UserInput {
//
//    public final String userInputMethod(File csvFile) {
//        boolean check = true;
//        String userInput = "";
//        while (check) {
//            Scanner scanner = new Scanner(System.in);
//            System.out.print(menuTicker());
//            userInput = scanner.nextLine();
//            if (validation(userInput, csvFile)) {
//                check = false;
//            }else {
//                System.out.println("入力不正");
//            }
//        }return userInput;
//    }
//
//    public abstract String menuTicker();
//    public abstract boolean validation(String userInput, File csvFile);
//}