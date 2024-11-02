package TextSummer_4;

import java.io.File;
import java.util.List;
import java.util.Scanner;

public class NewAddName {
    private String newName;

    public void addName(File marketFile) {
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        while (check) {
            System.out.print("銘柄名>");
            newName = scanner.nextLine();
            if (isNameCheck(marketFile, newName)) {
                System.out.println("既に入力されている銘柄です。やり直して。");
            }

            if (newName.matches("[a-zA-Z0-9 .()]*")) {
                check = false;
            }else {
                System.out.println("正しく入力し直してください。");
            }
        }
    }

    public boolean isNameCheck(File marketFile, String name) {
        List<Stock> stockList = MarketReader.readMarket(marketFile);
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
