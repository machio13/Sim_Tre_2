package TextSummer3;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.List;

public class CsvDisplay {

    public static String isNameLimit(String name) {
        if (name.length() > 29) {
            return (name.substring(0,26) + "...");
        }
        else {
            return name;
        }
    }

    public static String isSharesIssuedFormat(BigDecimal price) {
        DecimalFormat formatSharesIssued = new DecimalFormat("#,###");
        return formatSharesIssued.format(price);
    }

    public static void showCsv(List<Stock> stockList) {
        System.out.println("|=======================================================================|");
        System.out.println("| Ticker | Product Name                  | Market     | Shares Issued   |");
        System.out.println("|--------+-------------------------------+------------+-----------------|");

        for (Stock stock : stockList) {
            String  ticker = stock.getTicker();
            String name = stock.getName();
            MarketBrand market = stock.getMarket();
            BigDecimal sharesIssued = stock.getSharesIssued();

            String formatName = isNameLimit(name);
            String formatSharesIssued = isSharesIssuedFormat(sharesIssued);

            System.out.printf("|  %-6s| %-30s| %-11s| %15s |\n", ticker, formatName, market, formatSharesIssued);
        }
        System.out.println("|=======================================================================|");
    }
}
