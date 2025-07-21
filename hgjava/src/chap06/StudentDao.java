package chap06;

public class StudentDao {
	//학생 데이터 생성
	//필드
	//생성자: 기본생성자 => 컴파일 자동 생성
	//메소드
	Student[] stData(){
		Student[] students = {
				new Student("홍길동", 100, 100, 100),
				new Student("강길동", 90, 90, 90),
				new Student("이길동", 100, 50, 100),
				new Student("황길동", 100, 40, 100),
				new Student("고길동", 70, 100, 100),
				new Student("성춘향", 99, 99, 99),
				new Student("강춘향", 88, 88, 88),
				new Student("이춘향", 98, 47, 98),
				new Student("황춘향", 98, 38, 98),
				new Student("고춘향", 68, 98, 98)
		};
		return students;
	}

}
