/*
 * Esta clase almacena los datos fila, columna y dato en una tripleta
 */
package matricesll;

/**
 *
 * @author Felipe Cadavid
 * @author Carolina Diaz
 * @author Luis Angel Vanegas
 * @version 14-09-2017
 * 
 */
public class Tripleta {
    
    private int columna;
    private int fila;
    private double dato;

    public Tripleta(int columna, int fila, double dato) {
        this.columna = columna;
        this.fila = fila;
        this.dato = dato;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public double getDato() {
        return dato;
    }

    public void setDato(double dato) {
        this.dato = dato;
    }
    
    


    
}