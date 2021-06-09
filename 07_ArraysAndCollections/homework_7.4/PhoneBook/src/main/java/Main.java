import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();
        String command;
        String phoneNumber;
        String name;

        Scanner scanner = new Scanner(System.in);
        while (true) {

            System.out.println("Введите имя, номер телефона или команду");
            String input = scanner.nextLine();
            if (input.equals("0")) {
                System.out.println("Неверный формат ввода");
                break;
            }
            if (input.contains("LIST")){
                command = "LIST";
            }
            else {
                if (phoneBook.isValidInputName(input)){
                    command = "NAME";
                }
                else if (phoneBook.isValidInputPhone(input)){
                    command = "PHONE";
                }
                else {
                    command = "ERROR";
                }
            }
            switch (command){
                case "LIST" :
                    for (String item : phoneBook.getAllContacts()){
                        System.out.println(item);
                    }
                    break;
                case "PHONE" :
                    if (phoneBook.isContactExist(input)){
                        System.out.println(phoneBook.getNameByPhone(input));
                    }
                    else {
                        System.out.println("Такаго номера нет в телефонной книге");
                        System.out.println("Введите номер абонента " + "\"" + input + "\"");
                        Scanner scanner1 = new Scanner(System.in);
                        name = scanner1.nextLine();
                        phoneBook.addContact(input, name);
                        System.out.println("Контакт добавлен!");
                    }
                    break;
                case "NAME" :
                    if (phoneBook.isNameExist(input)){
                        for (String item : phoneBook.getPhonesByName(input)){
                            System.out.println(item);
                        }
                    }
                    else {
                        System.out.println("Такого имени в телефонной книге нет");
                        System.out.println("Введите номер телефона для абонента \"" + input + "\"");
                        Scanner phoneScanner = new Scanner(System.in);
                        phoneNumber = phoneScanner.nextLine();
                        phoneBook.addContact(phoneNumber, input);
                        System.out.println("Контакт добавлен!");
                    }
                    break;
                case "ERROR" :
                    System.out.println("Неверный формат ввода!");
                    break;
            }
        }
    }

}
