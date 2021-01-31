package oop_java_1;

// 산악 자전거의 추가 기능을 구현해보기, 충격 완화 기능(suspension) 추가
public class MountainBike extends Bicycle {
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
		System.out.println("Mountain bike");
		super.printStates();
	}
}
