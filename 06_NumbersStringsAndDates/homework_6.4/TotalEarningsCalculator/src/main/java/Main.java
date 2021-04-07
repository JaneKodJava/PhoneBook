public class Main {

  public static void main(String[] args) {

    String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
    String space = text.trim();
    //TODO: напишите ваш код, результат вывести в консоль

    System.out.println("Текст = " + text);

    int vasyaSalaryIndex1 = space.indexOf('5');
    int vasyaSalaryIndex2 = space.indexOf('0');
    int vasyaSalary = Integer.parseInt(space.substring(vasyaSalaryIndex1, vasyaSalaryIndex2 +3));

    int petyaSalaryIndex1 = space.indexOf('7');
    int petyaSalaryIndex2 = space.indexOf('3');
    int petyaSalary = Integer.parseInt(space.substring(petyaSalaryIndex1, petyaSalaryIndex2 +1));

    int mashaSalaryIndex1 = space.lastIndexOf('3');
    int mashaSalaryIndex2 = space.lastIndexOf('0');
    int mashaSalary = Integer.parseInt(space.substring(mashaSalaryIndex1, mashaSalaryIndex2 +1));

    int sum = vasyaSalary + petyaSalary + mashaSalary;

    System.out.println(sum);




  }

}