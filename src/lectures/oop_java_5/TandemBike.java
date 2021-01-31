package oop_java_5;

// 2인용 자전거의 추가 기능을 구현해보기, 2개의 인자를 받는 speedUp method 구현하기 (overload)
public class TandemBike extends Bicycle {
	@Override
	void changeCadence(int newValue) {
		super.changeCadence(newValue);
	}

	@Override
	void changeGear(int newValue) {
		super.changeGear(newValue);
	}

	@Override
	void speedUp(int increment) {
		super.speedUp(increment);
	}

	@Override
	void applyBrakes(int decrement) {
		super.applyBrakes(decrement);
	}

	@Override
	void printStates() {
		System.out.println("Tandem bike");
		super.printStates();
	}
}
