package TextSummer3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;

public class NewEntryAll {
    public static void allNewEntry(File csvFile) {
        NewName newName = new NewName();
        NewTicker newTicker = new NewTicker();
//        Validation validation = new Validation();
//        validation.addTicker(csvFile);
        NewMarket newMarket = new NewMarket();
        NewSharesIssued newSharesIssued = new NewSharesIssued();


        String name = newName.addName(csvFile);
        String ticker = newTicker.addTicker(csvFile);
        MarketBrand market = newMarket.addMarket();
        BigDecimal sharesIssued = newSharesIssued.addSharesIssued();

        Stock stock = new Stock(ticker, name, market, sharesIssued);

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(csvFile, true))){
            bufferedWriter.write(stock.getTicker() + "," + stock.getName() + "," + stock.getMarket().getFirstChar() + "," + stock.getSharesIssued());

            bufferedWriter.newLine();

        }catch (IOException e) {
            System.out.println("正しく書き込みができませんでした。コードを見直してください。");
        }
    }
}
