package TextSummer3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TradeReader {

    public List<TradeStock> readTrade(File tradeCsv) {
        List<TradeStock> tradeStockList = new ArrayList<>();

        String lineSplit = ",";
        String line = "";
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(tradeCsv))) {
            while ((line = bufferedReader.readLine()) != null) {
                String[] lineBox = line.split(lineSplit);
                LocalDateTime replaceTDTime = LocalDateTime.parse(lineBox[0]);
                long replaceQuantity = Long.parseLong(lineBox[3]);
                BigDecimal replaceTUPrice = new BigDecimal(lineBox[4]);
                LocalDateTime replaceITime = LocalDateTime.parse(lineBox[5]);

                tradeStockList.add(new TradeStock(replaceTDTime, lineBox[1], lineBox[2], replaceQuantity, replaceTUPrice, replaceITime));

            }
        }catch (IOException e) {
            System.out.println("ファイルが読み込めませんでした。");
        }
        tradeStockList.sort(Comparator.comparing(TradeStock::getTrade_input_Datetime).reversed());
        return tradeStockList;
    }
}
