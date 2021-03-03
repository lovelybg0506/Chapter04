package part01.sec01.exam02;

import java.util.Scanner;

public class Ex04_11 {

	public static void main(String[] args) {

		int a;
		Scanner s = new Scanner(System.in);

		System.out.println("1~4중에 선택하세요: ");
		a = s.nextInt();

		switch (a) { // switch(정수,String)
		case 1:
			System.out.println("1을 선택했다.");
			break;
		case 2:
			System.out.println("2를 선택했다.");
			break;
		case 3:
			System.out.println("3을 선택했다.");
			break;
		case 4:
			System.out.println("4를 선택했다.");
			break;
		default:
			System.out.println("해당번호는 없습니다.");
		}

		s.close();

	}

}
