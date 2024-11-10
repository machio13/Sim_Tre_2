package NewSimSummer;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class ValHalfDown {
    Scanner scanner = new Scanner(System.in);

    public String addSide() {
        String userInput = "";
        boolean check = true;
        while (check) {
            System.out.print("売買区分(Sell or Buy)>");
            userInput = scanner.nextLine();
            if (userInput.equals("Sell") || userInput.equals("Buy")) {
                check = false;
            }else {
                System.out.println("正しく記入し直してください。");
            }
        }return userInput;
    }

    public long addQuantity() {
        String userInputStr = "";
        long userInput = 0;
        boolean check = true;
        while (check) {
            System.out.print("数量(100株単位)>");
            userInputStr = scanner.nextLine();
            try {
                userInput = Long.parseLong(userInputStr);
                if (userInput % 100 == 0) {
                    check = false;
                }else {
                    System.out.println("100株単位で入力してください");
                }
            }catch (NumberFormatException e) {
                System.out.println("数字を入力してください。");
            }
        }
        return userInput;
    }

    public BigDecimal addUnitPrice() {
        String userInputStr = "";
        BigDecimal userInput = null;
        boolean check = true;
        while (check) {
            System.out.print("取引単価(小数第二位まで可能)>");
            userInputStr = scanner.nextLine();
            try {
                BigDecimal bigDecimal = new BigDecimal(userInputStr);
                userInput = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_DOWN);
                check = false;
            }catch (NumberFormatException e) {
                System.out.println("数字を入力してください。");
            }
        }
        return userInput;
    }

    public LocalDateTime addInputDatetime() {
        LocalDateTime today = LocalDateTime.now().truncatedTo(ChronoUnit.MINUTES);
        System.out.println("入力日時；" + today);
        System.out.println("ーーー入力完了ーーー");
        return today;
    }
}
