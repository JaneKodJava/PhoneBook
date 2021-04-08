import java.util.Scanner;

public class Main {



  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    while (true) {
      String input = scanner.nextLine();

      if (input.equals("0")) {
        break;
      }
      //TODO:напишите ваш код тут, результат вывести в консоль.
      //При невалидном ФИО вывести в консоль: Введенная строка не является ФИО

      if (validData(input)){
        input = input.trim();
        int spaseIndex1 = input.indexOf(' ');
        String surname = input.substring(0, spaseIndex1);
        System.out.println("Фамилия: " + surname);

        int spaceIndex2 = input.lastIndexOf(' ');
        String name = input.substring(spaseIndex1, spaceIndex2).trim();
        System.out.println("Имя: " + name);

        String patronymic = input.substring(spaceIndex2 +1).trim();
        System.out.println("Отчество: " +patronymic);
      }

      else {
        System.out.println("Введенная строка не является ФИО");
      }

    }

  }

  public static boolean validData(String input){

    boolean validStrihg = true;
    int countSpace = 0;
    String validChar = "";
    if (input.indexOf("-") != -1) {
      validChar = "абвгдеёжзийклмнопрстуфхчцшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЧЦШЩЭЮЯ- ";
    }
    else {
      validChar = "абвгдеёжзийклмнопрстуфхчцшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЧЦШЩЭЮЯ ";
    }

    for (int j = 0; j < input.length(); j++){
      if (input.charAt(j) == ' ') {
        countSpace++;
      }
      if (validChar.indexOf(input.charAt(j)) == -1) {
        validStrihg = false;
        break;
      }
    }

    return countSpace == 2 && validStrihg;
  }


}