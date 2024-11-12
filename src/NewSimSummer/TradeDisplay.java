package NewSimSummer;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class TradeDisplay extends Formater{

    public void showTrade(List<Trade> tradeList) {
        System.out.println("|================================================================================================================|");
        System.out.println("| Traded Datetime  | Name                            | Side | Quantity     | Trade Unit Price | Input Datetime   |");
        System.out.println("|------------------+---------------------------------+------+--------------+------------------+------------------|");

        for (Trade trade : tradeList) {
            LocalDateTime tradedDatetime = trade.getTradedDatetime();
            String name = isCutName(trade.getTradeName());
            String side = trade.getTradeSide();
            String quantity = isLongFormat(trade.getTradeQuantity());
            String unitPrice = isUnitPriceFormat(trade.getTradedUnitPrice());
            LocalDateTime inputDatetime = trade.getInputDatetime();

            System.out.printf("| %16s | %-31s | %-4s | %12s | %16s | %15s |\n", tradedDatetime, name, side, quantity, unitPrice, inputDatetime);
        }
        System.out.println("|================================================================================================================|");
    }

    @Override
    int cutNum() {
        return 31;
    }
}
