import net.sf.saxon.pattern.Pattern;

import java.util.Scanner;

public class Main {

    private static TodoList todoList = new TodoList();

    public static void main(String[] args) {
        // TODO: написать консольное приложение для работы со списком дел todoList
        System.out.println("Привет! Сегодня тебя ждут великие дела!" +
                "\nНу мы-то с тобой знаем, что это значит на самом деле;)" +
                "\nВведи команду заглавными буквами и дело строчными, например:" +
                "\nADD 1 запихнуть грязную посуду в посудомойку" +
                "\nВот команды, которые я выполняю: ADD, EDIT, DELETE, LIST" +
                "\nИ очень тебя прошу, пожалей мою память!" +
                "\nПрежде, чем что-то написать, хорошо подумай))) тебе же потом это делать придётся...");
        Scanner scanner = new Scanner(System.in);
        while (true){
            String input = scanner.nextLine();
            String text = input.trim();
            int countSpace = 0;
            for (char space : text.toCharArray()) {
                if (space == ' ') countSpace = countSpace + 1;
            }

            if (countSpace > 0){
                int spaceIndex = text.indexOf(' ');
                String command = text.substring(0, spaceIndex); // команда
                String thing = text.substring(spaceIndex +1); // текст дела
                if (command.equals("ADD")) {
                    if (!indexEntered(thing)){
                        String spaceThing = thing.trim();
                        int spaceIndexThing = spaceThing.indexOf(' ');
                        String numberThing = spaceThing.substring(0, spaceIndexThing); // номер дела
                        String todo = spaceThing.substring(spaceIndexThing +1); // текст дела с номером
                        int index = Integer.parseInt(numberThing);
                        todoList.add(index, todo);
                    }
                    else {
                        todoList.add(thing);
                    }

                }
                if (command.equals("EDIT")){
                    String spaceThing = thing.trim();
                    int spaceIndexThing = spaceThing.indexOf(' ');
                    String numberThing = spaceThing.substring(0, spaceIndexThing); // номер дела
                    String todo = spaceThing.substring(spaceIndexThing +1); // текст дела с номером
                    int index = Integer.parseInt(numberThing);
                    todoList.edit(todo, index);
                }
                if (command.equals("DELETE")){
                    int index = Integer.parseInt(thing);
                    todoList.delete(index);
                }


            }
            if (countSpace == 0){
                String command = text;
                if (command.equals("LIST")){
                    todoList.getTodos();
                }
            }

        }
    }
    public static boolean indexEntered(String text){
        return text.matches("[^0-9]+");
    }

}
