package EJ2;

import java.util.Random;

public class Password {
	
	Random r = new Random();
	private int longitud = 8;
	private String password;
	
	public Password() {
		
		this.password = "";
		for (int i = 0; i < longitud; i++) {
			this.password += r.nextInt(9)+1;
		}
	}
	
	public Password(int longitud) {
		
		this.longitud = longitud;
		this.password= "";
		for (int i = 0; i < longitud; i++) {
			this.password += r.nextInt(9)+1;
		}
	}
	
	public void imprimirPass() {
		System.out.println("Longitud: "+this.longitud
				+"\nPassword: "+this.password);
	}
	
	public int getLongitud() {
		return longitud;
	}
	
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	
	
	

}
