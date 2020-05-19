package day10;

import java.util.Scanner;

class Game_01{
	public String info = "이 게임은 액션 게임입니다";
	public void make() {
		System.out.println("캐릭터가 생성 되었습니다.");
	}
}
public class Test09 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Game_01 gg = new Game_01();
		System.out.println("1. 게임 설명 2. 기능 사용하기");
		System.out.print(">>> ");
		int num = input.nextInt();
		if(num == 1) {
			System.out.println(gg.info);
		}else if(num == 2) {
			System.out.println("게임 설치를 하여야 합니다.");
			System.out.println("설치가 완료되었습니다.");
			System.out.println("1. 캐릭터 생성");
			int select = input.nextInt();
			gg.make();
		}
	}

}
