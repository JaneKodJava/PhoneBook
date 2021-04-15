public class Main {

    public static void main(String[] args) {

        String text = "Номер кредитной карты <4008 1234 5678> 8912";
        searchAndReplaceDiamonds(text," *** ");
    }

    public static boolean validData(String text){
        boolean validText = true;
        int diamond1 = 0;
        int diamond2 = 0;
        String validChar = "";
        if (text.indexOf("<") != -1 && text.indexOf(">") != -1){
            validChar = "Номеркедитнйаы <>0123456789";
        }
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '<'){
                diamond1++;
            }
            if (text.charAt(i) == '>'){
                diamond2++;
            }
            if (validChar.indexOf(text.charAt(i)) == -1){
                validText = false;
                break;
            }
        }
        return diamond1 == 1 && diamond2 == 1 && validText;
    }


    public static String searchAndReplaceDiamonds(String text, String placeholder) {
        // TODO: реализовать метод, если в строке нет <> - вернуть строку без изменений

        String newText;
        if (validData(text)) {
            text = text.trim();
            int colonIndex = text.indexOf(':');
            String string = text.substring(0, colonIndex + 1);

            int diamond2Index = text.indexOf('>');
            String number = text.substring(diamond2Index + 1);
            number = number.trim();
            newText = string + placeholder + number;
            System.out.println(newText);
        } else {
            return text;
        }
        return newText;


    }

}