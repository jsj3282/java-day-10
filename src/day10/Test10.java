package day10;

import java.util.Scanner;

class Game_02{
	public static String info = "이 게임은 액션 게임 입니다";
	public void make() {
		System.out.println("캐릭터가 생성되었습니다.");
	}
}
public class Test10 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("1. 게임 설명 2. 기능 사용하기");
		System.out.print(">>> ");
		int num = input.nextInt();
		if(num==1) {
			System.out.println(Game_02.info);
		}else if(num==2) {
			System.out.println("회원 가입한 사용자만 이용할 수 있습니다.");
			System.out.println("회원 가입 성공했습니다.");
			Game_02 gg = new Game_02();
			System.out.println("1. 캐릭터 생성");
			int select = input.nextInt();
			gg.make();
		}

	}

}
