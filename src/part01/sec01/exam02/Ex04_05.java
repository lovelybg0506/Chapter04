package part01.sec01.exam02;

import java.util.Scanner;

// Scanner, if 사용
public class Ex04_05 {

	public static void main(String[] args) {

		int number;
		Scanner n = new Scanner(System.in);
		System.out.println("수를 입력하세요: ");
		number = n.nextInt();
		if(number % 3 == 0)
			System.out.println("3의 배수 입니다.");
		else
			System.out.println("3의 배수가 아닙니다.");
		n.close();
	}
	
}

//if (number==3) 	내가해봤지만 안됨 ,문제 잘못이해
//for (int a=1;a<10;a++) {
//
//System.out.printf("%d \n",number*a);
//System.out.println("3의 배수 입니다.");
//}else 
//System.out.println("3의 배수가 아닙니다.");
//}
//
//}