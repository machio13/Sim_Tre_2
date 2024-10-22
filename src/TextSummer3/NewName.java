package TextSummer3;

import java.io.File;
import java.util.List;
import java.util.Scanner;

public class NewName {
    private String newName;

    public void addName(File csvFile) {
        Scanner scanner = new Scanner(System.in);
        boolean check = true;

        while (check) {
            System.out.print("銘柄名>");
            newName = scanner.nextLine();
            if (isNameChecker(csvFile, newName)) {
                System.out.println("既に登録されている銘柄名です。入力し直してください。");
            }

            if (newName.matches("[a-zA-Z0-9 .()]")) {
                check = false;
            }else {
                System.out.println("正しく入力してください。(半角英数字、半角スペース、半角カッコのみ可能)");
            }
        }
    }

    public static boolean isNameChecker(File csvFile, String name) {
        List<Stock> stockList = CsvReader.readingCsv(csvFile);
        for (Stock stock : stockList) {
            if (stock.getName().equals(name)) {
                return true;
            }
        }return false;
    }

    public String getNewName() {
        return newName;
    }
}
