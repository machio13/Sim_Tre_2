package Practice;

import java.io.File;
import java.util.List;
import java.util.Scanner;

public class Menu {

    public void menuList() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("株式管理システムを開始します。");
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("操作するメニューを選んでください。");
            System.out.println("1. 銘柄マスタ一覧表示");
            System.out.println("2. 銘柄マスタ新規登録");
            System.out.println("9. アプリケーションを終了する");
            System.out.print("入力してください：");
            int userInput = scanner.nextInt();
            File csvFile = new File("src/Practice/Master.csv");

            switch (userInput) {
                case 9 -> {
                    System.out.println("アプリケーションを終了します。");
                    isRunning = false;
                }
                case 1 -> {
                    System.out.println("「銘柄マスタ一覧表示」が選択されました。");
                    List<Stock> csvRead = CsvReader.readCsv(csvFile);
                    CsvDisplay.showCsv(csvRead);
                    System.out.println("---");
                }
                case 2 -> {
                    System.out.println("「銘柄マスタ新規登録」が選択されました。");
                    NewEntryName.addName();
                    NewEntryTicker.addTicker(csvFile);
                    NewEntryMarket.addMarket();
                    NewEntrySharedIssued.addSharedIssued();

                    CsvWriter.writeCsv(csvFile);
                    System.out.println("---");
                }
                default -> {
                    System.out.println("\"" + userInput + "\"に対応するメニューは存在しません" );
                    System.out.println("---");
                }
            }
        }
    }
}
