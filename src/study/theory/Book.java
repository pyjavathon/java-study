package study.theory;

public class Book {

	public static String name;
	
	
	
	public static int sum(int a, int b) {
		int c = a+b;
		return c;
	}
	
	private Book() {};
	
	//프라이빗 생성자 하면 static으로 멤버를 만들어서 클래스명.멤버변수 or메서드 이렇게 사용할 수 있다.
	
}
