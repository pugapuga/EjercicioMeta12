package tablero;

public class Columna {
	private String titulo;
	private Tablero tablero;
	private Fase fase;

	public Columna(String titulo, Tablero tablero, Fase fase) {
		this.titulo = titulo;
		this.tablero = tablero;
		this.fase = fase;
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

	public Fase getFase() {
		return fase;
	}

	public void setFase(Fase fase) {
		this.fase = fase;
	}

	@Override
	public String toString() {
		return "Columna{" +
				"titulo='" + titulo + '\'' +
				'}';
	}
}