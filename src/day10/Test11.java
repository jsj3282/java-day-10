package day10;

class Variable_04{
	public static int cnt = 10;
	public static void func() {
		System.out.println("cnt : " + ++cnt);
	}
}
public class Test11 {

	public static void main(String[] args) {
		
		Variable_04.func();

	}

}
