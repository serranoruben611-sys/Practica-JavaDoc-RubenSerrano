package gestiondam;

/**
 * Clase que representa a un alumno.
 * @author Rubén Serrano
 * @version 1.0
 * @since 2026-03-20
 */
public class AlumnoDam {

    private String nombre;
    private int edad;

    /**
     * Constructor de la clase AlumnoDam.
     * @param nombre El nombre del alumno.
     */

    public AlumnoDam(String nombre) {
        this.nombre = nombre;
        this.edad = 18;
    }

    /**
     * Cambia la edad con control de errores.
     * @param nuevaEdad La edad a establecer.
     * @return La edad final.
     * @throws Exception Si la edad es negativa.
     */
    public int setEdad(int nuevaEdad) throws Exception {
        try {
            if (nuevaEdad < 0) {
                throw new Exception("Error: Edad negativa");
            }
            this.edad = nuevaEdad;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            this.edad = 0;
        }
        return this.edad;
    }

    /**
     * Saludo básico.
     * @deprecated Metodo antiguo.
     */
    @Deprecated
    public void saludar() {
        System.out.println("Hola");
    }
}