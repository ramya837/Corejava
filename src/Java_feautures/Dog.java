package Java_feautures;

public interface Dog {
	void bark();
	static void eat() {
		System.out.println("eating peddigree");
		
	}
	default void sleep() {
		System.out.println("dog sleeps 12 hrs daily");
	}

}
