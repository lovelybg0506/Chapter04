package part01.sec01.exam03;

import java.util.Scanner;

public class Problem04_04 {

	public static void main(String[] args) {

		int user,com;
		Scanner s=new Scanner(System.in);
		
		System.out.print("가위(1),바위(2),보(3)중 하나를 입력하세요.=>");
		
		String tmp=s.nextLine(); // 공백포함 문자열
		user=Integer.parseInt(tmp);
		com=(int)(Math.random()*3)+1; //1~3

		System.out.println("당신은"+user+"입니다.");
		System.out.println("컴퓨터는"+com+"입니다.");
		
		switch(user-com) {
		case -1:
		case 2:
		System.out.println("당신이 졌습니다.");
		break;
		
		case 1:
		case -2:
		System.out.println("당신이 이겼습니다.");
		break;
		
		case 0:
			System.out.println("비겼습니다.");
		}
		s.close();
	}

}
