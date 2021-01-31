package oop_java_1;

// 로드 자전거의 추가 기능을 구현해보기, speed up을 *2 또는 +2씩 하는 형태로 변경해보기
public class RoadBike extends Bicycle {
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
		System.out.println("Road bike");
		super.printStates();
	}
}
