public class Main {

  public static void main(String[] args) {

    String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
    //TODO: напишите ваш код, результат вывести в консоль

    System.out.println("Текст = " + text);

    System.out.println("Номер цифры 5: " + text.indexOf('5'));
    String vasyaSalaryIndex = text.substring(15,19);
    System.out.println("Васина зарплата: " + vasyaSalaryIndex);

    System.out.println("Номер цифры 7: " + text.indexOf('7'));
    String petyaSalary = text.substring(35,39);
    System.out.println("Петина зарплата: " + petyaSalary);

    System.out.println(text.lastIndexOf('3'));
    String mashaSalary = text.substring(56,61);
    System.out.println("Машина зарплата: " +mashaSalary);

    Integer vasyaZp = Integer.parseInt(vasyaSalaryIndex);
    Integer petyaZp = Integer.parseInt(petyaSalary);
    Integer mashaZp = Integer.parseInt(mashaSalary);

    int sum = vasyaZp + petyaZp + mashaZp;
    System.out.println("Сумма: " + sum);


  }

}