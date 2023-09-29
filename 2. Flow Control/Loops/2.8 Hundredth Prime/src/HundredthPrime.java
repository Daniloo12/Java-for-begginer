public class HundredthPrime {
    public static void main(String[] args) {
		int count = 1;
		int num = 0;
		while (count < 100) {
			num += 1;
			for (int div = num - 1; div > 1; div--) {
				if (num % div == 0) {
					break;
				} else if (div == 2) {
					count++;
				}
			}
		}
		System.out.println(num);
    }
}