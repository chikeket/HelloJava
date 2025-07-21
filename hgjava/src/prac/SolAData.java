package prac;

import java.util.Scanner;

public class SolAData {
	//필드
	//생성자
	//메소드
	Scanner sc = new Scanner(System.in);
	SolA[] bData(int n) {
		SolA[] books = new SolA[n];
		for(int i=0; i<n;i++) {
			System.out.println("책번호");
			int num = Integer.parseInt(sc.nextLine());
			System.out.println("책이름");
			String name = sc.nextLine();
			System.out.println("책가격");
			int price = Integer.parseInt(sc.nextLine());
			books[i] = new SolA(num,name,price);
		}
		return books;
	}
}
