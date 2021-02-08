package EJ3;

public class Maquina {
	private final String COLOR_DEF = "blanco";
	private final char CONS_DEF = 'F';
	private final int PB_DEF = 100;
	private final int PESO_DEF = 5;
	private final String coloresStock[] = {"blanco","negro","rojo","azul","gris"};

	private int precioBase;
	private String color;
	private char consumo;
	private int peso;
	
	public Maquina() {
		this.precioBase =PB_DEF;
		this.color = COLOR_DEF;
		this.consumo = CONS_DEF;
		this.peso = PESO_DEF;
	}
	
	public Maquina(int precio,int peso) {
		this.precioBase =precio;
		this.color = COLOR_DEF;
		this.consumo = CONS_DEF;
		this.peso = peso;
	}
	
	public Maquina(int precio,int peso,String color,char consumo) {
		this.precioBase =precio;
		color = color.toLowerCase();
		for (int i = 0; i < coloresStock.length; i++) {
			if(color.equals(coloresStock[i])) {
			this.color = color;
		}
		}
		
		if(this.color == null) {
			this.color = COLOR_DEF + "(color por defecto)";
		}
		if(consumo >= 'A' && consumo <= 'F') {
			this.consumo = consumo;
		}else {
			this.consumo = CONS_DEF;
		}
		
		this.peso = peso;
	}
	
	public void imprimirMaquina() {
		System.out.println("Color: "+this.color
				+"\nConsumo: "+this.consumo
				+"\nPeso: "+this.peso
				+"\nPrecio: "+this.precioBase);
	}

	public int getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(int precioBase) {
		this.precioBase = precioBase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumo() {
		return consumo;
	}

	public void setConsumo(char consumo) {
		this.consumo = consumo;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	

}
