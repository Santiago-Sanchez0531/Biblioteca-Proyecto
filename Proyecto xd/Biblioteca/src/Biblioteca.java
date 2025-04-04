import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa la Biblioteca.
 * Permite la gestión de libros, usuarios, préstamos y devoluciones.
 */
public class Biblioteca {
    private List<PrestamosYDevoluciones> prestamos = new ArrayList<PrestamosYDevoluciones>();
    private List<Usuario> usuarios = new ArrayList<Usuario>();
    private List<Libro> libros = new ArrayList<>(List.of(

            new Libro("Libro 1", "Autor 1", "2020", 1, 20),
            new Libro("Libro 2", "Autor 2", "2021", 2, 15),
            new Libro("Libro 3", "Autor 3", "2022", 3, 16)

    ));

    /**
     * Registra un nuevo libro en la biblioteca.
     *
     * @param titulo         Título del libro.
     * @param autor          Autor del libro.
     * @param añoPublicacion Año de publicación del libro.
     * @param ISBN           Código ISBN del libro.
     * @param disponibles    Cantidad de copias disponibles.
     */

    public void registrarLibros(String titulo, String autor, String añoPublicacion, int ISBN, int disponibles) {

        libros.add(new Libro(titulo, autor, añoPublicacion, ISBN, disponibles));

    }

