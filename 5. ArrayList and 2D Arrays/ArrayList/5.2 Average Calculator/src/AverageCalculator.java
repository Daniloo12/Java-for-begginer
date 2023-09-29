import java.util.ArrayList;

public class AverageCalculator {
    public static double getAverageOf(ArrayList<Integer> numbers) {
		double summary = 0;
		double mean = 0;
		for (Integer number : numbers) {
			summary += number;
		}
		mean = summary / numbers.size();
		return mean;
    }
}