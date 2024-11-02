package TextSummer3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CsvReader {

    public static List<Stock> readingCsv(File csvFile) {
        List<Stock> stockList = new ArrayList<>();

        String lineSplit = ",";
        String line = "";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(csvFile))){

            bufferedReader.readLine();

            while ((line = bufferedReader.readLine()) != null) {
                String[] lineBox = line.split(lineSplit);

                MarketBrand replaceMarket = MarketBrand.fromCode(lineBox[2]);
                BigDecimal replaceSharesIssued = new BigDecimal(lineBox[3]);

                stockList.add(new Stock(lineBox[0], lineBox[1], replaceMarket, replaceSharesIssued));
            }

        }catch (IOException e) {
            System.out.println("ファイルが読み込めませんでした。");
        }
        return stockList;
    }
}
