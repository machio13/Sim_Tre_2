package TextSummer_4;

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

    public long addUnitPrice() {
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
    }
}
