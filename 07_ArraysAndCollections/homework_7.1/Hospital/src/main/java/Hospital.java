import java.text.DecimalFormat;

public class Hospital {

    public static float[] generatePatientsTemperatures(int patientsCount) {

        float[] temperature = new float[patientsCount];
        for (int i = 0; i < patientsCount; i++) {
            temperature[i] = (float) (Math.random() * (40 - 32) + 32);
        }

        return temperature;
    }

    public static String getReport(float[] temperatureData) {

        float meanTemperature;
        float totalTemperature = 0;
        int countHealthyPatients = 0;

        String temperatures[] = new String[temperatureData.length];
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < temperatureData.length; i++) {
            totalTemperature += temperatureData[i];
            if (temperatureData[i] >= 36.2 && temperatureData[i] <= 36.9){
                countHealthyPatients++;
            }
            DecimalFormat decimalFormat = new DecimalFormat("##.#");
            temperatures[i] = decimalFormat.format(temperatureData[i]);
            stringBuilder.append(temperatures[i]).append(';').append(' ');
        }

        meanTemperature = totalTemperature / temperatureData.length;
        DecimalFormat decimalFormat1 = new DecimalFormat("##.##");
        String meanTemperatureFormat = decimalFormat1.format(meanTemperature);

        String report =
                "Температуры пациентов: " + stringBuilder + System.lineSeparator() +
                        "Средняя температура: " + meanTemperatureFormat + System.lineSeparator() +
                        "Количество здоровых: " + countHealthyPatients;

        return report;
    }
}
