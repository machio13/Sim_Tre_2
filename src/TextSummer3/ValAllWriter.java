package TextSummer3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ValAllWriter {

    public void writeTrade(File tradeCsv, File csvFile) {
        ValTradeUp valTradeUp = new ValTradeUp();
        ValTradeDown valTradeDown = new ValTradeDown();

        valTradeUp.addTradeDatetime();
        valTradeUp.addTradeName(csvFile);
        valTradeDown.addTradeSide();
        valTradeDown.addTradeQuantity();
        valTradeDown.addTradePrice();
        valTradeDown.addTradeInputDatetime();

        TradeStock tradeStock = new TradeStock(valTradeUp.getValTradeDatetime(), valTradeUp.getValTradeName(),
                valTradeDown.getValTradeSide(), valTradeDown.getValTradeQuantity(), valTradeDown.getValPrice(), valTradeDown.getValInputDatetime());

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
