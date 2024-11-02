package TextSummer3;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class ValTradeDown {
//
//    private long valTradeQuantity;
//    private BigDecimal valPrice;
//    private LocalDateTime valInputDatetime;
    Scanner scanner = new Scanner(System.in);

    public String addTradeSide() {
        boolean check = true;
        String userInput = "";
        while (check) {
            System.out.print("売買区分(Sell, Buy)>");
            userInput = scanner.nextLine();
            if (userInput.equals("Buy") || userInput.equals("Sell")) {
                check = false;
            }else {
                System.out.println("正しく入力してください。(Sell or Buy)");
            }
        }return userInput;
    }

    public long addTradeQuantity() {
        boolean check = true;
        String userInputStr = "";
        long userInput = 0;
        while (check) {
            System.out.print("数量(100株単位)>");
            userInputStr = scanner.nextLine();
            try {
                userInput = Long.parseLong(userInputStr);
                if (userInput % 100 == 0){
                    check = false;
                }else {
                    System.out.println("100株単位で入力してください。");
                }
            }catch (NumberFormatException e){
                System.out.println("数字を入力してください。");
            }
        }return userInput;
    }

    public BigDecimal addTradePrice() {
        boolean check = true;
        String userInputStr = "";
        BigDecimal userInput = null;
        while (check) {
            System.out.print("1株あたりの単価(少数第二位まで表示可能)>");
            userInputStr = scanner.nextLine();
            try {
                BigDecimal bigDecimal = new BigDecimal(userInputStr);
                userInput = bigDecimal.setScale(2, BigDecimal.ROUND_DOWN);
                check = false;

            }catch (NumberFormatException e) {
                System.out.println("数字を入力してください。");
            }
        }return userInput;
    }

    public LocalDateTime addTradeInputDatetime() {
        LocalDateTime valInputDatetime = LocalDateTime.now().truncatedTo(ChronoUnit.MINUTES);
        System.out.println("入力時刻：" + valInputDatetime);
        System.out.println("ーーー入力完了ーーー");
        return valInputDatetime;
    }
//
//    public String getValTradeSide() {
//        return valTradeSide;
//    }
//
//    public long getValTradeQuantity() {
//        return valTradeQuantity;
//    }
//
//    public BigDecimal getValPrice() {
//        return valPrice;
//    }
//
//    public LocalDateTime getValInputDatetime() {
//        return valInputDatetime;
//    }
}
