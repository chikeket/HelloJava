package chap05;

public class Arr204 {

	public static void main(String[] args) {
		// 배열 생성, 배열데이터 활용
		//p204 예제
		int[] scores;
		scores = new int[] {83,90, 87};
		int sum1 = 0;
		for(int i=0;i<3; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합 : "+sum1);
		
		int sum2 = add(new int[] {83, 90, 87});
		System.out.println("총합 : "+sum2);
		System.out.println();
		
		//int 형의 배열 선언 , 크기 : 5
		// 배열에 50~100사이의 수 5개 입력
		// 배열의 합 계산
		int[] pracArr = new int[5];
		//배열의 값
		for(int j=0;j<pracArr.length;j++) {			
			pracArr[j] = (int)(Math.random()*51)+50;
		}
		int sum3 = add(pracArr);
		System.out.println("배열합 = " + sum3);
		System.out.println("배열합 = " + add(pracArr));
		

	}//end main

	public static int add(int[] scores) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i=0;i<scores.length;i++) {
			sum += scores[i];
		}
		return sum;
	}//end add

}//end class
