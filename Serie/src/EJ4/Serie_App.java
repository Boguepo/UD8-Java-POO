package EJ4;

public class Serie_App {

	public static void main(String[] args) {
		Serie serie1 = new Serie();
		
		serie1.imprimirSerie();
		
		Serie serie2 = new Serie("Gambito de Dama","Scott Frank y Allan Scott");
		
		serie2.imprimirSerie();
		
		Serie serie3 = new Serie("Gambito de Dama","Scott Frank y Allan Scott","Suspense",1);
		
		serie3.imprimirSerie();

	}

}
