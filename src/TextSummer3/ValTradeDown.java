package TextSummer3;

import java.math.BigDecimal;
import java.time.LocalDateTime;
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
}
