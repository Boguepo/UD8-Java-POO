package EJ1;


public class Persona {
	private final char SEXO_DEF = 'H';
	private final String DNI_DEF="11111111A";
	
	private String nombre;
	private int edad,peso,altura;
	private String DNI;
	private char sexo;
	
	
	
	
	public Persona() {
		this.nombre = "";
		this.edad = 0;
		this.altura = 0;
		this.peso = 0;
		this.sexo = SEXO_DEF;
		this.DNI = DNI_DEF;
	}
	
	public Persona(String nombre,char sexo) {
		
		this.nombre = nombre;
		this.DNI = DNI_DEF;
		if(sexo == 'H'||sexo =='M') {
			this.sexo = sexo;
		}else {
			this.sexo = SEXO_DEF;
		}
		
		this.edad = 0;
		this.altura = 0;
		this.peso = 0;
	}
	
	public Persona(String DNI, String nombre,char sexo,int edad,int altura,int peso) {
		
		this.nombre = nombre;
		this.DNI = DNI;
		if(sexo == 'H'||sexo =='M') {
			this.sexo = sexo;
		}else {
			this.sexo = SEXO_DEF;
		}
		
		this.edad = edad;
		this.altura = altura;
		this.peso = peso;
	}
	
	public void imprimirPersona() {
		System.out.println("DNI: "+this.DNI
				+"\nNombre: "+this.nombre
				+"\nEdad: "+this.edad
				+"\nSexo:"+this.sexo
				+"\nAltura: "+this.altura
				+"\nPeso: "+this.peso);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

}
