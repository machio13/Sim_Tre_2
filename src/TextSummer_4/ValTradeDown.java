package TextSummer_4;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class ValTradeDown {
    Scanner scanner = new Scanner(System.in);

    public String addSide() {
        String userInput = "";
        boolean check = true;
        while (check) {
            System.out.print("売買区分(Buy or Sell)>");
            userInput = scanner.nextLine();
            if (userInput.equals("Buy") || userInput.equals("Sell")) {
                check = false;
            }else {
                System.out.println("売買区分を選択し直してください。(Buy or Sell)");
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
                    System.out.println("100単位で入力し直して。");
                }
            }catch (NumberFormatException e){
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
            System.out.print("1株あたりの価格(小数点第二位まで記入可能)>");
            userInputStr = scanner.nextLine();
            try {
                BigDecimal bigDecimal= new BigDecimal(userInputStr);
                userInput = bigDecimal.setScale(2, BigDecimal.ROUND_DOWN);
                check = false;
            }catch (NumberFormatException e) {
                System.out.println("数字を入力してください。");
            }
        }
        return userInput;
    }

    public LocalDateTime addInputDatetime() {
        LocalDateTime nowTime = LocalDateTime.now().truncatedTo(ChronoUnit.MINUTES);
        System.out.println("入力時間：" + nowTime);
        System.out.println("ーーー入力完了ーーー");
        return nowTime;
    }
}
