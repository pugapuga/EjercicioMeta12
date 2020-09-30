package tablero;

public class Tarjeta {
	private String nombre;
	private Tablero tablero;
	private Tarea tarea;

	public Tarjeta(String nombre, Tablero tablero, Tarea tarea) {
		this.nombre = nombre;
		this.tablero = tablero;
		this.tarea = tarea;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Tablero getTablero() {
		return tablero;
	}

	public void setTablero(Tablero tablero) {
		this.tablero = tablero;
	}

	public Tarea getTarea() {
		return tarea;
	}

	public void setTarea(Tarea tarea) {
		this.tarea = tarea;
	}

	@Override
	public String toString() {
		return "Tarjeta{" +
				"nombre='" + nombre + '\'' +
				'}';
	}
}