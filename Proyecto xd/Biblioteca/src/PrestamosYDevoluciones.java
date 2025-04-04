import java.time.LocalDateTime;

/**
 * Representa un registro de préstamo y devolución de libros en la biblioteca.
 * Almacena la identificación del usuario, el ISBN del libro prestado,
 * la fecha del préstamo y la fecha de devolución.
 */
public class PrestamosYDevoluciones {
    private int identificacion;
    private int ISBN;
    private LocalDateTime fechaPrestamo;
    private LocalDateTime fechaDevolucion;

    /**
     * Constructor para inicializar un registro de préstamo y devolución.
     *
     * @param identificacion  Identificación del usuario que realiza el préstamo.
     * @param ISBN            Número ISBN del libro prestado.
     * @param fechaPrestamo   Fecha en la que se realiza el préstamo.
     * @param fechaDevolucion Fecha en la que se devuelve el libro (puede ser null
     *                        si no ha sido devuelto).
     */
    public PrestamosYDevoluciones(int identificacion, int ISBN, LocalDateTime fechaPrestamo,
            LocalDateTime fechaDevolucion) {
        this.identificacion = identificacion;
        this.ISBN = ISBN;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }

    /**
     * Obtiene la identificación del usuario que realizó el préstamo.
     *
     * @return Identificación del usuario.
     */
    public int getIdentificacion() {
        return identificacion;
    }

    /**
     * Establece una nueva identificación para el usuario del préstamo.
     *
     * @param identificacion Nueva identificación del usuario.
     */
    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    /**
     * Obtiene el número ISBN del libro prestado.
     *
     * @return ISBN del libro.
     */
    public int getISBN() {
        return ISBN;
    }

    /**
     * Establece un nuevo ISBN para el libro prestado.
     *
     * @param ISBN Nuevo ISBN del libro.
     */
    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    /**
     * Obtiene la fecha en la que se realizó el préstamo.
     *
     * @return Fecha del préstamo.
     */
    public LocalDateTime getFechaPrestamo() {
        return fechaPrestamo;
    }

    /**
     * Establece una nueva fecha de préstamo.
     *
     * @param fechaPrestamo Nueva fecha de préstamo.
     */
    public void setFechaPrestamo(LocalDateTime fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    /**
     * Obtiene la fecha en la que se devolvió el libro.
     *
     * @return Fecha de devolución del libro (puede ser null si no ha sido
     *         devuelto).
     */
    public LocalDateTime getFechaDevolucion() {
        return fechaDevolucion;
    }

    /**
     * Establece una nueva fecha de devolución para el préstamo.
     *
     * @param fechaDevolucion Nueva fecha de devolución.
     */
    public void setFechaDevolucion(LocalDateTime fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    /**
     * Devuelve una representación en cadena del préstamo.
     *
     * @return Información detallada del préstamo y devolución en formato de texto.
     */
    public String toString() {
        return "Identificacion: " + identificacion + " ISBN: " + ISBN + " Fecha de Prestamo: " + fechaPrestamo
                + " Fecha de Devolucion: "
                + fechaDevolucion;

    }
}
