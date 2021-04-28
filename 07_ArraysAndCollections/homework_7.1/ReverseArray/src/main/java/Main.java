public class Main {

    public static void main(String[] args) {

        String line = "Каждый охотник желает знать, где сидит фазан";
        String[] color = line.split(",?\\s+");

        //String[] colorInverted = new String[color.length];
        ReverseArray.reverse(color);

        //for (int i = color.length - 1, j = 0; i >= 0; i--, j++) {
        //    temp = colorInverted[j];
        //    colorInverted[j]  = color[i];
        //    color[i] = temp;
        //}
        for (int i = 0; i < color.length; i++) {
            System.out.println(color[i]);
        }


    }
}
