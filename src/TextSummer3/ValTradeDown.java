package TextSummer3;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class ValTradeDown {
    private String valTradeSide;
    private long valTradeQuantity;
    private BigDecimal valPrice;
    private LocalDateTime valInputDatetime;

    public void addTradeSide() {
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        while (check) {
            System.out.print("売買区分(Sell, Buy)>");
            valTradeSide = scanner.nextLine();
            if (valTradeSide.equals("Buy") || valTradeSide.equals("Sell")) {
                check = false;
            }else {
                System.out.println("正しく入力してください。(Sell or Buy)");
            }
        }
    }

    public void addTradeQuantity() {
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        while (check) {
            System.out.print("数量(100株単位)>");
            String quantityStr = scanner.nextLine();
            try {
                valTradeQuantity = Long.parseLong(quantityStr);
                if (valTradeQuantity % 100 == 0){
                    check = false;
                }else {
                    System.out.println("100株単位で入力してください。");
                }
            }catch (NumberFormatException e){
                System.out.println("数字を入力してください。");
            }
        }
    }

    public void addTradePrice() {
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        while (check) {
            System.out.print("1株あたりの単価>");
            String userInput = scanner.nextLine();
            try {
                BigDecimal bigDecimal = new BigDecimal(userInput);
                valPrice = bigDecimal.setScale(2, BigDecimal.ROUND_DOWN);
                check = false;

            }catch (NumberFormatException e) {
                System.out.println("数字を入力してください。");
            }
        }
    }

    public void addTradeInputDatetime() {
        valInputDatetime = LocalDateTime.now().truncatedTo(ChronoUnit.MINUTES);
        System.out.println("入力時刻：" + valInputDatetime);
        System.out.println("ーーー入力完了ーーー");
    }

    public String getValTradeSide() {
        return valTradeSide;
    }

    public long getValTradeQuantity() {
        return valTradeQuantity;
    }

    public BigDecimal getValPrice() {
        return valPrice;
    }

    public LocalDateTime getValInputDatetime() {
        return valInputDatetime;
    }
}
