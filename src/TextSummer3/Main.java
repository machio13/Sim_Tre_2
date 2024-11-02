package TextSummer3;

import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        File csvFile = new File("src/TextSummer3/Masterd.csv");
//        Menu menu = new Menu();
//
//        UserInput[] userInputs = {new InputTicker(), new InputName(), new InputMarket(), new InputSharesIssued()};
//
//        List<String> trueUserInputs = new ArrayList<>();
//
//        for (UserInput userInput : userInputs) {
//            String trueUserInput = userInput.userInputMethod(csvFile);
//            trueUserInputs.add(trueUserInput);
//        }
//
////        Stock stock = new Stock(userInputs[0].userInputMethod(csvFile), userInputs[1].userInputMethod(csvFile), userInputs[2], userInputs[3]);
//
//
//        Stock stock = new Stock(trueUserInputs.get(0), trueUserInputs.get(1), MarketBrand.fromCode(trueUserInputs.get(2)), new BigDecimal(trueUserInputs.get(3)));
//
//        System.out.println(stock);
        Menu menu = new Menu();
        menu.MenuSelect();
    }
}
