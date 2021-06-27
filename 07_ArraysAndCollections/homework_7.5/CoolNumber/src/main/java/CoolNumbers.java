import java.util.*;

public class CoolNumbers {

    ArrayList<String> coolNumbersSearchedArray = new ArrayList<>();

    public static String[] letters = {"А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"};//разрешенные буквы
    public static int lettersLength = letters.length;

    public static List<String> generateCoolNumbers() {
        String number = null;
        ArrayList<String> coolNumbers = new ArrayList<>();
        for (int i = 0; i < 2_000_000; i++) {
            number = getFirstLetter() + getThreeDigits() + getSecondLetters() + getRandRegion();

        }
        coolNumbers.add(number);
        return coolNumbers;
    }

    public static boolean bruteForceSearchInList(List<String> list, String number) {
        boolean validNumber = false;
        long start = System.nanoTime();
        if(list.contains(number)){
            validNumber = true;
            System.out.println("Поиск перебором: номер найден, поиск занял: " + (System.nanoTime() - start));
        }else{
            System.out.println("Поиск перебором: номер не найден, поиск занял: " + (System.nanoTime() - start));
        }
        return validNumber;
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
        boolean validNumber = false;
        long start = System.nanoTime();
        if(Collections.binarySearch(sortedList,number) >= 0){
            validNumber = true;
            System.out.println("Бинарный поиск: номер найден, поиск занял: " + (System.nanoTime() - start));
        }else{
            System.out.println("Бинарный поиск: номер не найден, поиск занял: " + (System.nanoTime() - start));
        }
        return validNumber;
    }

    public static boolean searchInHashSet(HashSet<String> hashSet, String number) {
        boolean validNumber = false;
        long start = System.nanoTime();
        for(String search : hashSet) {
            if (search.equals(number)){
                validNumber = true;
                System.out.println("Поиск в HashSet: номер найден, поиск занял: " + (System.nanoTime() - start));
            }else {
                System.out.println("Поиск в HashSet: номер не найден, поиск занял: " + (System.nanoTime() - start));
            }
        }
        return validNumber;
    }

    public static boolean searchInTreeSet(TreeSet<String> treeSet, String number) {
        boolean validNumber = false;
        long start = System.nanoTime();
        for(String search : treeSet) {
            if (search.equals(number)) {
                validNumber = true;
                System.out.println("Поиск в TreeSet: номер найден, поиск занял: " + (System.nanoTime() - start));
            } else {
                System.out.println("Поиск в TreeSet: номер не найден, поиск занял: " + (System.nanoTime() - start));
            }
        }
        return validNumber;
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
