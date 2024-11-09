package TextSummer_4;

import java.io.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TradeReader {
    public static List<TradeStock> tradeReader (File tradeFile) {
        List<TradeStock> tradeStockList = new ArrayList<>();

        String lineSplit = ",";
        String line = "";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(tradeFile))){
            while ((line = bufferedReader.readLine()) != null) {
                String[] lineBox = line.split(lineSplit);
                LocalDateTime replaceTDTime = LocalDateTime.parse(lineBox[0]);
                long replaceQuantity = Long.parseLong(lineBox[3]);
                BigDecimal replaceTUPrice = new BigDecimal(lineBox[4]);
                LocalDateTime replaceIDTime = LocalDateTime.parse(lineBox[5]);

                tradeStockList.add(new TradeStock(replaceTDTime, lineBox[1], lineBox[2], replaceQuantity, replaceTUPrice, replaceIDTime));
            }
        }catch (IOException e) {
                System.out.println("ファイルがうまく読み込めませんでした。");
        }
        Collections.sort(tradeStockList, Comparator.comparing(TradeStock::getTrade_Input_Datetime).reversed());
        return tradeStockList;
    }
}
