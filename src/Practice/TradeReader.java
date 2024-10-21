package Practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class TradeReader {

    public static List<TradeStock> readTrade(File tradeFile) {
        List<TradeStock> tradeStockList = new ArrayList<>();

        String line = "";
        String lineSplit = ",";
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(tradeFile))){
            while ((line = bufferedReader.readLine()) != null) {
                String[] lineBox = line.split(lineSplit);

                LocalDateTime createTDTime = LocalDateTime.parse(lineBox[0]);
                long createQuantity = Long.parseLong(lineBox[3]);
                BigDecimal createTUPrice = new BigDecimal(lineBox[4]);
                LocalDateTime createIDTime = LocalDateTime.parse(lineBox[5]);
                tradeStockList.add(new TradeStock(createTDTime, lineBox[1], lineBox[2], createQuantity, createTUPrice, createIDTime));
            }

        }catch (IOException e) {
            System.out.println("正しく読み込むことができませんでした。");
        }
        tradeStockList.sort(Comparator.comparing(TradeStock::getInputDatetime).reversed());
        return tradeStockList;
    }

}
