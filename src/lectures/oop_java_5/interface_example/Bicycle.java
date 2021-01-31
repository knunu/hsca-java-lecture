package oop_java_5.interface_example;

public interface Bicycle {
	// 분당 바퀴 회전수
	void changeCadence(int newValue);

	void changeGear(int newValue);

	void speedUp(int increment);

	void applyBrakes(int decrement);
}
