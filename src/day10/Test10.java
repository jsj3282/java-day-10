package day10;

import java.util.Scanner;

class Game_02{
	public static String info = "�� ������ �׼� ���� �Դϴ�";
	public void make() {
		System.out.println("ĳ���Ͱ� �����Ǿ����ϴ�.");
	}
}
public class Test10 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("1. ���� ���� 2. ��� ����ϱ�");
		System.out.print(">>> ");
		int num = input.nextInt();
		if(num==1) {
			System.out.println(Game_02.info);
		}else if(num==2) {
			System.out.println("ȸ�� ������ ����ڸ� �̿��� �� �ֽ��ϴ�.");
			System.out.println("ȸ�� ���� �����߽��ϴ�.");
			Game_02 gg = new Game_02();
			System.out.println("1. ĳ���� ����");
			int select = input.nextInt();
			gg.make();
		}

	}

}
