package day10;

import java.util.Scanner;

class Game_01{
	public String info = "�� ������ �׼� �����Դϴ�";
	public void make() {
		System.out.println("ĳ���Ͱ� ���� �Ǿ����ϴ�.");
	}
}
public class Test09 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Game_01 gg = new Game_01();
		System.out.println("1. ���� ���� 2. ��� ����ϱ�");
		System.out.print(">>> ");
		int num = input.nextInt();
		if(num == 1) {
			System.out.println(gg.info);
		}else if(num == 2) {
			System.out.println("���� ��ġ�� �Ͽ��� �մϴ�.");
			System.out.println("��ġ�� �Ϸ�Ǿ����ϴ�.");
			System.out.println("1. ĳ���� ����");
			int select = input.nextInt();
			gg.make();
		}
	}

}
