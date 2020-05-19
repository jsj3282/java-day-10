package day10;

class Variable_02{
	private int var = 100;
	public void variable() {
		System.out.println("var : " + var);
		var+=100;
	}
}
public class Test07 {

	public static void main(String[] args) {
		
		Variable_02 va = new Variable_02();
		//va.var = 2000;
		va.variable();

	}

}
