import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fileReader = new FileReader("src/main/resources/input");
        Scanner scanner = new Scanner(fileReader);
        int n = 20;
        double[] elements = new double[n];

        for (int i = 0; i < n; i++)
            elements[i] = scanner.nextDouble();

        Calculations calculations = new Calculations(elements);
        calculations.sort();
        calculations.minMaxValues();
        calculations.selectionSize();
        calculations.disperancyCalculation();

        calculations.calculateEmpiricFunction();
        calculations.drawEmpiricFunction();

        calculations.drawFrequencyPolygon();

        calculations.drawHistogram(elements.length);
    }
}
