package Practice;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.List;

public class CsvDisplay {

    public static String formatNum(BigDecimal num) {
        DecimalFormat decimalFormat = new DecimalFormat("#,###");
        return decimalFormat.format(num);
    }

    public static String cutName(String name) {
        if (name.length() > 29) {
            return (name.substring(0,26) + "...");
        }else {
            return name;
        }
    }

    public static void showCsv(List<Stock> masterList) {
        System.out.println("|=======================================================================|");
        System.out.println("| Ticker | Product Name                  | Market     | Shares Issued   |");
        System.out.println("|--------+-------------------------------+------------+-----------------|");

        for (Stock stock : masterList){
            String createTicker = stock.getTicker();
            String createName = stock.getName();
            Market createMarket = stock.getMarket();
            BigDecimal createSharedIssued = stock.getSharedIssued();

            String updateSharedIssued = formatNum(createSharedIssued);
            String updateName = cutName(createName);

            System.out.printf("|  %-6s| %-30s| %-11s| %15s |\n", createTicker, updateName, createMarket, updateSharedIssued);
        }


        System.out.println("|=======================================================================|");
    }

}
