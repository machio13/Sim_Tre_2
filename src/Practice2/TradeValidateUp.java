package Practice2;

import java.io.File;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.List;
import java.util.Scanner;

public class TradeValidateUp {
    private LocalDateTime traded_Datetime;
    private String trade_Name;
    Scanner scanner = new Scanner(System.in);

    public void valTradeTime() {
        boolean check = true;
        while (check) {
//            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd/HH:mm");
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("uuuu-MM-dd/HH:mm").withResolverStyle(ResolverStyle.STRICT);
            System.out.print("取引日時(yyyy-MM-dd/HH:mm)>");
//            String userInput = "2024-10-17/12:00";
            String userInput = scanner.nextLine();
            try {
                traded_Datetime = LocalDateTime.parse(userInput, formatter);
                LocalDateTime today = LocalDateTime.now();

                DayOfWeek dayOfWeek = traded_Datetime.getDayOfWeek();

                if ((traded_Datetime.isBefore(today)) || (traded_Datetime.isEqual(today))) {
                    switch (dayOfWeek) {
                        case MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY -> {
                            if (traded_Datetime.getHour() >= 9 && traded_Datetime.getHour() <= 14) {
                                check = false;
                            }else if (traded_Datetime.getHour() == 15 && traded_Datetime.getMinute() <= 30) {
                                check = false;
                            }else {
                                System.out.println("時間外です。");
                            }
                        }
                        default -> System.out.println("土日は時間外です。");
                    }
                }else {
                    System.out.println("日付が未来になっています。入力し直してください。");
                }
            }catch (DateTimeParseException e) {
                System.out.println("正常に入力できていません。入力し直して下さい。");
            }
        }
    }

    public void valTradeName(File csvFile) {
        boolean check = true;
        while (check) {
            System.out.print("銘柄名>");
//            trade_Name = "0racle Corporation Japan";
            trade_Name = scanner.nextLine();
            if (isNameCheck(csvFile, trade_Name)) {
                check = false;
            }else {
                System.out.println("銘柄が存在しません。正しく記入してください。");
            }
        }
    }

    public boolean isNameCheck(File csvFile, String name) {
        List<Stock> stockList = CsvReader.readCsv(csvFile);
        for (Stock stock : stockList) {
            if (stock.getName().equals(name)) {
                System.out.println("正常な入力です。");
                return true;
            }
        }
        System.out.println("不正な入力です。");
        return false;
    }

    public LocalDateTime getTraded_Datetime() {
        return traded_Datetime;
    }

    public String getTrade_Name() {
        return trade_Name;
    }

}
