package Practice;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Locale;

public class TradeDisplay {

    public void showTrade(List<TradeStock> tradeStockList) {
        System.out.println("|=============================================================================================================|");
        System.out.println("| Traded Datetime  | Product Name             | Side | Quantity        | Traded Unit Price | Input DateTime   |");
        System.out.println("|------------------+--------------------------+------+-----------------+-------------------+------------------|");

        for (TradeStock tradeStock : tradeStockList) {
            LocalDateTime updateTDTime = tradeStock.getTradedDatetime();
            String updateName = tradeStock.getTradeName();
            String updateSide = tradeStock.getSide();
            long updateQuantity = tradeStock.getQuantity();
            String formattedQuantity = isQuantityFormat(updateQuantity);
            BigDecimal updateTUPrice = tradeStock.getTradeUnitPrice();
            String formattedTUPrice = isTUPriceFormat(updateTUPrice);
            LocalDateTime updateIDTime = tradeStock.getInputDatetime();

            System.out.printf("| %15s | %-24s | %4s | %15s | %17s | %14s |\n", updateTDTime, updateName, updateSide, formattedQuantity, formattedTUPrice, updateIDTime);
        }
        System.out.println("|=================================================+===========================================================|");
    }

    public String isQuantityFormat(long quantity) {
        BigDecimal bigDecimal = new BigDecimal(quantity);
        DecimalFormat decimalFormat = new DecimalFormat("#,###");
        return decimalFormat.format(bigDecimal);
    }

    public String isTUPriceFormat(BigDecimal TUPrice) {
        DecimalFormat decimalFormat = new DecimalFormat("#,###.##");
        return decimalFormat.format(TUPrice);
    }
}
