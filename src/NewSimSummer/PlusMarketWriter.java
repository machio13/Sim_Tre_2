package NewSimSummer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PlusMarketWriter {

    public void writeMarket(File marketFile) {
        PlusTicker plusTicker = new PlusTicker();
        PlusName plusName = new PlusName();
        PlusMarket plusMarket = new PlusMarket();
        PlusSharesIssued plusSharesIssued = new PlusSharesIssued();

        Stockers stockers = new Stockers(plusTicker.addTicker(marketFile), plusName.addName(marketFile), plusMarket.addMarket(), plusSharesIssued.addSharesIssued());

        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(marketFile, true))) {
            bufferedWriter.write(stockers.getTicker() + "," + stockers.getName() + "," + stockers.getMarket().getFirstChar() + "," + stockers.getSharesIssued());
            bufferedWriter.newLine();

        }catch (IOException e) {
            System.out.println("ファイルが正常に読み込めませんでした。");
        }
    }
}
