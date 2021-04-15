import java.util.Scanner;

public class Main {

    public static final int MAX_CONTAINER = 12;
    public static final int MAX_BOXES = 27;
    public static int countTruck;
    public static int countContainer;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String boxes = scanner.nextLine();

        if (Integer.parseInt(boxes) % MAX_BOXES != 0){
            countContainer = Integer.parseInt(boxes) / MAX_BOXES + 1;
        }
        else {
            countContainer = Integer.parseInt(boxes) / MAX_BOXES;
        }
        if (countContainer % MAX_CONTAINER != 0){
            countTruck = countContainer / MAX_CONTAINER + 1;
        }
        else {
            countTruck = countContainer / MAX_CONTAINER;
        }

        for (int i = 0; i < Integer.parseInt(boxes); i++) {
            if (i % (MAX_BOXES * MAX_CONTAINER) == 0){
                System.out.println("Грузовик: " + (i / (MAX_CONTAINER * MAX_BOXES) + 1));
            }
            if (i % MAX_BOXES == 0){
                System.out.println("\tКонтейнер: " + ((i/MAX_BOXES) + 1));
            }
            System.out.println("\t\tЯщик: " + (i + 1));
        }
        System.out.println("Необходимо:" + "\r\nгрузовиков - " + countTruck + " шт.\nконтейнеров - " + countContainer + " шт.");

        // TODO: вывести в консоль коробки разложенные по грузовикам и контейнерам
        // пример вывода при вводе 2
        // для отступа используйте табуляцию - \t

        /*
        Грузовик: 1
            Контейнер: 1
                Ящик: 1
                Ящик: 2
        Необходимо:
        грузовиков - 1 шт.
        контейнеров - 1 шт.
        */
    }

}
