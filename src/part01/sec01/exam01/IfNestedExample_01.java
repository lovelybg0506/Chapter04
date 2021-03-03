package part01.sec01.exam01;

public class IfNestedExample_01 {

	public static void main(String[] args) {

		int score=(int) (Math.random()*20); // 임의의 숫자(0.0~0.99999)를 자동으로 만들어냄
//		System.out.println(score);
		score = score + 81;
		System.out.println("점수: "+score);
		
		String grade;
		
		if(score>=90) {
		if(score>=95) {
			grade="A+";
		}else 
			grade="A";
		}else {
		if(score>=85) {
			grade="B+";
		}else {
			grade="B";
		}
	}
		System.out.println("학점: "+grade);
		
	}

}
