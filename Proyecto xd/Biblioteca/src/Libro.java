/**
 * Representa un libro en la biblioteca con información como título, autor,
 * año de publicación, ISBN y cantidad disponible.
 */
public class Libro {
    private String titulo;
    private String autor;
    private String añoPublicacion;
    private int ISBN;
    private int disponibles;

    /**
     * Constructor para inicializar un libro con sus datos.
     *
     * @param titulo         Título del libro.
     * @param autor          Autor del libro.
     * @param añoPublicacion Año de publicación del libro.
     * @param ISBN           Número ISBN del libro.
     * @param disponibles    Cantidad de ejemplares disponibles.
     */
    public Libro(String titulo, String autor, String añoPublicacion, int ISBN, int disponibles) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.ISBN = ISBN;
        this.disponibles = disponibles;
    }

    /**
     * Obtiene el título del libro.
     *
     * @return El título del libro.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Establece un nuevo título para el libro.
     *
     * @param titulo Nuevo título del libro.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Obtiene el autor del libro.
     *
     * @return El nombre del autor del libro.
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Establece un nuevo autor para el libro.
     *
     * @param autor Nuevo autor del libro.
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Obtiene el año de publicación del libro.
     *
     * @return Año de publicación del libro.
     */
    public String getAñoPublicacion() {
        return añoPublicacion;
    }

    /**
     * Establece un nuevo año de publicación para el libro.
     *
     * @param añoPublicacion Nuevo año de publicación.
     */
    public void setAñoPublicacion(String añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    /**
     * Obtiene el ISBN del libro.
     *
     * @return Número ISBN del libro.
     */
    public int getISBN() {
        return ISBN;
    }

    /**
     * Establece un nuevo ISBN para el libro.
     *
     * @param ISBN Nuevo número ISBN.
     */
    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    /**
     * Obtiene la cantidad de ejemplares disponibles del libro.
     *
     * @return Número de ejemplares disponibles.
     */
    public int getDisponibles() {
        return disponibles;
    }

    /**
     * Establece la cantidad de ejemplares disponibles del libro.
     *
     * @param disponibles Nueva cantidad de ejemplares disponibles.
     */
    public void setDisponibles(int disponibles) {
        this.disponibles = disponibles;
    }

    /**
     * Devuelve una representación en cadena del libro.
     *
     * @return Información detallada del libro en formato de texto.
     */
    public String toString() {
        return "Titulo: " + titulo + " Autor: " + autor + " Año de Publicacion " + añoPublicacion + " ISBN: " + ISBN +
                " Disponibilidad: " + disponibles;
    }

}
