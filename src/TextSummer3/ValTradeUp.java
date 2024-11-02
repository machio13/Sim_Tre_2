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
//    private LocalDateTime valTradeDatetime;
//    private String valTradeName;
    Scanner scanner = new Scanner(System.in);

    public LocalDateTime addTradeDatetime() {
        boolean check = true;
        String userInputStr = "";
        LocalDateTime userInput = null;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("uuuu-MM-dd/HH:mm").withResolverStyle(ResolverStyle.STRICT);
        while (check) {
            System.out.print("取引日時(yyyy-MM-dd/HH:mm)>");
            userInputStr = scanner.nextLine();

            try {
                userInput = LocalDateTime.parse(userInputStr,formatter);
                LocalDateTime today = LocalDateTime.now();

                DayOfWeek dayWeek = userInput.getDayOfWeek();

                if (userInput.isBefore(today) || userInput.isEqual(today)) {
                    switch (dayWeek) {
                        case SATURDAY,SUNDAY -> {
                            System.out.println("土日で取引時間外です。");
                        }
                        default -> {
                            if (userInput.getHour() > 8 && userInput.getHour() < 15) {
                                check = false;
                            }else if (userInput.getHour() == 15 && userInput.getMinute() <= 30) {
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
        }return userInput;
    }

    public String addTradeName(File csvFile){
        boolean check = true;
        String userInput = "";
        while (check) {
            System.out.print("銘柄名>");
            userInput = scanner.nextLine();
            if(isCheckName(csvFile, userInput)) {
                System.out.println("銘柄を確認しました。");
                check = false;
            }else {
                System.out.println("銘柄が存在しません。やり直してください。");
            }
        }return userInput;
    }

    public boolean isCheckName(File csvFile, String name) {
        List<Stock> stockList = CsvReader.readingCsv(csvFile);
        for (Stock stock : stockList) {
            if (stock.getName().equals(name)) {
                return true;
            }
        }return false;
    }
//
//    public LocalDateTime getValTradeDatetime() {
//        return valTradeDatetime;
//    }
//
//    public String getValTradeName() {
//        return valTradeName;
//    }
}
