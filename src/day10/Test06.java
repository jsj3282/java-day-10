package day10;

class Variable{
	public int var = 100;
	public void variable() {
		System.out.println("var : " + var);
	}
	public void func() {
		System.out.println("var : " + var);
	}
}
public class Test06 {

	public static void main(String[] args) {
		Variable va = new Variable();
		va.variable();
		va.func();

	}

}
