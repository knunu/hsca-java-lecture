package oop_java_1;

public class BicycleDemo {
	public static void main(String[] args) {
		// 각각 bike1, bike2 자전거 생성
		Bicycle bike1 = new Bicycle();
		Bicycle bike2 = new Bicycle();

		// 각 자전거의 메소드 호출
		bike1.changeCadence(50);
		bike1.speedUp(10);
		bike1.changeGear(2);
		bike1.printStates();

		bike2.changeCadence(50);
		bike2.speedUp(10);
		bike2.changeGear(2);
		bike2.changeCadence(40);
		bike2.speedUp(10);
		bike2.changeGear(3);
		bike2.printStates();
	}
}
