/**
 * Author : wangjinlei
 * Email  : sea11107@mail.ustc.edu.cn
 */

public class Compress {
	
	public static String compress(String s) {
		StringBuilder sbuf = new StringBuilder();
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (i != 0) {
				if (s.charAt(i) == s.charAt(i - 1)) {
					++count;
				} else {
					sbuf.append(++count);
					sbuf.append(s.charAt(i));
					count = 0;
				}
			} else if (i == 0) {
				sbuf.append(s.charAt(i));
			}
		}
		sbuf.append(++count);
		return sbuf.toString();
	}

	public static void main(String[] args) {
		String s = "aaabbbccceeedddffffffhhhhhhkjdfsd";
		System.out.println(s);
		System.out.println(compress(s));
		
		s = "a";
		System.out.println(s);
		System.out.println(compress(s));
		
		s = "ab";
		System.out.println(s);
		System.out.println(compress(s));
		
		s = "aaaaaa";
		System.out.println(s);
		System.out.println(compress(s));
	}
}
