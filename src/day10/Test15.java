package day10;

import java.util.Scanner;

class ClassFinal_01{
	public String KOREA = "대한민국";
	public void func() {
		System.out.println("변경 전 KOREA : " + KOREA);
		Scanner input = new Scanner(System.in);
		System.out.print("입력 : ");
		KOREA = input.nextLine();
		System.out.println("변경 후 KOREA : " + KOREA);
	}
}
public class Test15 {

	public static void main(String[] args) {
		
		ClassFinal_01 oop = new ClassFinal_01();
		oop.func();

	}

}
