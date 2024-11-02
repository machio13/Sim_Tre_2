package TextSummer_4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class NewAddAll {

    public void EntryAll(File marketFile) {
        NewAddName newAddName = new NewAddName();
        NewAddTicker newAddTicker = new NewAddTicker();
        NewAddMarket newAddMarket = new NewAddMarket();
        NewAddSharesIssued newAddSharesIssued = new NewAddSharesIssued();

        newAddName.addName(marketFile);
        newAddTicker.addTicker(marketFile);
        newAddMarket.addMarket();
        newAddSharesIssued.addSharesIssued();

        Stock stock = new Stock(newAddTicker.getNewTicker(), newAddName.getNewName(), newAddMarket.getNewMarket(), newAddSharesIssued.getNewSharesIssued());

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(marketFile, true))){
            bufferedWriter.write(stock.getTicker() + "," + stock.getName() + "," + stock.getMarket().getFirstChar() + "," + stock.getSharesIssued());
            bufferedWriter.newLine();

        }catch (IOException e) {
            System.out.println("正常に書き込みができませんでした。");
        }
    }
}
