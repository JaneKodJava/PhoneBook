public class Main {

  public static void main(String[] args) {
    Container container = new Container();
    container.count = 7843;

    int sum = sumDigits(null);
    System.out.println(sum);

  }

  /* Реализуйте метод sumDigits который возвращает сумму цифр числа, пример:
  передано 12345, метод должен вернуть 15
  если передано null, то должен вернуть -1

  Запустите тесты TestSumDigits для проверки корректности работы метода

  не меняйте название метода, его возвращаемое значение и модификаторы доступа (public).
  В противном случае тестовый метод не сможет проверить ваш код
   */

  public static int sumDigits(Integer number) {
    //@TODO: write code here and delete TODO line
    int sum = 0;
    //if (number == null) {
    //  number = 0;
    //  Integer i = 1;
    //  sum = -1;
    //  System.out.println(number.compareTo(i));
    //}

    //else if (number == 0) {
    //  Integer i = 1;
    //  System.out.println(number.compareTo(i));
    //}
    //else  {
    //  while
    //  (number > 0) {
    //    sum += number % 10;
    //    number /= 10;
     // }

    //}

    //  return sum;
    if(number == null){
      sum = -1;
    }
    else if (number == 0 ){
      sum = 0;
    }

    else {
      String j = Integer.toString(number);
      char[] chars = j.toCharArray();
      for (int i = 0; i < chars.length; i++) {
        sum = sum + Character.getNumericValue(chars[i]);
      }
    }
    return sum;
  }

}
