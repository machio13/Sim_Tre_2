package Practice2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TradeValidateAll {

    public static void validateAll(File csvFile, File tradeFile) {
        TradeValidateUp tradeValidateUp = new TradeValidateUp();
        TradeValidateDown tradeValidateDown = new TradeValidateDown();

        tradeValidateUp.valTradeTime();
        tradeValidateUp.valTradeName(csvFile);
        tradeValidateDown.valTradeSide();
        tradeValidateDown.valTradeQuantity();
        tradeValidateDown.valTradeTUPrice();
        tradeValidateDown.valTradeInputDatetime();

        TradeStock tradeStock = new TradeStock(tradeValidateUp.getTraded_Datetime(), tradeValidateUp.getTrade_Name()
                , tradeValidateDown.getTrade_Side(), tradeValidateDown.getTrade_Quantity()
                , tradeValidateDown.getTrade_TUPrice(), tradeValidateDown.getTrade_InputDatetime());

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(tradeFile, true))) {
            bufferedWriter.write(tradeStock.getTradedDatetime() + "," +tradeStock.getTradeName()
                    + "," + tradeStock.getSide() + "," + tradeStock.getQuantity() + "," + tradeStock.getTradeUnitPrice()
                    + "," + tradeStock.getInputDatetime());
            bufferedWriter.newLine();

        }catch (IOException e) {
            System.out.println("正しく書き込みができませんでした。ソースコードを確認してください。");
        }
    }
}
