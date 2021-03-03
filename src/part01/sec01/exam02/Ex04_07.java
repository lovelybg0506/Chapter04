package part01.sec01.exam02;

import java.util.Scanner;

// Scanner, if 홀수,짝수
public class Ex04_07 {
	
	public static void main(String[] args) {

		int a;

		System.out.print("숫자를 입력하세요 : ");
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		
		
		if(a % 2 == 0) {
			System.out.println("짝수 입니다.");
		}
		else {
			System.out.println("홀수 입니다.");
			
		}
	}

}
//맞았다!!