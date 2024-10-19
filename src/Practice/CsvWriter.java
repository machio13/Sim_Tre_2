package Practice;

import javax.imageio.IIOException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CsvWriter {

    public static void writeCsv(File csvFile) {
        Stock stock = new Stock(NewEntryTicker.getEntryTicker(), NewEntryName.getEntryName()
                , NewEntryMarket.getEntryMarket(), NewEntrySharedIssued.getEntrySharedIssued());

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(csvFile, true))){
            bufferedWriter.write(stock.getTicker() + "," + stock.getName() + "," + stock.getMarket().getFirstName() + "," + stock.getSharedIssued());
            bufferedWriter.newLine();

        }catch (IOException e) {
            System.out.println("ファイルが読み込めません。");
        }
    }
}
