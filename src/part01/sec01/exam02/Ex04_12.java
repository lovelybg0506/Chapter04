package part01.sec01.exam02;

import java.util.Scanner;

public class Ex04_12 {

	public static void main(String[] args) {

		char grade;
		Scanner s=new Scanner(System.in);
		
		grade=s.next().charAt(0);// s.next()문자열을 읽어들이는데 .charAt(0) 문자열의0번째위치의 값을 읽음
				
		switch(grade) {
		case 'A':
			System.out.println("참 잘했습니다.");
			break;
		case 'B':
			System.out.println("참 잘했습니다.");
			break;
		case 'C':
			System.out.println("좀 더 노력하세요.");
			break;
		case 'D':
			System.out.println("좀 더 노력하세요.");
			break;
		case 'F':
			System.out.println("다음 학기에 다시 수강하세요.");
			break;
		default:
			System.out.println("잘못된 학점입니다.");
		}
		

	}

}
