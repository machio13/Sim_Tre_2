package TextSummer_4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ValTradeAllWriter {

    public void tradeWriter(File marketFile, File tradeFile) {
        ValTradeUp valTradeUp = new ValTradeUp();
        ValTradeDown valTradeDown = new ValTradeDown();

        TradeStock tradeStock = new TradeStock(valTradeUp.addTradedDatetime(), valTradeUp.addTradeName(marketFile), valTradeDown.addSide(),
                valTradeDown.addQuantity(), valTradeDown.addUnitPrice(), valTradeDown.addInputDatetime());

        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(tradeFile, true))) {
            bufferedWriter.write(tradeStock.getTraded_Datetime() + "," + tradeStock.getTrade_Name()
            + "," + tradeStock.getTrade_Side() + "," + tradeStock.getTrade_Quantity()
                    + "," + tradeStock.getTraded_Unit_Price() + "," + tradeStock.getTrade_Input_Datetime());
            bufferedWriter.newLine();
        }catch (IOException e) {
            System.out.println("ファイルにかきこみできませんでした。");
        }
    }
}
