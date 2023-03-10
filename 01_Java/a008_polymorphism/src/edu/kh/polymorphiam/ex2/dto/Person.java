package edu.kh.polymorphiam.ex2.dto;

public class Person extends Animal{
			// ->추상클래스 상속 시 abstract메서드도 상속이 되는 데 미완성 상태이므로 구현(오버라이딩)하라고 에러 발생
	
	private String name;
	private int age;
	
	public Person() {} //기본생성자
	
	
	//매개변수 생성자
	public Person(String type, String eatType, String name, int age) {
		super(type, eatType); // 부모의 매개변수 생성자 호출
		
		this.name = name;
		this.age = age;
	}


	
	//alt + [shift] +s -> r
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}

	
	//toString 오버라이딩
	//alt + [shift] +s -> s

	@Override
	public String toString() {
		return super.toString() + " / " + name + " / " + age ;
	}
	
	
	//상속 받은 추상 메서드 강제 구현(오버라이딩)
	
	@Override
	public void breath() {
		System.out.println("코와 입으로 숨을 쉰다.");
	}
	

	
	
	
	
	
	
}
