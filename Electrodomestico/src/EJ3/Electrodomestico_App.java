package EJ3;

public class Electrodomestico_App {

	public static void main(String[] args) {
		Maquina maq1 = new Maquina();
		
		maq1.imprimirMaquina();
		
		Maquina maq2 = new Maquina(250,300);
		
		maq2.imprimirMaquina();
		
		Maquina maq3 = new Maquina(300,420,"azul",'A');
		
		maq3.imprimirMaquina();
		
		Maquina maq4 = new Maquina(300,420,"morado",'Z');
		
		maq4.imprimirMaquina();
		
	}

}
