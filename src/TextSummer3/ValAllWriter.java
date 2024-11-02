package TextSummer3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ValAllWriter {

    public void writeTrade(File tradeCsv, File csvFile) {
        ValTradeUp valTradeUp = new ValTradeUp();
        ValTradeDown valTradeDown = new ValTradeDown();

        LocalDateTime tradedDatetime = valTradeUp.addTradeDatetime();
        String name = valTradeUp.addTradeName(csvFile);
        String side = valTradeDown.addTradeSide();
        long quantity = valTradeDown.addTradeQuantity();
        BigDecimal unitPrice = valTradeDown.addTradePrice();
        LocalDateTime inputDatetime = valTradeDown.addTradeInputDatetime();

        TradeStock tradeStock = new TradeStock(tradedDatetime, name, side, quantity, unitPrice, inputDatetime);

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(tradeCsv, true))){
            bufferedWriter.write(tradeStock.getTraded_Datetime() + "," + tradeStock.getTrade_Name() + ","
            + tradeStock.getTrade_side() + "," + tradeStock.getTrade_quantity() + ","
                    + tradeStock.getTrade_Unit_Price() + "," + tradeStock.getTrade_input_Datetime());

            bufferedWriter.newLine();

        }catch (IOException e){
            System.out.println("ファイルが読み込めませんでした。");
        }
    }

}
