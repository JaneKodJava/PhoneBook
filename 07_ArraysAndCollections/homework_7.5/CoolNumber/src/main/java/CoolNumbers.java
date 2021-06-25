import java.util.*;

public class CoolNumbers {

    public static ArrayList<String> arrayCoolNumbers = new ArrayList<>();
    public static HashSet<String> hashSet = new HashSet<>();
    public  static TreeSet<String> treeSet = new TreeSet<>();
    public static ArrayList<String> coolNumbersSearchedArray = new ArrayList<>();

    public  static String[] letters = {"А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"};//разрешенные буквы
    public static int lettersLength = letters.length;

    public static List<String> generateCoolNumbers() {
        String number = null;
        for (int i = 0; i < 2_000_000; i++) {
            number = getFirstLetter() + getThreeDigits() + getSecondLetters() + getRandRegion();
            arrayCoolNumbers.add(number);
            hashSet.add(number);
            treeSet.add(number);
        }
        return Collections.emptyList();
    }

    public static List sortList(List<String> list){
        Collections.sort(list);
        return list;
    }

    public static boolean bruteForceSearchInList(List<String> list, String number) {
        for (String numbers : arrayCoolNumbers){
            if (numbers.equals(number)){
                System.out.println("Номер найден линейным поиском: " + numbers);
                return true;
            }
        }
        System.out.println("Номер не найден линейным поиском");
        return false;
    }

    public String linearSearchRegex(ArrayList<String> arrayCoolNumbers){// линейный поиск
        for (String number : arrayCoolNumbers) {
            if (isCoolNumber1(number) | isCoolNumber2(number) | isCoolNumber3(number) | isCoolNumber4(number) | isCoolNumber5(number)){
                coolNumbersSearchedArray.add(number);
            }

        }
        return "Not found";
    }

    public void printCoolNumbersSearchedArray(ArrayList<String> arrayCoolNumbers){
        linearSearchRegex(arrayCoolNumbers);
        System.out.println("Список классных номеров:");
        for (String num : coolNumbersSearchedArray){
            System.out.println(num);
        }
    }


    public static boolean binarySearchInList(List<String> sortedList, String number) {
        return arrayCoolNumbers.contains(number);
    }

    public static String binarySearch(List<String> sortedList, String number){
        if (binarySearchInList(sortedList, number)){
            System.out.println("Элемент найден бинарным поиском в эррейлисте:");
            System.out.println(arrayCoolNumbers.get(Collections.binarySearch(arrayCoolNumbers, number)));
        }
        else {
            System.out.println("Элемент не найден бинарным поиском в эррейлисте");
        }
        return "";
    }


    public static boolean searchInHashSet(HashSet<String> hashSet, String number) {
        return hashSet.contains(number);
    }

    public static void printHashSet(HashSet<String> hashSet, String number){
        if (searchInHashSet(hashSet, number)){
            System.out.println("Номер найден в хэшсет");
        }
        else {
            System.out.println("Номер не найден в хэшсет");
        }
    }

    public static boolean searchInTreeSet(TreeSet<String> treeSet, String number) {
        return treeSet.contains(number);
    }

    public static void printTreeSet(TreeSet<String> treeSet, String number){
        if (searchInTreeSet(treeSet, number)){
            System.out.println("Номер найден в трисет");
        }
        else {
            System.out.println("Номер не найден в трисет");
        }
    }

    public static String getRandRegion(){
        String randRegion;
        int region = (int) (Math.random() * 199 + 1);//генерация региона
        if (region < 10){
            String randReg = Integer.toString(region);
            randRegion = "0" + randReg;
            return randRegion;
        }
        else {
            randRegion = Integer.toString(region);//преобразование региона в строку
            return randRegion;
        }
    }

    public static String getFirstLetter(){
        String firstLetter = null;
        int randFirstLet = (int) (Math.random() * lettersLength);
        firstLetter = letters[randFirstLet];
        return firstLetter;
    }

    public static String getSecondLetters(){
        String secondLetters = null;
        int randLet1 = (int)(Math.random() * lettersLength);
        int randLet2 = (int) (Math.random() * lettersLength);
        secondLetters = letters[randLet1] + letters[randLet2];
        return secondLetters;
    }

    public static String getThreeDigits(){
        String treeDigits = null;
        int randDig1 = (int) (Math.random() * 10);
        String digit1 = Integer.toString(randDig1);
        int randDig2 = (int) (Math.random() * 10);
        String digit2 = Integer.toString(randDig2);
        int randDig3 = (int) (Math.random() * 10);
        String digit3 = Integer.toString(randDig3);
        treeDigits = digit1 + digit2 + digit3;
        return treeDigits;
    }

    public boolean isCoolNumber1(String number){
        return number.matches("\\W[1]{3}\\W{2}\\d+");
    }
    public boolean isCoolNumber2(String number){
        return number.matches("\\W[3]{3}\\W{2}\\d+");
    }
    public boolean isCoolNumber3(String number){
        return number.matches("\\W[5]{3}\\W{2}\\d+");
    }
    public boolean isCoolNumber4(String number){
        return number.matches("\\W[7]{3}\\W{2}\\d+");
    }
    public boolean isCoolNumber5(String number){
        return number.matches("\\W[9]{3}\\W{2}\\d+");
    }
}
