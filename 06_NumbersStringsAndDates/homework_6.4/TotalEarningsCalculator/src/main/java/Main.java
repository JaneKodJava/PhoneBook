import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
  public static Integer sum = 0;

  public static void main(String[] args) {

    String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
    String space = text.trim();
    //TODO: напишите ваш код, результат вывести в консоль
// проверка на соответствие допустимым символам [а-яА-Я0-9 ,-]


    if (textValid(text)){

      Pattern pattern = Pattern.compile("\\s\\d.+?\\d\\s");
      Matcher matcher = pattern.matcher(text);
      while (matcher.find())//noinspection UnnecessaryParentheses
      {
        sum += Integer.parseInt(text.substring(matcher.start(), matcher.end()).trim());

      }
      System.out.println(sum);
    }
    // если строка не соответствует разрешенным символам, возвращаем строку без изменений.
    else {
      System.out.println(text);
    }

  }



  public static boolean textValid(String text){
    return text.matches("[0-9А-Яа-я\\s,-]{10,}");
  }

}