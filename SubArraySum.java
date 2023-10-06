public class SubArrayDivisibleByK {
	/* Returns true if the there is a
subarray of arr[] with a sum equal to
	'sum' otherwise returns false.
Also, prints the result */
	static int subArraySum(int arr[], int n, int sum)
	{
		// Pick a starting point
		for (int i = 0; i < n; i++) {
			int currentSum = arr[i];

			if (currentSum == sum) {
				System.out.println("Sum found at indexe "
								+ i);
				return 0;
			}
			else {
				// Try all subarrays starting with 'i'
				for (int j = i + 1; j < n; j++) {
					currentSum += arr[j];

					if (currentSum == sum) {
						System.out.println(
							"Sum found between indexes " + i
							+ " and " + j);
						return 1;
					}
				}
			}
		}
//		System.out.println("No subarray found");
//		return;
		return sum;
	}

	public static void main(String[] args)
	{
		SubArrayDivisibleByK arraysum = new SubArrayDivisibleByK();
		int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 };
		int n = arr.length;
		int sum = 23;
		arraysum.subArraySum(arr, n, sum);
	}
}

// This code has been contributed by Mayank
// Jaiswal(mayank_24)
