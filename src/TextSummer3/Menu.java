package TextSummer3;

import java.awt.*;
import java.io.File;
import java.util.List;
import java.util.Scanner;

public class Menu {

    public void MenuSelect() {
        System.out.println("株式管理システムを開始します。");
        Scanner scanner = new Scanner(System.in);
        File csvFile = new File("src/TextSummer3/Masterd.csv");

        boolean isRunning = true;
        while (isRunning){
            System.out.println("操作するメニューを選択してください。");
            System.out.println("1. 銘柄マスタ一覧表示");
            System.out.println("2. 銘柄マスタ新規登録");
            System.out.println("3. 取引入力");
            System.out.println("4. 取引表示");
            System.out.println("9. アプリケーションを終了する");
            System.out.print("入力してください：");
            String userInput = scanner.nextLine();

            switch (userInput) {
                case "1" -> {
                    System.out.println("「銘柄マスタ一覧表示」が選択されました。");
                    List<Stock> readCsv = CsvReader.readingCsv(csvFile);
                    CsvDisplay.showCsv(readCsv);
                    System.out.println("---");
                }
                case "2" -> {
                    System.out.println("「銘柄マスタ新規登録」が選択されました。");
                    System.out.println("---");
                }
                case "3" -> {
                    System.out.println("「取引入力」が選択されました。");
                    System.out.println("---");
                }
                case "4" -> {
                    System.out.println("「取引表示」が選択されました。");
                    System.out.println("---");
                }
                case "9" -> {
                    System.out.println("アプリケーションを終了します。");
                    System.out.println("---");
                    isRunning = false;
                }
                default -> {
                    System.out.println("\"" + userInput + "\"に対応するメニューは存在しません。");
                    System.out.println("---");
                }
            }
        }
    }
}
