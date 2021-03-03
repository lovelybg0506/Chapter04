package part01.sec01.exam02;

import java.util.Scanner;

public class Ex04_14 {

	public static void main(String[] args) {

		char grade;
		Scanner s=new Scanner(System.in);
		
		int score=s.nextInt();
		
		switch(score/=10) {
		case 10:
		case 9:
			grade='A';
//			System.out.println("학점은"+grade+"입니다");
			break;
		case 8:
			grade='B';
//			System.out.println("학점은"+grade+"입니다");
			break;
		case 7:
			grade='C';
//			System.out.println("학점은"+grade+"입니다");
			break;
		case 6:
			grade='D';
//			System.out.println("학점은"+grade+"입니다");
			break;
		default :
			grade='F';
//			System.out.println("학점은"+grade+"입니다");	
		}

		System.out.println("학점은"+grade+"입니다");	
		
		s.close();
	}

}
