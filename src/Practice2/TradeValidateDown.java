package Practice2;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class TradeValidateDown {
    private String trade_Side;
    private long trade_Quantity;
    private BigDecimal trade_TUPrice;
    private LocalDateTime trade_InputDatetime;
    Scanner scanner = new Scanner(System.in);

    public void valTradeSide() {
        boolean check = true;
        while (check) {
            System.out.print("銘柄区分(Sell, Buy)>");
            trade_Side = scanner.nextLine();
            if (trade_Side.equals("Sell") || trade_Side.equals("Buy")) {
                check = false;
            }else {
                System.out.println("銘柄区分が正しく入力されていません。");
            }
        }
    }

    public void valTradeQuantity() {
        boolean check = true;
        while (check) {
            System.out.print("数量(100株単位)>");
            String quantityStr = scanner.nextLine();
            try {
                trade_Quantity = Long.parseLong(quantityStr);
                if (trade_Quantity % 100 == 0) {
                    check = false;
                } else {
                    System.out.println("100株単位で入力してください。");
                }
            }catch (NumberFormatException e) {
                System.out.println("数字を入力してください。");
            }
        }
    }

    public void valTradeTUPrice() {
        boolean check = true;
        while (check) {
            System.out.print("取引単価(少数第二位まで可能)>");
            String tuPriceStr = scanner.next();
            try {
                BigDecimal bdParse = new BigDecimal(tuPriceStr);
                trade_TUPrice = bdParse.setScale(2, BigDecimal.ROUND_DOWN);
                check = false;

            } catch (NumberFormatException e) {
                System.out.println("数字を入力してください。");
            }
        }
    }

    public void valTradeInputDatetime() {
        trade_InputDatetime = LocalDateTime.now().truncatedTo(ChronoUnit.MINUTES);
        System.out.println("入力日時>" + trade_InputDatetime);
        System.out.println("ーーー入力完了ーーー");
    }

    public String getTrade_Side() {
        return trade_Side;
    }

    public long getTrade_Quantity() {
        return trade_Quantity;
    }

    public BigDecimal getTrade_TUPrice() {
        return trade_TUPrice;
    }

    public LocalDateTime getTrade_InputDatetime() {
        return trade_InputDatetime;
    }
}