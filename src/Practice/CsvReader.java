package Practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CsvReader {

    public static List<Stock> readCsv(File csvFile) {
        List<Stock> masterList = new ArrayList<>();

        String line = "";
        String lineSplit = ",";
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(csvFile))) {

            bufferedReader.readLine();

            while ((line = bufferedReader.readLine()) != null) {
                String[] lineBox = line.split(lineSplit);
                Market clearMarket = Market.fromCode(lineBox[2]);
                BigDecimal clearSharedIssued = new BigDecimal(lineBox[3]);
                masterList.add(new Stock(lineBox[0], lineBox[1], clearMarket, clearSharedIssued));
            }

        }catch (IOException e) {
            System.out.println("正しく読み込むことができませんでした。");
        }catch (NumberFormatException e) {
            System.out.println("次の行でcsvファイルの記述にエラーが起きています。");
        }
        return masterList;
    }
}
