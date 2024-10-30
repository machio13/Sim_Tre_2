package TextSummer_4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MarketReader {

    public static List<Stock> readMarket(File marketFile) {
        List<Stock> stockList = new ArrayList<>();

        String line = "";
        String lineSplit = ",";

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(marketFile))) {

            bufferedReader.readLine();

            while ((line = bufferedReader.readLine()) != null) {
                String[] splitBox = line.split(lineSplit);
                MarketCollect replaceMarket = MarketCollect.fromCode(splitBox[2]);
                BigDecimal replaceSharesIssued = new BigDecimal(splitBox[3]);
                stockList.add(new Stock(splitBox[0], splitBox[1], replaceMarket, replaceSharesIssued));
            }
        }catch (IOException e) {
            System.out.println("ファイルが正常に読み込めませんでした。ファイルの中身を確認してください。");

        }return stockList;
    }
}
