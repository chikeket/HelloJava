package chap01;

import java.util.Scanner;

public class Ex149 {

	public static void main(String[] args) {
		// p149 문제1
		byte b = 5;
		b = (byte)-b; // 마이너스를 붙히는 연산행위가 일어나면서 타입이 int로 바뀌는데 그게 byte인 b와 같다고 하니까 생기는 오류
		int result = 10 / b;
		System.out.println(result);
		
		// p149 문제2
		int x = 10;
		int y = 20;
		int z = (++x) + (y--); //x는 1을 더한후 연산되기에 x=11, y는 빼기전에 연산되니까 y=20 결과로 z는 31이 나옴
		System.out.println(z); //z는 31
		
		// p149 문제3
//		boolean stop = ;
//		while(!stop)
		
		// p149 문제4
		int pencils = 534;
		int students = 30;
		
		//학생 1명 가지는 연필 개수
		int pencilsPerStudent = pencils/students;
		System.out.println(pencilsPerStudent);
		
		//남은 연필 개수
		int pencilsLeft = pencils % students;
		System.out.println(pencilsLeft);
		
		// p149 문제5 기대값5인데 4로 출력이 되었다 출력값 5가 되게 수정하기
		int var1 = 5;
		int var2 = 2;
		double var3 = (double)var1 / var2; //둘다 int라서 소숫점이 버려지면서 연산이 됨 그래서 둘중 하나는 double로 바꿔야 됨
		int var4 = (int) (var3 *var2);
		System.out.println(var4);
		
		// p149 문제6 10의자리 이하 버리는 코드 356의 변수 입력에 출력이 300이 나오게 코드 작성
		int value = 356;
		System.out.println(value-(value%100)); //%써서 10의 자리의 나머지가 나오게 만들어서 원래값에서 빼면 됨
		
		// p149 문제7 10%입니다를 기대하게끔 코드 수정
		float var71 = 10f;
		float var72 = var71 / 100;
		if(var72 == 0.1f) {// 0.1이 double타입이라 안되던 거였음
			System.out.println("10%입니다.");
		}else{
			System.out.println("10%가 아닙니다.");
		}
		
		// p149 문제8
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = ((lengthTop+lengthBottom)*height*0.5); //0.5가 double타입이라 자동으로 변환됨
		System.out.println(area);
		
		// p149 문제9
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 수: \n");
		double scanA = Double.parseDouble(sc.nextLine());
		
		System.out.print("두 번째 수: \n");
		double scanB = Double.parseDouble(sc.nextLine());
		
		System.out.println("----------");
		String sol9Result;
		if(scanB == 0) {
			sol9Result = "무한대";
		}else {
			sol9Result = String.valueOf(scanA/scanB);
		}
		System.out.println("결과:"+ sol9Result);
		
		// p152 문제10
		int sol10Var1 = 10;
		int sol10Var2 = 3;
		int sol10Var3 = 14;
		double sol10Var4 = sol10Var1 * sol10Var1 * Double.parseDouble(sol10Var2 + "." + sol10Var3);
		System.out.println("원의 넓이:" + sol10Var4);
		
		//p152 문제11
		//9번문제에서 스캐너 빌려와서 객체로 만들었음 "sc"
//		System.out.print("아이디:");
//		String name = sc.nextLine();
//		
//		System.out.print("패스워드:");
//		String strPassword = sc.nextLine();
//		int password = Integer.parseInt(strPassword);
//		
//		if() {
//			if() {
//				System.out.println("로그인 성공");
//			}else {
//				System.out.println("로그인 실패:패스워드가 틀림");
//			}
//		}else {
//			System.out.println("로그인 실패:아이디 존재하지 않음");
//		}
		//윤년 계산 프로그램
		//입력된 년도가 윤년인지 계산하는 프로그램 작성
		//4로 나누어 떨어지고, 100으로 나누어 떨어지지 않으면 윤년
		//400으로 나누어 떨어지면 윤년
		System.out.println("윤년계산기 입니다 년도를 입력하세요>>");
		int yearNum = Integer.parseInt(sc.nextLine());
		if(yearNum%4 == 0 && (yearNum%100 != 0 ||yearNum%400 == 0)){
			System.out.println(yearNum+"년 윤년입니다");
		}else {
			System.out.println(yearNum+"년 평년입니다");			
		}
		
		sc.close();
	}

}
