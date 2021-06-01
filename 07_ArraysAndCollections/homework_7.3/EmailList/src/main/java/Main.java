import java.util.Scanner;

public class Main {
    public static final String WRONG_EMAIL_ANSWER = "Неверный формат email";
    
    /* TODO:
        Пример вывода списка Email, после ввода команды LIST в консоль:
        test@test.com
        hello@mail.ru
        - каждый адрес с новой строки
        - список должен быть отсортирован по алфавиту
        - email в разных регистрах считается одинаковыми
           hello@skillbox.ru == HeLLO@SKILLbox.RU
        - вывод на печать должен быть в нижнем регистре
           hello@skillbox.ru
        Пример вывода сообщения об ошибке при неверном формате Email:
        "Неверный формат email"
    */



    public static void main(String[] args) {

        EmailList emailList = new EmailList();

        System.out.println("Введите команду:");
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            }
            String validInput = input.trim();
            int countSpace = 0;
            for (char space : validInput.toCharArray()){ // Подсчет пробелов
                if (space == ' ') countSpace++;
            }
            if (countSpace == 0){
                String command = validInput;
                switch (command){
                    case "LIST":
                        emailList.getSortedEmails();
                        break;
                    default:
                        System.out.println("Команда введена неверно");
                }
            }

            else if (countSpace > 0){ // Проверка на валидность э-маил

                if (validEMail(input)){
                    int spaceIndex = validInput.indexOf(' ');// индекс пробела
                    String command = validInput.substring(0, spaceIndex); // команда
                    String email = validInput.substring(spaceIndex +1); // э-мэил
                    switch (command){
                        case "ADD":
                            emailList.add(email);
                            break;
                        default:
                            System.out.println("Команда введена не6верно");
                    }
                }
                else if (!validEMail(input)){
                    System.out.println(WRONG_EMAIL_ANSWER);
                }
            }

        }
    }

    public static boolean validEMail(String mail){
        return mail.matches(".+@.+\\..+");
    }
}
