public class ReverseArray {

    //TODO: Напишите код, который меняет порядок расположения элементов внутри массива на обратный.
    public static String[] reverse (String[] strings){
        int size = strings.length;
        for (int i = 0; i < size/2; i++) {
            String temp = strings[i];
            strings[i] = strings[size -1 -i];
            strings[size -1 -i] = temp;
        }
        return strings;
    }
}
