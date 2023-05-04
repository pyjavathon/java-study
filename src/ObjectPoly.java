import study.theory.Animal;
import study.theory.Cat;
import study.theory.Dog;

public class ObjectPoly {

	public static void main(String[] args) {
		//Animal r = new Animal();
		//display(r);
		
		Dog d = new Dog();
		Cat c = new Cat();
		display(d);
		display(c);
		 
	}

	//업캐스팅
	private static void display(Animal r) {//다형성 인수
		r.eat();
		if(r instanceof Cat)((Cat)r).night();//다운캐스팅
	}

	

}
