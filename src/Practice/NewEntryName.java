package Practice;

import java.util.Scanner;

public class NewEntryName {
    public static String entryName;

    public static void addName() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("銘柄名>");
            entryName = scanner.nextLine();
            if (entryName.matches("[a-zA-Z0-9 .()]*")) {
                break;
            }else {
                System.out.println("使用できない文字が含まれています。記入し直してください。");
            }
        }
    }

    public static String getEntryName() {
        return entryName;
    }
}
