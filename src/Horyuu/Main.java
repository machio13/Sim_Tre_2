package Horyuu;

import TextSummer_4.TradeDisplay;

public class Main {
    public static void main(String[] args) {

        Dog pochi = new Dog("ポチ");
        Dog traro = new Dog("タロー");

        Baby baby = new Baby();
        Crow crow = new Crow();

        System.out.println(pochi.cry());
        System.out.println(traro.cry());

        Trainer trainer = new Trainer();
        trainer.execute(baby);
        trainer.execute(crow);
    }
}
