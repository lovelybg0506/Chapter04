package part01.sec01.exam02;

import java.util.Scanner;

public class Ex04_03 {

	public static void main(String[] args) {

		int a;
		Scanner s = new Scanner(System.in);
		System.out.print("점수를 입력하세요: ");
		a=s.nextInt();
		
		if (a>=80) 
			System.out.println("축하합니다! 합격입니다.");
			else // false
				System.out.println("다시 도전 하세요!");
		

	}

}
