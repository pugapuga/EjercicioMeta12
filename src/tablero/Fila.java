package tablero;

public class Fila {
	private String titulo;
	private Tablero tablero;

	public Fila(String titulo, Tablero tablero) {
		this.titulo = titulo;
		this.tablero = tablero;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Tablero getTablero() {
		return tablero;
	}

	public void setTablero(Tablero tablero) {
		this.tablero = tablero;
	}

	@Override
	public String toString() {
		return "Fila{" +
				"titulo='" + titulo + '\'' +
				'}';
	}
}