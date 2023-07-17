// Java program for the above approach
class Main{

// Function to find if is it possible
// to make the array strictly increasing
// by removing at most one element
public static boolean check(int arr[], int n)
{
	
	// Stores the count of numbers that
	// are needed to be removed
	int count = 0;

	// Store the index of the element
	// that needs to be removed
	int index = -1;

	// Traverse the range [1, N - 1]
	for(int i = 1; i < n; i++)
	{
		
		// If arr[i-1] is greater than
		// or equal to arr[i]
		if (arr[i - 1] >= arr[i])
		{
			
			// Increment the count by 1
			count++;

			// Update index
			index = i;
		}
	}

	// If count is greater than one
	if (count > 1)
		return false;

	// If no element is removed
	if (count == 0)
		return true;

	// If only the last or the
	// first element is removed
	if (index == n - 1 || index == 1)
		return true;

	// If a[index] is removed
	if (arr[index - 1] < arr[index + 1])
		return true;

	// If a[index - 1] is removed
	if (index - 2 >= 0 && arr[index - 2] < arr[index])
		return true;
	
	// if there is no element to compare
	if(index < 0)
		return true;

	return false;
}

// Driver Code
public static void main(String args[])
{
	int []arr = { 1, 2, 5, 3, 5 };
	int N = arr.length;
	
	if (check(arr, N))
		System.out.println("Yes");
	else
		System.out.println("No");
}
}

// This code is contributed by SoumikMondal
