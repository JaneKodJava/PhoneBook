import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    while (true) {
      String input = scanner.nextLine();

      if (input.equals("0")) {
        break;
      }
      inputValid(input);
      if (inputValid(input)){
        System.out.println("Введенная строка не является ФИО");
        break;
      }

      //TODO:напишите ваш код тут, результат вывести в консоль.
      //При невалидном ФИО вывести в консоль: Введенная строка не является ФИО

      String validInput = input.replaceAll("[0-9]", "");
      if (validInput.equals("0")){
        System.out.println("Введенная строка не является ФИО");
        break;
      }

      String[] arr = validInput.split(" ");

      for (int i = 0; i < arr.length; i++) {
        arr[i] = capitalize(arr[i]);
      }
      if (arr.length > 3 || arr.length < 3){
        System.out.println("Введенная строка не является ФИО");
      }
      else {
      System.out.println(getFio(arr));
      }
    }
  }

  private static String getFio(String[] arr) {
    StringBuilder sb = new StringBuilder();
    sb.append("Фамилия: ").append(arr[0]);
    sb.append("\nИмя: ").append(arr[1]);
    sb.append("\nОтчество: ").append(arr[2]);
    return sb.toString();
  }

  private static String capitalize(String word) {
    return Character.toUpperCase(word.charAt(0)) + word.substring(1);
  }

  public static boolean inputValid(String input){
    return input.matches("[А-Яа-я]");
  }

}