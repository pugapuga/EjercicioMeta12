package tablero;

import java.util.*;

public class Tablero extends Herramienta{

	private String nombre;
	private Collection<Tarjeta> tarjetas = new ArrayList<Tarjeta>();
	private Collection<Fila> filas = new ArrayList<Fila>();
	private Collection<Columna> columnas = new ArrayList<Columna>();

	public Tablero(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Collection<Tarjeta> getTarjetas() {
		return tarjetas;
	}

	public void setTarjetas(Collection<Tarjeta> tarjetas) {
		this.tarjetas = tarjetas;
	}

	public Collection<Fila> getFilas() {
		return filas;
	}

	public void setFilas(Collection<Fila> filas) {
		this.filas = filas;
	}

	public Collection<Columna> getColumnas() {
		return columnas;
	}

	public void setColumnas(Collection<Columna> columnas) {
		this.columnas = columnas;
	}

	@Override
	public String toString() {
		return "Tablero{" +
				"nombre='" + nombre + '\'' +
				", tarjetas=" + tarjetas +
				", filas=" + filas +
				", columnas=" + columnas +
				'}';
	}
}