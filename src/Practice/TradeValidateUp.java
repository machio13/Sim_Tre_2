package Practice;

import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.Scanner;

public class TradeValidateUp {
    private static LocalDateTime traded_Datetime;
    private static String trade_Name;
    private static String trade_Side;
    static Scanner scanner = new Scanner(System.in);

    public void valTradeTime() {
        boolean check = true;
        while (check) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd/HH:mm");
            System.out.print("取引日時(yyyy-MM-dd/HH:mm)>");
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

    public void valTradeName() {
        boolean check = true;
        while (check) {

        }
    }

    public static LocalDateTime getTraded_Datetime() {
        return traded_Datetime;
    }

    public static String getTrade_Name() {
        return trade_Name;
    }

    public static String getTrade_Side() {
        return trade_Side;
    }

}
