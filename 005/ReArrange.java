public class ReArrange {
	
	// odd odd....even even
	public static void arrange(int[] data) {
		int low = 0;
		int high = data.length - 1;
		
		while (low < high) {
			if (even(data[low])) {
				++low;
			}
			if (!even(data[high])) {
				--high;
			}
			// not cross
			if (low < high)
				swap(data, low, high);
		}
	}
	
	public static void swap(int[] data, int i, int j) {
		int t = data[i];
		data[i] = data[j];
		data[j] = t;
	}
	
	
	// if i is even return true, false, otherwise.
	public static boolean even(int i) {
		return (i & 1) == 0;
	}
	
	public static void print(int[] data) {
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] data = {1,2,3,4,5,6,7,8,9,10};
		// 10 2 8 4 5 6 7 3 9 1
		arrange(data);
		print(data);
		
		int[] data2 = {1};
		arrange(data2);
		print(data2);
		
		int[] data3 = {1,3,2,4};
		arrange(data3);
		print(data3);
		
		
		int[] data4 = {2,4,1,3};
		arrange(data4);
		print(data4);
	}
}
