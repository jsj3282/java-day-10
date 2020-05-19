package day10;

class Variable_03{
	public static int var = 100;
	public void variable() {
		System.out.println("var : " + var);
	}
}
public class Test08 {

	public static void main(String[] args) {
		
		Variable_03.var = 5000;
		Variable_03 va = new Variable_03();
		va.variable();

	}

}
