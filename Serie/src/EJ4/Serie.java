package EJ4;

public class Serie {

	private String titulo;
	private int nTemporadas = 3;
	private boolean entregado = false;
	private String genero;
	private String autor;
	
	public Serie() {
		this.titulo = "";
		this.genero = "";
		this.autor = "";
	}
	
	public Serie(String titulo, String autor) {
		this.titulo = titulo;
		this.genero = "";
		this.autor = autor;
	}
	
	public Serie(String titulo, String autor,String genero,int nTemporadas) {
		this.titulo = titulo;
		this.genero = genero;
		this.autor = autor;
		this.nTemporadas = nTemporadas;
	}
	
	public void imprimirSerie() {
		System.out.println("Titulo: "+this.titulo
				+"\nAutor: "+this.autor
				+"\nGenero: "+this.genero
				+"\nTemporadas: "+this.nTemporadas);
		if(this.entregado) {
			System.out.println("Entregado: SI");
		}else {
			System.out.println("Entregado: NO");
		}
		System.out.println("-------------------------");
	} 

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getnTemporadas() {
		return nTemporadas;
	}

	public void setnTemporadas(int nTemporadas) {
		this.nTemporadas = nTemporadas;
	}

	public boolean isEntregado() {
		return entregado;
	}

	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	
}
