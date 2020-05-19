package day10;


class Variable_01{
	public int cnt = 10;
	public void func01() {
		cnt++;
		System.out.println("cnt : " + cnt);
	}
	public void func02() {
		cnt++;
		System.out.println("cnt : " + cnt);
	}
}
public class Test04 {

	public static void main(String[] args) {
		
		Variable_01 oop = new Variable_01();
		oop.func01();
		oop.func02();

	}

}
