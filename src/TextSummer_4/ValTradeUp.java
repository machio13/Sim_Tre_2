package TextSummer_4;

import java.io.File;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.List;
import java.util.Scanner;

public class ValTradeUp {
    Scanner scanner = new Scanner(System.in);

    public LocalDateTime addTradedDatetime() {
        boolean check = true;
        String userInputStr = "";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("uuuu-MM-dd/HH:mm").withResolverStyle(ResolverStyle.STRICT);
        LocalDateTime userInput = null;
        while (check) {
            System.out.print("取引日時(yyyy-MM-dd/HH:mm)>");
            userInputStr = scanner.nextLine();
            try {
                LocalDateTime today = LocalDateTime.now();
                userInput = LocalDateTime.parse(userInputStr, formatter);
                DayOfWeek dayOfWeek = userInput.getDayOfWeek();
                if (userInput.isAfter(today) || userInput.equals(today)) {
                    switch (dayOfWeek) {
                        case SATURDAY -> System.out.println("土曜日なので時間外。");
                        case SUNDAY -> System.out.println("日曜日なので時間外。");
                        default -> {
                            if (userInput.getHour() >= 9 && userInput.getHour() < 15) {
                                check = false;
                            }else if (userInput.getHour() == 15 && userInput.getMinute() <= 30){
                                check = false;
                            }else {
                                System.out.println("9:00~15:30の時間外です。");
                            }
                        }
                    }
                }else {
                    System.out.println("日時が未来になっています。やり直し。");
                }
            }catch (DateTimeParseException e) {
                System.out.println("フォーマット通りに書き直してください。");
            }
        }return userInput;
    }

    public String addTradeName(File marketFile) {
        boolean check = true;
        String userInput = "";
        while (check) {
            System.out.print("銘柄名>");
            userInput = scanner.nextLine();
            if (isNameCheck(marketFile, userInput)) {
                System.out.println("確認しました。");
                check = false;
            }else {
                System.out.println("確認できません。");
            }
        }return userInput;
    }

    public boolean isNameCheck(File marketFile, String name) {
        List<Stock> stockList = MarketReader.readMarket(marketFile);
        for (Stock stock : stockList) {
            if (stock.getName().equals(name)) {
                return true;
            }
        }return false;
    }
}
