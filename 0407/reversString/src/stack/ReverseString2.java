package stack;

import java.util.Scanner;

public class ReverseString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		
		StringBuffer sb = new StringBuffer();
		sb.append(str);
		
		System.out.print(sb.reverse());
		
		scanner.close();
	}

}
