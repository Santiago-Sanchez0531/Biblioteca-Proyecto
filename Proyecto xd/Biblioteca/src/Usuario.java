/**
 * Representa un usuario en el sistema de la biblioteca.
 * Cada usuario tiene un nombre, una identificación única y un tipo de usuario.
 */
public class Usuario {
    private String nombre;
    private int identificacion;
    private String tipoUsuario;

    /**
     * Constructor para inicializar un usuario con sus datos.
     *
     * @param nombre         Nombre del usuario.
     * @param identificacion Número de identificación del usuario.
     * @param tipoUsuario    Tipo de usuario (Estudiante, Profesor, Ciudadano,
     *                       etc.).
     */
    public Usuario(String nombre, int identificacion, String tipoUsuario) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.tipoUsuario = tipoUsuario;
    }

    /**
     * Obtiene el nombre del usuario.
     *
     * @return Nombre del usuario.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece un nuevo nombre para el usuario.
     *
     * @param nombre Nuevo nombre del usuario.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la identificación del usuario.
     *
     * @return Identificación del usuario.
     */
    public int getIdentificacion() {
        return identificacion;
    }

    /**
     * Establece una nueva identificación para el usuario.
     *
     * @param identificacion Nueva identificación del usuario.
     */
    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    /**
     * Obtiene el tipo de usuario.
     *
     * @return Tipo de usuario (Estudiante, Profesor, Ciudadano, etc.).
     */
    public String getTipoUsuario() {
        return tipoUsuario;
    }

    /**
     * Establece un nuevo tipo de usuario.
     *
     * @param tipoUsuario Nuevo tipo de usuario.
     */
    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    /**
     * Devuelve una representación en cadena del usuario.
     *
     * @return Información del usuario en formato de texto.
     */
    public String toString() {
        return "Nombre: " + nombre + " Identificacion: " + identificacion + " Tipo de Usuario  " + tipoUsuario;
    }

}
