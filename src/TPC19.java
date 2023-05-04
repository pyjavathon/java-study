import study.theory.Animal;
import study.theory.Cat;
import study.theory.Dog;

public class TPC19 {
	
	
	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.eat();
		Cat c = new Cat();
		c.eat();
		
		System.out.println("---------------------------");
		
		//업캐스팅 : 부모쪽으로 객체 만드는 것
		Animal ani = new Dog();
		
		ani = new Cat();
		
		((Cat)ani).night();//다운캐스팅
		
		
	}

}
