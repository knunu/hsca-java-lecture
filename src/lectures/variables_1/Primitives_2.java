package variables_1;

public class Primitives_2 {
	// 8bit (1byte) 크기의 부호가 있는 정수 자료형, -128 ~ 127, 큰 Array에서 메모리를 아끼기 위해 유용
	byte _byte = 0;

	// 16bit (2byte) 크기의 부호가 있는 정수 자료형, -32,768 ~ 32,767, byte와 용레가 비슷
	short _short = 0;

	// 32bit (4byte) 크기의 부호가 있는 정수 자료형, -2^31 ~ 2^31 - 1, Java 8 부터 unsigned integer로 활용 가능(0 ~ 2^32 - 1), 정수를 저장하는 가장 기본적인 자료형
	int _int = 0;

	// 64bit (8byte) 크기의 부호가 있는 정수 자료형, -2^63 ~ 2^63 - 1, Java 8 부터 unsigned integer로 활용 가능(0 ~ 2^64 - 1), 큰 정수를 저장할 때 사용하는 자료형
	long _long = 0L;

	// 32bit (4byte) 크기의 부호가 있는 유리수 자료형, 부동 소수점으로 구성된 값으로 통화 화폐단위에서 사용하면 X (BigDecimal을 사용할 것)
	float _float = 0.0f;

	// 64bit (8byte) 크기의 부호가 있는 유리수 자료형, 마찬가지로 통화 화폐단위에서 사용 X
	double _double = 0.0d;

	// 16bit (2byte) 크기의 단일 문자 자료형
	char _char = '\u0000';

	// char의 리스트, 문자열을 나타내는 자료형, 문자열 인코딩 방식에 따라 사이즈가 동적으로 변경되고, 기본적으로 UTF-16BE 인코딩을 사용하므로, 저장되는 문자열의 길이 * 2bytes 가 된다.
	String _str = null;

	// 1bit 크기의 참 / 거짓을 나타내는 자료형
	boolean _boolean = false;
}
