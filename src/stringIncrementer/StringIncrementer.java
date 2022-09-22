package stringIncrementer;

import java.util.regex.Pattern;

public class StringIncrementer {
    public static String incrementString(String str) {

        StringBuilder arr = new StringBuilder(" " + str);
        for (int i = arr.length() - 1; i >= 0; i--) {
            char ch = arr.charAt(i);
            if (Character.isDigit(ch)) {
                ch = ch == '9' ? '0' : ++ch;
                arr.replace(i, i + 1, String.valueOf(ch));
                if (ch != '0') {
                    break;
                }
                continue;
            }
            arr.insert(i + 1, "1");
            break;
        }
        return arr.substring(1);
}}
