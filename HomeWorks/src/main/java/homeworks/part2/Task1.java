package homeworks.part2;

import java.util.Locale;

public class Task1 {

    public static void main(String[] args) {
        String str1 = "PHP Exercises and ";
        String str2 = "Python Exercises";

        String str3 = str1.concat(str2).replace("P", "");
        System.out.println(str3);
    }
}
