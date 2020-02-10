package fizzBuzz;

public class FizzBuzz {
	// constants for the key word outputs
	private static final String FIZZ = "fizz";
	private static final String BUZZ = "buzz";

	public static void main(String[] args) {
		// print numbers 1-100
		// multiples of 3 = fizz
		// multiles of 5 = buzz
		// multiples of 3 and 5 = Fizz Buzz

		int limit = 100;
		// loop to 100
		for (int loop = 1; loop <= limit; loop++) {

			// divisible by 3 and 5
			if (loop % 15 == 0) {
				System.out.println(FIZZ + BUZZ);
			} // divisible by 5
			else if (loop % 5 == 0) {
				System.out.println(BUZZ);
			} else if (loop % 3 == 0) {

				System.out.println(FIZZ);
			} else
				System.out.println(loop);

		}

	}
}
