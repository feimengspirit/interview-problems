/**
 * Author : wangjinlei
 * Email  : sea11107@mail.ustc.edu.cn
 */

public class Assending {

	public static boolean isAssending(int[] data) {	
		return helper(0, data) ;
	}
	
	public static boolean helper(int index, int[] data) {
		if (index < 0 || index >= data.length) {
			throw new ArrayIndexOutOfBoundsException("unexpeced exception : " + index);
		}
		
		if (index == data.length - 1) {
			return true;
		}

		if (data[index] > data[index + 1]) {
			return false;
		}

		return helper(++index, data);
	}
	
	public static void main(String[] args) {

		int[] data = {1, 2, 3, 4, 5, 6};
		System.out.println(isAssending(data));
		
		int[] data2 = {1, 2};
		System.out.println(isAssending(data2));
		
		int[] data3 = {1};
		System.out.println(isAssending(data3));
		
		int[] data4 = {2, 1, 3};
		System.out.println(isAssending(data4));


		int[] data5 = {1,2,3,4,1,5,6,7,8,9,2};
		System.out.println(isAssending(data5));
		
	}
}
