import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>(CoolNumbers.generateCoolNumbers());
        HashSet<String> hashSet = new HashSet<>(CoolNumbers.generateCoolNumbers());
        TreeSet<String> treeSet = new TreeSet<>(CoolNumbers.generateCoolNumbers());

        System.out.println(arrayList);
        System.out.println("Введите номер автомобиля:");
        Scanner scanner = new Scanner(System.in);
        while (true){
            String number = scanner.nextLine();

            CoolNumbers.bruteForceSearchInList(arrayList, number);
            CoolNumbers.binarySearchInList(arrayList, number);
            CoolNumbers.searchInHashSet(hashSet, number);
            CoolNumbers.searchInTreeSet(treeSet, number);
        }
    }
}
