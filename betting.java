import java.util.Scanner;

public class betting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		float out1 = 0;
		float out2 = 0;

		// Find betting option switch-payout-ratio
		out1 = 100 / (float) input;
		out2 = 100 / (float) (100 - input);

		System.out.println(out1);
		System.out.println(out2);

		sc.close();
	}

}