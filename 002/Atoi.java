/**
 * Author : wangjinlei
 * Email  : sea11107@mail.ustc.edu.cn
 */
 
public class Atoi {
	
	public static long atoi(String s) {
		
		return helper(0, s);
	}
	
	private static long helper(int index, String s) {
		boolean negative = false;
		char firstChar = s.charAt(0);
		if (firstChar == '-') {
			negtive = true;
			++index;
		}
		return 
	}
	 
	public static void main(String[] args) {
		// to be filled here....		
	}
}
