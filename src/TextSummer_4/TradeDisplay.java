package TextSummer_4;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TradeDisplay extends Checker{

    public void showDisplay(List<TradeStock> tradeStockList) {
        System.out.println("|=======================================================================================================|");
        System.out.println("| Traded Datetime  | Name                  | Side | Quantity     | Traded Unit Price | Input Datetime   |");
        System.out.println("|------------------+-----------------------+------+--------------+-------------------+------------------|");

        for (TradeStock tradeStock : tradeStockList) {
            LocalDateTime TDTime = tradeStock.getTraded_Datetime();
            String tradeName = isNameLimitName(tradeStock.getTrade_Name());
            String tradeSide = tradeStock.getTrade_Side();
            String tradeQuantity = isFormatQuantity(tradeStock.getTrade_Quantity());
            String tradeUnitPrice = isFormatUnitPrice(tradeStock.getTraded_Unit_Price());
            LocalDateTime tradeIDTime = tradeStock.getTrade_Input_Datetime();

                    System.out.printf("| %-15s | %-21s | %4s | %12s | %17s | %15s |\n", TDTime, tradeName
            , tradeSide, tradeQuantity, tradeUnitPrice, tradeIDTime);
        }
        System.out.println("|=======================================================================================================|");
    }

    @Override
    int limitName() {
        return 19;
    }
}
