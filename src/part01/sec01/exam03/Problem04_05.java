package part01.sec01.exam03;

import java.util.Scanner;

public class Problem04_05 {

	public static void main(String[] args) {

		char gender = ' '; // 공백 문자
		String regNo=" "; // String 이라 큰따옴표
		
		System.out.print("당신의 주민번호를 입력하세요.(123456-1111111) => ");
		Scanner s = new Scanner(System.in);
		regNo = s.nextLine(); // nextLine => 문자열에 공백을 입력해도 출력함
//		System.out.println(regNo); // next => 공백을 넣으면 공백 전 문자들만 출력
		gender=regNo.charAt(7);
		
		switch(gender) {
		case '1':
		case '3':
			System.out.println("남자입니다");
			break;
		case '2':
		case '4':
			System.out.println("여자입니다");
			break;
		default:
			System.out.println("유효하지 않은 주민등록번호입니다.");
			
		}
		s.close();
	}

}
