package Projava;

import java.util.List;

public class InterFaceSample {
    record Student(String name, int score) {}
    record Teacher(String name, String subject) {}

    public static void main(String[] args) {
        var people = List.of(new Student("kis", 80), new Teacher("hosoya", "Math"));
        for (var p : people) {
            var n = p instanceof Student s ? s.name() :
                    p instanceof Teacher t ? t.name() :
                            "---";
            System.out.println("こんにちは%sさん".formatted(n));
        }
    }
}
