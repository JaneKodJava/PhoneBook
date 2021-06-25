import java.util.List;
import java.util.Scanner;

public class Main {
    /*
    TODO:
     - реализовать методы класса CoolNumbers
     - посчитать время поиска введимого номера в консоль в каждой из структуры данных
     - проанализоровать полученные данные
     */

    public static void main(String[] args) {

        CoolNumbers coolNumbers = new CoolNumbers();

        CoolNumbers.generateCoolNumbers();
        //for (String numbers : CoolNumbers.arrayCoolNumbers){
        //    System.out.println(numbers);
        //}

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите искомый номер:");
        String input = scanner.nextLine();


        CoolNumbers.sortList(CoolNumbers.arrayCoolNumbers);

        long time1 = System.nanoTime();
        CoolNumbers.bruteForceSearchInList(CoolNumbers.arrayCoolNumbers, input);
        long time2 = System.nanoTime();
        System.out.println("Линейный поиск: " + (time2 - time1) + " нс\n");

        long time3 = System.nanoTime();
        CoolNumbers.binarySearch(CoolNumbers.arrayCoolNumbers, input);
        long time4 = System.nanoTime();
        System.out.println("Бинарный поиск: " + (time4 - time3) + " нс\n");

        long time5 = System.nanoTime();
        CoolNumbers.printHashSet(CoolNumbers.hashSet, input);
        long time6 = System.nanoTime();
        System.out.println("Поиск в хэшсет: " + (time6 - time5) + " нс\n");

        long time7 = System.nanoTime();
        CoolNumbers.printTreeSet(CoolNumbers.treeSet, input);
        long time8 = System.nanoTime();
        System.out.println("Поиск в трисет: " + (time8 - time7) + " нс\n");

        coolNumbers.printCoolNumbersSearchedArray(CoolNumbers.arrayCoolNumbers);
    }
}
