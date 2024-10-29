package Practice2;

import java.io.File;
import java.util.List;
import java.util.Scanner;

public class NewEntryName {
    public static String entryName;

    public static void addName(File csvFile) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("銘柄名>");
            entryName = scanner.nextLine();
            if (isNameCheck(csvFile, entryName)) {
                System.out.println("同じ銘柄が既に記入されています。");
                continue;
            }

            if (entryName.matches("[a-zA-Z0-9 .()]*")) {
                break;
            }else {
                System.out.println("使用できない文字が含まれています。記入し直してください。");
            }
        }
    }

    public static boolean isNameCheck(File csvFile, String name) {
        List<Stock> stockList = CsvReader.readCsv(csvFile);
        for (Stock stock : stockList) {
            if (stock.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public static String getEntryName() {
        return entryName;
    }
}
