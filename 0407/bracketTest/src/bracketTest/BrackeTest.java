package bracketTest;

public class BrackeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OptExp opt = new OptExp();
		String exp = "(3*5)-(6/2)";
		
		System.out.println(exp);
		
		if (opt.testPair(exp))
			System.out.println("��ȣ ����!!");
		else
			System.out.println("��ȣ Ʋ��!!");
	}
}
