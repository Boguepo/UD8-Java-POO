package EJ2;

public class Password_App {

	public static void main(String[] args) {
		Password pass1 = new Password();
		
		pass1.imprimirPass();
		
		Password pass2 = new Password(12);
		
		pass2.imprimirPass();

	}

}
