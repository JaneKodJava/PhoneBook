import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    while (true) {
      String input = scanner.nextLine();
      if (input.equals("0")) {
        break;
      }
      String phone = input.replaceAll("[^0-9]", "");

      if (phone.length() > 11 || phone.length() < 10){
        System.out.println("Неверный формат номера");
      }

      char[] phoneToArray = phone.toCharArray();

      if (phone.length() == 11){
        if (phoneToArray[0] < '7') System.out.println("Неверный формат номера");
        if (phoneToArray[0] == '9') System.out.println("Неверный формат номера");

        if (phoneToArray[0] == '7'){
          for (int i = 0; i < phoneToArray.length; i++) {
            System.out.print(phoneToArray[i]);
          }
        }
        if (phoneToArray[0] == '8'){
          phoneToArray[0] = '7';
          for (int i = 0; i < phoneToArray.length; i++)
          {
            System.out.print(phoneToArray[i]);
          }
        }
      }

      if (phone.length() == 10){
        System.out.print("7");
        for (int i = 0; i < phoneToArray.length; i++) {
          System.out.print(phoneToArray[i]);
        }
      }

    }
  }
}
