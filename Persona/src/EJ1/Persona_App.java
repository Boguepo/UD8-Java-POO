package EJ1;

public class Persona_App {

	public static void main(String[] args) {
	Persona persona1 = new Persona();
	
	persona1.imprimirPersona();
	
	Persona persona2 = new Persona("Maria Lopez",'M');
	
	persona2.imprimirPersona();
	
	Persona persona3 = new Persona("22222222B","Antonio Arjona",'H',24,188,87);
	
	persona3.imprimirPersona();
	}

}
