public class Main {

    public static void main(String[] args) {
        String text = "Номер кредитной карты: <4042 1234 5678> 7890";
        searchAndReplaceDiamonds(text, "***");

    }

    public static String searchAndReplaceDiamonds(String text, String placeholder) {
        // TODO: реализовать метод, если в строке нет <> - вернуть строку без изменений
        String newText = text.replaceAll("<[^>]+>", placeholder);
        System.out.println(newText);

        return newText;
    }


}