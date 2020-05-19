package day10;

class MySystem{
	public static MyOut out = new MyOut();
	static class MyOut{
		public static void myPrint(int su) {
			System.out.print(su + " 출력 됩니다.");
		}
	}
}
public class Test12 {

	public static void main(String[] args) {
		
		MySystem.out.myPrint(123);

	}

}
