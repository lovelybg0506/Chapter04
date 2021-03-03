package part01.sec01.exam02;

public class Ex04_08 {

	public static void main(String[] args) {
		
		int a=10, b=5;
		int i;
		
		if(a>b)
			i=a-b;
		else
			i=b-a;
		System.out.println("i="+i);
		
		// 조건 연산자
		
		i=a>b?a-b:b-a;
		System.out.println("i="+i);
	}

}
