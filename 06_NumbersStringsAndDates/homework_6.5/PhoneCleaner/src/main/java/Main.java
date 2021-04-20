import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    while (true) {
      String input = scanner.nextLine();
      if (input.equals("0")) {
        break;
      }
      String numberPhone = input.replaceAll("[^0-9]", "");
      Pattern pattern = Pattern.compile("([7-8]*)(\\d{3})(\\d{7})");
      Matcher matcher = pattern.matcher(numberPhone);
      boolean validNumber = matcher.matches();
      if (validNumber){
        System.out.println(matcher.replaceAll("7$2$3"));
      }
      else {
        System.out.println("Неверный формат номера");
      }

    }
  }
}
