package optExp;

public class PostfixTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OptExp2 opt = new OptExp2();
		int result;
		String exp = "35*62/-";  // (3*5)-(6/2)
		System.out.printf("\n후위표기식", exp);
		result = opt.evalPostfix(exp);
		System.out.printf("\n연산결과 = %d\n", result);
	}

}
