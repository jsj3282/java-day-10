package day10;

import java.util.Scanner;

class ClassFinal_01{
	public String KOREA = "���ѹα�";
	public void func() {
		System.out.println("���� �� KOREA : " + KOREA);
		Scanner input = new Scanner(System.in);
		System.out.print("�Է� : ");
		KOREA = input.nextLine();
		System.out.println("���� �� KOREA : " + KOREA);
	}
}
public class Test15 {

	public static void main(String[] args) {
		
		ClassFinal_01 oop = new ClassFinal_01();
		oop.func();

	}

}
