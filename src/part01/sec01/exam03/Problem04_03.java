package part01.sec01.exam03;

import java.util.Scanner;

import javax.swing.border.SoftBevelBorder;

public class Problem04_03 {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		int a,b;
		char ch;
		String[] str; //배열(같은 자료형의 연속된 메모리 공간)

		System.out.print("수식을 한 줄로 입력을 하되 띄어쓰기로 입력하세요: ");
		str=s.nextLine().split(" "); //"여기에 공백을 쓰지 않으면 공백 인식안함" "abc defg h"
									//nextline은 공백을 포함한 	문자열을 입력받는다,
		a=Integer.parseInt(str[0]); // [0]번째, Integer.parseInt == 숫자로 바꿔라
		ch=str[1].charAt(0);		// [1]번째
		b=Integer.parseInt(str[2]);	// [2]번째
		
		switch(ch) {
		case '+':
			System.out.printf("%d+%d=%d입니다.\n",a,b,a+b);
			break;
		case '-':
			System.out.printf("%d-%d=%d입니다.\n",a,b,a-b);
			break;
		case '*':
			System.out.printf("%d*%d=%d입니다.\n",a,b,a*b);
			break;
		case '/':
			System.out.printf("%d/%d=%d입니다.\n",a,b,a/b);
			break;
		case '%':
			System.out.printf("%d%%%d=%d입니다.\n",a,b,a%b);
			break;
		default:
			System.out.printf("연산자를 잘못 입력 했습니다.");
		}
		
		s.close();
	}

}
