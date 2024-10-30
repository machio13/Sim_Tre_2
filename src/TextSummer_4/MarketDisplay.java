package TextSummer_4;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.List;

public class MarketDisplay {

    public String isNameLimit(String name) {
        if (name.length() > 29) {
            return (name.substring(0, 26) + "...");
        }else {
            return name;
        }
    }

    public String isFormatPrice(BigDecimal price) {
        DecimalFormat priceFormater = new DecimalFormat("#,###");
        return priceFormater.format(price);
    }

    public void showMarket(List<Stock> stockList) {
        System.out.println("|=======================================================================|");
        System.out.println("| Ticker | Product Name                  | Market     | Shares Issued   |");
        System.out.println("|--------+-------------------------------+------------+-----------------|");

        for (Stock stock : stockList) {
            String ticker = stock.getTicker();
            String name = stock.getName();
            MarketCollect market = stock.getMarket();
            BigDecimal sharesIssued = stock.getSharesIssued();

            String formatName = isNameLimit(name);
            String formatSharesIssued = isFormatPrice(sharesIssued);

            System.out.printf("|  %-6s| %-30s| %-11s| %15s |\n", ticker, formatName, market, formatSharesIssued);
        }
        System.out.println("|=======================================================================|");
    }
}
