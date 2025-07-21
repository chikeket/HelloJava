package chap06_1;

public class Book {
	//필드
	
	private int num;
	private String name;
	private int price;
	//생성자
	Book(int num, String name, int price){
		this.num = num;
		this.name = name;
		this.price = price;
	}
	//메소드
	public int getNum() {
		return num;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	
	//도서 가격 중 최고가격 출력
	
	//도서 가격 중 최저가격 출력
	
	//도서 가격의 평균가격 출력(소수 첫째 자리까지 표현)
	
	
}//end class
