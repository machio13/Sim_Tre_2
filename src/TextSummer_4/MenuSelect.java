package TextSummer_4;

import java.io.File;
import java.util.List;
import java.util.Scanner;

public class MenuSelect {
    public void selectMenu() {
        System.out.println("株式取引管理システムを開始します。");
        boolean exit = true;
        Scanner scanner = new Scanner(System.in);
        File marketCsvFile = new File("src/TextSummer_4/MarketList.csv");

        while (exit) {
            System.out.println("操作するメニューを選んでください。");
            System.out.println("1. 銘柄マスタ一覧表示");
            System.out.println("2. 銘柄マスタ新規登録");
            System.out.println("3. 取引入力");
            System.out.println("4. 取引一覧表示");
            System.out.println("9. アプリケーションを終了する");
            System.out.print("入力してください>");
            String userInputStr = scanner.nextLine();

            switch (userInputStr){
                case "1" -> {
                    System.out.println("「銘柄マスタ一覧表示」が選択されました。");
                    List<Stock> readMarketList = MarketReader.readMarket(marketCsvFile);
                    MarketDisplay marketDisplay = new MarketDisplay();
                    marketDisplay.showMarket(readMarketList);
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
                    System.out.println("「取引一覧表示」が選択されました。");
                    System.out.println("---");
                }
                case "9" -> {
                    System.out.println("アプリケーションを終了します。");
                    System.out.println("---");
                    exit = false;
                }
                default -> {
                    System.out.println("\"" + userInputStr + "\"に対応するメニューは存在しません。");
                    System.out.println("---");
                }
            }
        }
    }
}
