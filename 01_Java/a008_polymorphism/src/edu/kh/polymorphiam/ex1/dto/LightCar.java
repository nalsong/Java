package edu.kh.polymorphiam.ex1.dto;

public class LightCar extends Car{
	
	private double discountOffer; // 할인 혜택
	
	//기본 생성자
	public LightCar() {
		super();
	}
	
	
	//매개변수 생성자
	public LightCar(int wheel, int seat, String fuel, double discountDffer) {
		
		super(wheel, seat, fuel);
		
		this.discountOffer = discountDffer;
	}

	
//  getter/setter
	public double getDiscountOffer() {
		return discountOffer;
	}


	public void setDiscountOffer(double discountOffer) {
		this.discountOffer = discountOffer;
	}

	
	@Override
	public String toString() {
		return super.toString() + " / 할인율 : " + discountOffer * 100 + "%";
	}
	
	public void print() {
		System.out.println("고속도로 요금, 주차장 요금, 세금 혜택을 받을 수 있다.");
	}
	
}
