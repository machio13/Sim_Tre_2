package TextSummer3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class NewEntryAll {
    public static void allNewEntry(File csvFile) {
        NewName newName = new NewName();
        NewTicker newTicker = new NewTicker();
        NewMarket newMarket = new NewMarket();
        NewSharesIssued newSharesIssued = new NewSharesIssued();

        newName.addName(csvFile);
        newTicker.addTicker(csvFile);
        newMarket.addMarket();
        newSharesIssued.addSharesIssued();

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(csvFile, true))){
            bufferedWriter.write(newTicker.getNewTicker() + "," + newName.getNewName() + "," + newMarket.getNewMarket().getFirstChar() + "," + newSharesIssued.getNewSharesIssued());
            bufferedWriter.newLine();

        }catch (IOException e) {
            System.out.println("正しく書き込みができませんでした。コードを見直してください。");
        }
    }
}
