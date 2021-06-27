import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        PhoneBook phoneBook = new PhoneBook();
        String flag = null;
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Введите имя, телефон или команду:");
            String input = scanner.nextLine();
            if (input.equals('0')){
                break;
            }
            if (input.equals("LIST")){
                flag = "LIST";
            }
            else {
                if (phoneBook.isValidNameFormat(input) & !phoneBook.isValidList(input)){
                    flag = "NAME";
                }
                else if (phoneBook.isValidPhoneFormat(input) & !phoneBook.isValidList(input)){
                    flag = "PHONE";
                }
                else {
                    flag = "ERROR";
                }
            }

            switch (flag){
                case "NAME" :
                    System.out.println("Вы ввели имя " + input);
                    if (phoneBook.isNameExist(input)){
                        System.out.println("Этот контакт уже существует.");
                        System.out.println("Вы хотите добавить номер? \nВведите в консоль ОК или CANCEL");
                        Scanner scannerOkCancel = new Scanner(System.in);
                        String flag2 = scannerOkCancel.nextLine();
                        switch (flag2){
                            case "OK" :
                                System.out.println("Введите номер телефона:");
                                Scanner scanPhone = new Scanner(System.in);
                                String phoneInput = scanPhone.nextLine();
                                if (phoneBook.isValidPhoneFormat(phoneInput)){
                                    phoneBook.addContact(input, phoneInput);
                                    System.out.println("Вы добавили новый контакт: " + input + " - " + phoneInput);
                                }
                                else {
                                    System.out.println("Номер телефона введен неверно!");
                                }

                                break;
                            case "CANCEL" :
                                System.out.println("Команда отменена");
                                break;
                            default:
                                System.out.println("Неверный формат ввода");
                                break;
                        }
                    }
                    else {
                        System.out.println("Ведите номер телефона:");
                        Scanner scannerPhone = new Scanner(System.in);
                        String phoneNumber = scannerPhone.nextLine();
                        if (phoneBook.isValidPhoneFormat(phoneNumber)){
                            phoneBook.addContact(input, phoneNumber);
                            System.out.println("Вы добавили новый контакт: " + input + " - " + phoneNumber);
                        }
                        else {
                            System.out.println("Неверный формат ввода номера");
                        }
                    }

                    break;
                case "PHONE" :
                    System.out.println("Вы ввели номер телефона: " + input);
                    if (phoneBook.isPhoneExist(input)){
                        System.out.println("Этот номер уже существует");
                        System.out.println("Вы хотите его сохранить для другого абонента?");
                        System.out.println("Введите ОК или CANCEL");
                        Scanner scanOkCancel2 = new Scanner(System.in);
                        String flag3 = scanOkCancel2.nextLine();
                        switch (flag3){
                            case "OK" :
                                System.out.println("Введите имя абонента: ");
                                Scanner scanName = new Scanner(System.in);
                                String nameInput = scanName.nextLine();
                                phoneBook.addContact(nameInput, input);
                                System.out.println("Вы создали контакт: " + nameInput + " - " + input);
                                break;
                            case "CANCEL" :
                                System.out.println("Команда отменена");
                                break;
                            default:
                                System.out.println("Неверный формат ввода");
                                break;
                        }
                    }
                    else {
                        System.out.println("Введите имя:");
                        Scanner scannerName = new Scanner(System.in);
                        String nameContact = scannerName.nextLine();
                        phoneBook.addContact(nameContact, input);
                        System.out.println("Вы добавили новый контакт: " + nameContact + " - " + input);
                    }

                    break;
                case "LIST" :
                    System.out.println("Список контактов:");
                    phoneBook.getAllContacts();
                    break;
                case "ERROR" :
                    System.out.println("Неверный формат ввода");
                    break;

            }
        }

    }
}
