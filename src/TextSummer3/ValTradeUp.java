package TextSummer3;

import java.io.File;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.List;
import java.util.Scanner;

public class ValTradeUp {
    private LocalDateTime valTradeDatetime;
    private String valTradeName;
    Scanner scanner = new Scanner(System.in);

    public void addTradeDatetime() {
        boolean check = true;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("uuuu-MM-dd/HH:mm").withResolverStyle(ResolverStyle.STRICT);
        while (check) {
            System.out.print("取引日時(yyyy-MM-dd/HH:mm)>");
            String userInput = scanner.nextLine();

            try {
                valTradeDatetime = LocalDateTime.parse(userInput,formatter);
                LocalDateTime today = LocalDateTime.now();

                DayOfWeek dayWeek = valTradeDatetime.getDayOfWeek();

                if (valTradeDatetime.isBefore(today) || valTradeDatetime.isEqual(today)) {
                    switch (dayWeek) {
                        case SATURDAY,SUNDAY -> {
                            System.out.println("土日で取引時間外です。");
                        }
                        default -> {
                            if (valTradeDatetime.getHour() > 8 && valTradeDatetime.getHour() < 15) {
                                check = false;
                            }else if (valTradeDatetime.getHour() == 15 && valTradeDatetime.getMinute() <= 30) {
                                check = false;
                            }else {
                                System.out.println("取引時間外です");
                            }
                        }
                    }
                }else {
                    System.out.println("未来になっています。");
                }
            }catch (DateTimeParseException e) {
                System.out.println("規定通りに正しく入力されていません。入力し直してください。");
            }
        }
    }

    public void addTradeName(File csvFile){
        boolean check = true;
        while (check) {
            System.out.print("銘柄名>");
            valTradeName = scanner.nextLine();
            if(isCheckName(csvFile, valTradeName)) {
                System.out.println("銘柄を確認しました。");
                check = false;
            }else {
                System.out.println("銘柄が存在しません。やり直してください。");
            }
        }
    }

    public boolean isCheckName(File csvFile, String name) {
        List<Stock> stockList = CsvReader.readingCsv(csvFile);
        for (Stock stock : stockList) {
            if (stock.getName().equals(name)) {
                return true;
            }
        }return false;
    }

    public LocalDateTime getValTradeDatetime() {
        return valTradeDatetime;
    }

    public String getValTradeName() {
        return valTradeName;
    }
}
