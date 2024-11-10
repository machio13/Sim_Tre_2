package NewSimSummer;

import java.io.File;
import java.util.List;

public abstract class Checker {

    public boolean isNameCheck (File marketFile, String name) {
        List<Stockers> stockersList = MarketCsvReader.readMarketCsv(marketFile);
        for (Stockers stockers : stockersList) {
            if (stockers.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public boolean isTickerCheck (File marketFile, String ticker) {
        List<Stockers> stockersList = MarketCsvReader.readMarketCsv(marketFile);
        for (Stockers stockers : stockersList) {
            if (stockers.getTicker().equals(ticker)) {
                return true;
            }
        }
        return false;
    }
}
