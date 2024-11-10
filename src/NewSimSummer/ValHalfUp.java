package NewSimSummer;

import java.io.File;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.List;
import java.util.Scanner;

public class ValHalfUp extends Checker{
    Scanner scanner = new Scanner(System.in);

    public LocalDateTime addTradeTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("uuuu-MM-dd/HH:mm").withResolverStyle(ResolverStyle.STRICT);
        String userInputStr = "";
        LocalDateTime userInput = null;
        LocalDateTime today = LocalDateTime.now();
        boolean check = true;
        while (check){
            System.out.print("取引日時(yyyy-MM-dd/HH:mm)>");
            userInputStr = scanner.nextLine();
            try{
                userInput = LocalDateTime.parse(userInputStr, formatter);
                DayOfWeek dayOfWeek = userInput.getDayOfWeek();
                if (userInput.isBefore(today) || userInput.equals(today)) {
                    switch (dayOfWeek) {
                        case SATURDAY, SUNDAY -> {
                            System.out.println("土日で時間外");
                        }
                        default -> {
                            if (userInput.getHour() >= 9 && userInput.getHour() <= 14) {
                                check = false;
                            } else if (userInput.getHour() == 15 && userInput.getMinute() <= 30) {
                                check = false;
                            } else {
                                System.out.println("平日ですが時間外です。");
                                check = true;
                            }
                        }
                    }
                }else {
                    System.out.println("日付が未来になっています。");
                }
            }catch (DateTimeParseException e) {
                System.out.println("フォーマット通り記入し直して");
            }
        }
        return userInput;
    }

    public String addName(File marketFile) {
        boolean check = true;
        String userInput = "";
        while (check) {
            System.out.print("銘柄名>");
            userInput = scanner.nextLine();
            if (isNameCheck(marketFile, userInput)) {
                System.out.println("正常な入力です");
                check = false;
            }else {
                System.out.println("記入されている銘柄名が見つかりません。");
            }
        }
        return userInput;
    }
}
