import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String text = "Номер кредитной карты: <4042 1234 5678> 7890";
        searchAndReplaceDiamonds(text, "***");
    }

    public static String searchAndReplaceDiamonds(String text, String placeholder) {
        // TODO: реализовать метод, если в строке нет <> - вернуть строку без изменений
        Pattern pattern = Pattern.compile("<.+>");
        Matcher matcher = pattern.matcher(text);
        String masking = matcher.replaceAll(placeholder);
        System.out.println(masking);

        return text;
    }


}