    /**
     * Muestra todos los libros registrados en la biblioteca.
     */
    public void mostrarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros registrados.");
        } else {
            System.out.println("Lista de libros:");
            for (Libro libro : libros) {
                System.out.println(libro);
            }
        }

    }

    /**
     * Busca un libro por su ISBN.
     *
     * @param ISBN Código ISBN del libro a buscar.
     * @return Información del libro si se encuentra, de lo contrario, un mensaje de
     *         error.
     */
    public String buscarLibro(int ISBN) {

        for (int i = 0; i < libros.size(); i++) {
            if (ISBN == (libros.get(i).getISBN())) {
                return "Titulo: " + libros.get(i).getTitulo() +
                        " Autor: " + libros.get(i).getAutor() + " Año de publicacion: "
                        + libros.get(i).getAñoPublicacion() + " ISBN: " + libros.get(i).getISBN()
                        + " Libros disponibles : " + libros.get(i).getDisponibles();

            }
        }
        return "Libro no encontrado";

    }

    /**
     * Elimina un libro de la biblioteca por su ISBN.
     *
     * @param ISBN Código ISBN del libro a eliminar.
     * @return Mensaje indicando si el libro fue eliminado o no encontrado.
     */
    public String eliminarLibro(int ISBN) {

        for (int i = 0; i < libros.size(); i++) {
            if (ISBN == (libros.get(i).getISBN())) {
                Libro libroEliminado = libros.remove(i);
                return "Libro " + libroEliminado.getTitulo() + " Ha sido eliminado";

            }

        }
        return "Libro no encontrado";
    }

    /**
     * Actualiza un dato específico de un libro en la biblioteca.
     *
     * @param datoACambiar Tipo de dato a cambiar (1: Título, 2: Autor, 3: Año de
     *                     publicación, 4: ISBN, 5: Disponibles).
     * @param ISBN         Código ISBN del libro a actualizar.
     * @param dato         Nuevo valor para el campo seleccionado.
     */
    public void actualizarInfo(int datoACambiar, int ISBN, String dato) {
        for (int i = 0; i < libros.size(); i++) {
            if (ISBN == (libros.get(i).getISBN())) {
                switch (datoACambiar) {
                    case 1:
                        libros.get(i).setTitulo(dato);
                        break;
                    case 2:
                        libros.get(i).setAutor(dato);
                        break;
                    case 3:
                        libros.get(i).setAñoPublicacion(dato);
                        break;
                    case 4:
                        int intISBN = Integer.parseInt(dato);
                        libros.get(i).setISBN(intISBN);
                        break;
                    case 5:
                        int intDisponibles = Integer.parseInt(dato);
                        libros.get(i).setDisponibles(intDisponibles);
                        break;
                    case 6:
                        System.out.println("Adieu");
                        break;

                    default:
                        break;
                }
            }
        }
    }

    /**
     * Actualiza la información completa de un libro en la biblioteca.
     *
     * @param ISBN           Código ISBN actual del libro.
     * @param titulo         Nuevo título del libro.
     * @param autor          Nuevo autor del libro.
     * @param añoPublicacion Nuevo año de publicación del libro.
     * @param nuevoISBN      Nuevo código ISBN del libro.
     * @param disponibles    Nueva cantidad de copias disponibles.
     */
    public void actualizarInfoLibro(int ISBN, String titulo, String autor, String añoPublicacion,
            int nuevoISBN, int disponibles) {
        for (int i = 0; i < libros.size(); i++) {
            if (ISBN == (libros.get(i).getISBN())) {
                libros.get(i).setTitulo(titulo);
                libros.get(i).setAutor(autor);
                libros.get(i).setAñoPublicacion(añoPublicacion);
                libros.get(i).setISBN(nuevoISBN);
                libros.get(i).setDisponibles(disponibles);
            }
        }
    }

    /**
     * Registra un nuevo usuario en la biblioteca.
     *
     * @param nombre         Nombre del usuario.
     * @param identificacion Identificación del usuario.
     * @param tipoUsuario    Tipo de usuario (1: Estudiante, 2: Profesor, 3:
     *                       Ciudadano).
     */
    public void registrarUsuario(String nombre, int identificacion, int tipoUsuario) {

        String stringTipoUsuario = verificarTipoUsuario(tipoUsuario);

        usuarios.add(new Usuario(nombre, identificacion, stringTipoUsuario));

    }

    /**
     * Muestra todos los usuarios registrados en la biblioteca.
     */
    public void mostrarUsuarios() {
        if (usuarios.isEmpty()) {
            System.out.println("No hay Usuarios registrados.");
        } else {
            System.out.println("Lista de Usuarios: ");
            for (Usuario usuario : usuarios) {
                System.out.println(usuario);
            }
        }

    }

    /**
     * Busca un usuario por su identificación.
     *
     * @param identificacion Identificación del usuario a buscar.
     * @return Información del usuario si se encuentra, de lo contrario, un mensaje
     *         de error.
     */
    public String buscarUsuario(int identificacion) {

        for (int i = 0; i < usuarios.size(); i++) {

            if (identificacion == (usuarios.get(i).getIdentificacion())) {
                return "Nombre: " + usuarios.get(i).getNombre() +
                        " Identificacion: " + usuarios.get(i).getIdentificacion() + " Tipo de usuario: "
                        + usuarios.get(i).getTipoUsuario();

            }
        }
        return "Usuario no encontrado";

    }

    /**
     * Elimina un usuario de la biblioteca por su identificación.
     *
     * @param identificacion Identificación del usuario a eliminar.
     * @return Mensaje indicando si el usuario fue eliminado o no encontrado.
     */
    public String eliminarUsuario(int identificacion) {

        for (int i = 0; i < usuarios.size(); i++) {
            if (identificacion == (usuarios.get(i).getIdentificacion())) {
                Usuario usuarioEliminado = usuarios.remove(i);
                return "Usuario: " + usuarioEliminado.getNombre() + " Ha sido eliminado";

            }

        }
        return "Usuario no encontrado";
    }

    /**
     * Actualiza el tipo de usuario en la biblioteca.
     *
     * @param identificacion Identificación del usuario a actualizar.
     * @param tipoUsuario    Nuevo tipo de usuario (1: Estudiante, 2: Profesor, 3:
     *                       Ciudadano).
     */
    public void actualizarInfoUsuario(int identificacion, int tipoUsuario) {
        for (int i = 0; i < usuarios.size(); i++) {
            if (identificacion == usuarios.get(i).getIdentificacion()) {
                String stringTipoUsuario = verificarTipoUsuario(tipoUsuario);
                usuarios.get(i).setTipoUsuario(stringTipoUsuario);
                System.out.println("Tipo de usuario actualizado");

            }

        }

    }

    /**
     * Verifica el tipo de usuario y lo convierte en su representación en cadena.
     *
     * @param tipoUsuario Código numérico del tipo de usuario (1: Estudiante, 2:
     *                    Profesor, 3: Ciudadano).
     * @return Nombre del tipo de usuario o mensaje de error si el código es
     *         incorrecto.
     */
    public String verificarTipoUsuario(int tipoUsuario) {

        String stringTipoUsuario;
        if (tipoUsuario == 1) {
            stringTipoUsuario = "Estudiante";

        } else if (tipoUsuario == 2) {
            stringTipoUsuario = "Profesor";

        } else if (tipoUsuario == 3) {
            stringTipoUsuario = "Ciudadano";

        } else {

            return "Tipo de dato erroneo";

        }
        return stringTipoUsuario;

    }

    /**
     * Solicita un préstamo de un libro para un usuario.
     *
     * @param identificacion Identificación del usuario que solicita el préstamo.
     * @param ISBN           ISBN del libro a prestar.
     * @param fechaPrestamo  Fecha en que se realiza el préstamo.
     * @return Mensaje indicando si el préstamo fue exitoso o si hubo un problema.
     */
    public String solicitarPrestamo(int identificacion, int ISBN, LocalDateTime fechaPrestamo) {
        for (int i = 0; i < usuarios.size(); i++) {
            if (identificacion == usuarios.get(i).getIdentificacion()) {

                for (int j = 0; j < libros.size(); j++) {
                    if (ISBN == libros.get(j).getISBN()) {
                        int disponibles = libros.get(j).getDisponibles();
                        if (disponibles > 0) {
                            prestamos.add(new PrestamosYDevoluciones(identificacion, ISBN, fechaPrestamo, null));
                            libros.get(j).setDisponibles(disponibles - 1);
                            return "Prestamo exitoso";
                        } else {
                            return "No hay ejemplares disponibles";
                        }
                    }
                }

                return "No se encontró el libro";
            }
        }
        return "No se encontró el usuario";
    }

    /**
     * Muestra todos los préstamos registrados en la biblioteca.
     */
    public void mostrarPrestamos() {
        if (prestamos.isEmpty()) {
            System.out.println("No hay Prestamos registrados.");
        } else {
            System.out.println("Lista de prestamos: ");
            for (PrestamosYDevoluciones prestamo : prestamos) {
                System.out.println(prestamo);
            }
        }

    }

    /**
     * Busca y muestra los libros que un usuario tiene prestados.
     *
     * @param identificacion Identificación del usuario.
     */
    public void buscarUsuarioPrestamos(int identificacion) {
        for (int i = 0; i < prestamos.size(); i++) {
            if (identificacion == prestamos.get(i).getIdentificacion()) {
                int llamarTitulo = prestamos.get(i).getISBN();
                LocalDateTime llamarFechaDevolucion = prestamos.get(i).getFechaDevolucion();
                for (int j = 0; j < libros.size(); j++) {
                    if (llamarTitulo == libros.get(j).getISBN() && llamarFechaDevolucion == null) {

                        System.out.println("Tienes estos libros: " + " Titulo: " + libros.get(j).getTitulo()
                                + " ISBN: " + prestamos.get(i).getISBN() + " Prestados en la fecha:"
                                + prestamos.get(i).getFechaPrestamo());

                    }

                }

            }

        }

    }

    /**
     * Registra la devolución de un libro y actualiza la disponibilidad en la
     * biblioteca.
     *
     * @param identificacion  Identificación del usuario que devuelve el libro.
     * @param ISBN            ISBN del libro a devolver.
     * @param fechaDevolucion Fecha en la que se realiza la devolución.
     * @return Mensaje indicando si la devolución fue exitosa o si hubo un error.
     */
    public String devolverLibro(int identificacion, int ISBN, LocalDateTime fechaDevolucion) {
        for (int i = 0; i < prestamos.size(); i++) {
            if (identificacion == prestamos.get(i).getIdentificacion()) {
                prestamos.get(i).setFechaDevolucion(fechaDevolucion);
                for (int j = 0; j < libros.size(); j++) {
                    if (ISBN == libros.get(j).getISBN()) {
                        int disponibles = libros.get(j).getDisponibles();
                        disponibles = disponibles + 1;
                        libros.get(j).setDisponibles(disponibles);
                        return "Devolucion exitosa";
                    }

                }
                return "No se encontro libro";
            }

        }
        return "Usuario no encontrado";

    }

    /**
     * Busca un libro por su título y devuelve su información.
     *
     * @param titulo Título del libro a buscar.
     * @return Información del libro si se encuentra, o un mensaje indicando que no
     *         fue encontrado.
     */
    public String buscarPorTitulo(String titulo) {

        for (int i = 0; i < libros.size(); i++) {

            if (titulo.equals(libros.get(i).getTitulo())) {
                return "Titulo: " + libros.get(i).getTitulo() + " Autor: " + libros.get(i).getAutor() +
                        " Disponibles: " + libros.get(i).getDisponibles();

            }
        }
        return "Titulo no encontrado";

    }

    /**
     * Busca libros por autor y muestra los títulos disponibles.
     *
     * @param autor Nombre del autor cuyos libros se desean buscar.
     */
    public void buscarPorAutor(String autor) {

        for (int i = 0; i < libros.size(); i++) {

            if (autor.equals(libros.get(i).getAutor())) {
                System.out.println(" Libro: " + libros.get(i).getTitulo() +
                        " Disponibles: " + libros.get(i).getDisponibles());

            }
        }

    }

}
