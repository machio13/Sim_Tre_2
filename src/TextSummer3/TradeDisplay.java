package TextSummer3;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.util.List;

public class TradeDisplay {

    public void showTrade(List<TradeStock> tradeStockList, List<Stock> stockList) {
        System.out.println("|=============================================================================================================|");
        System.out.println("| Traded Datetime  | Product Name             | Side | Quantity        | Traded Unit Price | Input DateTime   |");
        System.out.println("|------------------+--------------------------+------+-----------------+-------------------+------------------|");


        for (TradeStock tradeStock : tradeStockList) {
            LocalDateTime updateTDTime = tradeStock.getTraded_Datetime();
            String updateName = tradeStock.getTrade_Name();
            String createName = isCutName(updateName);

            String updateSide = tradeStock.getTrade_side();
            long updateQuantity = tradeStock.getTrade_quantity();
            String formattedQuantity = isQuantityFormat(updateQuantity);
            BigDecimal updateTUPrice = tradeStock.getTrade_Unit_Price();
            String formattedTUPrice = isTUPriceFormat(updateTUPrice);
            LocalDateTime updateIDTime = tradeStock.getTrade_input_Datetime();

            System.out.printf("| %15s | %-24s | %4s | %15s | %17s | %14s |\n", updateTDTime, createName, updateSide, formattedQuantity, formattedTUPrice, updateIDTime);
        }
        System.out.println("|=============================================================================================================|");
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

    public String isCutName(String name) {
        if (name.length() > 24) {
            return (name.substring(0, 21) + "...");
        }else {
            return name;
        }
    }
}