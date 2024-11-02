package Projava;

import java.util.List;

public class NewInterFaceSample {
    interface Named {
        String thing();
    }

    record Student(String thing, int score) implements Named {}
    record Teacher(String thing, String subject) implements Named {}

    public static void main(String[] args) {
        var people = List.of(new Student("kis", 80), new Teacher("hosoya", "Math"), new Passenger());

        for (Named p : people) {
            var n = p.thing();
            System.out.println("こんにちは%sさん".formatted(n));
        }
    }
}
