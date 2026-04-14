package gestiondam;
/**
 * Clase que gestiona una asignatura.
 * @author Rubén Serrano
 * @version 1.0
 * @since 2026-03-20
 */
public class Asignatura {

    private String nombre;
    private int creditos;

    /**
     * Constructor de la clase Asignatura.
     * @param nombre El nombre de la asignatura.
     */
    public Asignatura(String nombre) {
        this.nombre = nombre;
        this.creditos = 6;
    }

    /**
     * Calcula total de creditos.
     * @param multiplicador Número por el que multiplicar.
     * @return El resultado del cálculo.
     * @throws ArithmeticException Sí hay error matematico.
     */
    public int calcular(int multiplicador) {
        int total = 0;
        try {
            total = this.creditos * multiplicador;
        } catch (ArithmeticException e) {
            System.out.println("Error de calculo");
        }
        return total;
    }

    /**
     * Devuelve el nombre.
     * @return Nombre de la asignatura.
     */
    public String getNombre() {
        return this.nombre;
    }
}