package edu.kh.api.dto;

public class Student {
	
	private int grade;
	private int classroom;
	private int number;
	private String name;

	
	
	
	public Student() {
		
	}
	
	
	public Student(int grade, int classroom, int number, String name) {
		super();
		this.grade = grade;
		this.classroom = classroom;
		this.number = number;
		this.name = name;
	}


	


	public int getGrade() {
		return grade;
	}


	public void setGrade(int grade) {
		this.grade = grade;
	}


	public int getClassroom() {
		return classroom;
	}


	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}


	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return String.format("%d / %d / %d / %s", grade, classroom, number, name);
	}
	
	
// Object.equals()오버라이딩
	// -> 현재 객체와 다른 객체가 동등(필드 값이 같은지 비교)
	// 필드를 가지고 있는 자식 클래스가 알맞은 형태로 재정의(오버라이딩) 필요
	@Override
	public boolean equals(Object obj) {
		
		// 같은 객체를 참조할 경우
		if(this == obj) return true;
		
		//null인 경우 비교 자체가 불필요
		if(obj == null) return false;
		
		//비교를 위해 전달 받은 객체 Student가 맞는가?
		// false인 경우 실행
		if(!(obj instanceof Student)) return false;
		
		
		//필드 비교
		Student other = (Student)obj; // obj다운 캐스팅
		
		if(this.grade != other.grade) return false;
		if(this.classroom != other.classroom) return false;
		if(this.number != other.number) return false;
		if(this.name.equals(other.name)) return false;
		
		return true; //모든 필드가 같을 경우
	}
	
	
	
	
	// Object.hashcode();
	// - 두 객체의 필드값이 같다면 hashcode()도 똑같은 정수 값을 반환해야 한다. 
	
	// - hash 함수: 입력받은 문자열/숫자를 특정한 길이의 문자열/숫자로 반환
	//				-> 최대한 중복되지 않는 숫자를 만들어냄
	
	// - hashcode() : 객체의 필드 값을 이용해서 일정한 길이의 숫자를 만드는 함수
	
	// 왜 필요한가? Java실행 시 내부에서 객체를 검색하는 속도 증가
	
	// 어떻게 작성하는가?
	// 필드 값이 같으면 항상 같은 수가 나올 수 있도록 구현
	// + equals() 오버라이딩 시 필수적으로 같이 오버라이딩
	
	
	@Override
	public int hashCode() {
		int result = 1;
		final int PRIME = 31; // 소수(곱연산 시 속도가 빠름)
		
		result = result * PRIME + grade;
		result = result * PRIME + classroom;
		result = result * PRIME + number;
		result = result * PRIME + ( name == null ? 0 : name.hashCode() );
		
		
		return result;
		
	}
	
	
	

}





















