package TextSummer_4;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.List;

public class MarketDisplay extends Checker {

    public void showMarket(List<Stock> stockList) {
        System.out.println("|=======================================================================|");
        System.out.println("| Ticker | Product Name                  | Market     | Shares Issued   |");
        System.out.println("|--------+-------------------------------+------------+-----------------|");

        for (Stock stock : stockList) {
            String ticker = stock.getTicker();
            String name = stock.getName();
            MarketCollect market = stock.getMarket();
            BigDecimal sharesIssued = stock.getSharesIssued();

            String formatName = isNameLimitName(name);
            String formatSharesIssued = isFormatPrice(sharesIssued);

            System.out.printf("|  %-6s| %-30s| %-11s| %15s |\n", ticker, formatName, market, formatSharesIssued);
        }
        System.out.println("|=======================================================================|");
    }

    @Override
    int limitName() {
        return 26;
    }
}
