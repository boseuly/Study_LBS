package ch02;

public class Stu05 {
	
	public static void main(String[] args) {
		/*
		 * [6-8] 다음의 코드에 정의된 변수들을 종류별로 구분해서 적으시오.
		 */
	}

}

class PlayingCard{
	int kind;
	int num;
	
	static int width;
	static int height;
	
	PlayingCard(int k, int n){
		kind = k;
		num = n;
		
	/*
	 * - 클래스변수 (static 변수): width, height
	 * - 인스턴스변수 : kind, num
	 * - 지역변수 : k, n   // + card, args
	 * 
	 */
	}
}
