package TextSummer3;

import java.io.File;
import java.util.List;
import java.util.Scanner;

public class NewName {

    public String addName(File csvFile) {
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        String userInput = "";

        while (check) {
            System.out.print("銘柄名>");
            userInput = scanner.nextLine();
            if (isNameChecker(csvFile, userInput)) {
                System.out.println("既に登録されている銘柄名です。入力し直してください。");
            }

            if (userInput.matches("[a-zA-Z0-9 .()]*")) {
                check = false;
            }else {
                System.out.println("正しく入力してください。(半角英数字、半角スペース、半角カッコのみ可能)");
            }
        }return userInput;
    }

    public static boolean isNameChecker(File csvFile, String name) {
        List<Stock> stockList = CsvReader.readingCsv(csvFile);
        for (Stock stock : stockList) {
            if (stock.getName().equals(name)) {
                return true;
            }
        }return false;
    }

}
