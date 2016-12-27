package rgqancy;

public class Startup {

	public static void main(String[] args) {
		Singleton singletona = Singleton.getInstance();
		
		System.out.println(singletona);
		
		Singleton singletonb = Singleton.getInstance();
		
		System.out.println(singletona);
	}
}


