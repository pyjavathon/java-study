import study.theory.Animal;
import study.theory.Cat;
import study.theory.Dog;

public class ObjectPolyArr {

	public static void main(String[] args) {

		Animal[] arr = new Animal[2];
		arr[0] = new Dog();
		arr[1] = new Cat();
		
		
		for(int i = 0; i<arr.length;i++) {
			arr[i].eat();
			if(arr[i] instanceof Cat) ((Cat)arr[i]).night();
		}
		display(arr);
	}

	private static void display(Animal[] arr) {
		for(int i = 0;i<arr.length;i++) {
			arr[i].eat();
			if(arr[i] instanceof Cat) ((Cat)arr[i]).night();
		}
		
	}

}
