public class BinarySearch {

	// non-recurrsive
	public static int binarySearch(int[] data, int key) {
		int low = 0;
		int hi = data.length - 1;
		
		while (low <= hi) {
			int mid = (low + hi) >>> 1; // Notice here, not >>
			if (data[mid] > key) {
				hi = mid - 1; // goes left
			} else if (data[mid] < key) {
				low = mid + 1; // goes right
			} else {
				return mid; // key found
			}
		}
		
		return -1; // key not found
	}
	
	
	public static void main(String[] args) {
		
		int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println(binarySearch(data, 2));
		System.out.println(binarySearch(data, 12));
	}
}
