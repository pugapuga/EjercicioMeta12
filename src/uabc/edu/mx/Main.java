package uabc.edu.mx;

import mipaquete.Alumno;
import tablero.Columna;
import tablero.Tablero;

public class Main {

    public static void main(String[] args) {
        Tablero tablero = new Tablero("Mi tablero");
        Columna columna1 = new Columna("To-Do", tablero, null);
        Columna columna2 = new Columna("In progress", tablero, null);
        Columna columna3 = new Columna("Done", tablero, null);
        tablero.getColumnas().add(columna1);
        tablero.getColumnas().add(columna2);
        tablero.getColumnas().add(columna3);
        System.out.print(tablero);
    }
}
