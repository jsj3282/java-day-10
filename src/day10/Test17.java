package day10;

class ClassFinal_03{
	public final String KOREA = "¥Î«—πŒ±π";
	public final String PI = "3.14";
	
}

class User1{
	public ClassFinal_03 user = new ClassFinal_03();
	public void func() {
		System.out.println("KOREA : " + user.KOREA);
		System.out.println("PI : " + user.PI);
	}
}

class User2{
	public ClassFinal_03 user = new ClassFinal_03();
	public void func() {
		System.out.println("KOREA : " + user.KOREA);
		System.out.println("PI : " + user.PI);
	}
}
public class Test17 {

	public static void main(String[] args) {
		User1 u1 = new User1();
		User2 u2 = new User2();
		u1.func();
		u2.func();
		
	}

}
