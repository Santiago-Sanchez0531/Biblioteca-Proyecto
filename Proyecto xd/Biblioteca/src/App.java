import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
/**
 * Clase principal que gestiona la Biblioteca Municipal de Sogamoso.
 * @author David Santiago Gil Sánchez
 * Permite la gestión de libros, usuarios, préstamos y devoluciones.
 */
public class App {
    /**
     * Método principal que ejecuta el sistema de la biblioteca.
     */
    public static void main(String[] args) throws Exception {
        Biblioteca biblioteca = new Biblioteca();
        Scanner sc = new Scanner(System.in);
        int datoACambiar;
        int nuevoISBN2;
        String nuevoISBN;
        String titulo;
        String autor;
        String añoPublicacion;
        int ISBN;
        int disponibles;
        String nuevoDisponibles;
        int identificacion;
        int tipoUsuario;
        int seleccionSecundaria;

        while (true) {
            // Menú principal
            System.out.println("""
                    Bienvenidos a la Biblioteca Municipal de Sogamoso.
                    Elige que quieres hacer:
                    1. Gestion de Libros.
                    2. Gestion de Usuarios.
                    3. Gestion de Prestamos.
                    4. Devoluciones.
                    5. Consultas.
                    6. Salir.
                    """);
            int opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    // Submenú de gestión de libros
                    System.out.println("""
                            Que quieres hacer?
                            1. Registrar libros.
                            2. Mostrar libros.
                            3. Buscar libro.
                            4. Eliminar libro.
                            5. Modificar libro.
                            6. Regresar
                            """);
                    seleccionSecundaria = sc.nextInt();
                    sc.nextLine();
                    switch (seleccionSecundaria) {
                        // Registrar un libro
                        case 1:
                            System.out.println("Ingresa el titulo del libro");
                            titulo = sc.nextLine();
                            System.out.println("Ingresa el autor del libro");
                            autor = sc.nextLine();
                            System.out.println("Ingresa el año de publicacion del libro");
                            añoPublicacion = sc.nextLine();
                            System.out.println("Ingresa el ISBN del libro");
                            ISBN = sc.nextInt();
                            System.out.println("Ingresa la cantidad de libros disponibles");
                            disponibles = sc.nextInt();
                            biblioteca.registrarLibros(titulo, autor, añoPublicacion, ISBN, disponibles);
                            System.out.println("Libro registrado correctamente");
                            break;
                        case 2:
                            // Mostrar todos los libros registrados
                            biblioteca.mostrarLibros();
                            break;
                        case 3:
                            // Buscar un libro por ISBN
                            System.out.println("Ingresa el ISBN del libro");
                            ISBN = sc.nextInt();
                            System.out.println(biblioteca.buscarLibro(ISBN));

                            break;
                        case 4:
                            // Eliminar un libro por ISBN
                            System.out.println("Ingresa el ISBN del libro a eliminar");
                            ISBN = sc.nextInt();
                            System.out.println(biblioteca.eliminarLibro(ISBN));

                            break;
                        case 5:
                            // Modificar información de un libro dato a dato, o Todos los Datos.
                            System.out.println("Ingresa el ISBN del libro");
                            ISBN = sc.nextInt();
                            sc.nextLine();
                            System.out.println(biblioteca.buscarLibro(ISBN));
                            if (!biblioteca.buscarLibro(ISBN).equals("Libro no encontrado")) {
                                System.out.println("""
                                        Que quieres cambiar?
                                        1. Titulo.
                                        2. Autor.
                                        3. Año de Publicación.
                                        4. ISBN.
                                        5. Cantidad de Libros Disponibles.
                                        6. Todos los datos del libro.
                                        """);
                                datoACambiar = sc.nextInt();
                                sc.nextLine();
                                switch (datoACambiar) {
                                    case 1:
                                        System.out.println("Ingresa el titulo a cambiar");
                                        titulo = sc.nextLine();
                                        biblioteca.actualizarInfo(1, ISBN, titulo);
                                        break;
                                    case 2:
                                        System.out.println("Ingresa el autor del libro a cambiar");
                                        autor = sc.nextLine();
                                        biblioteca.actualizarInfo(2, ISBN, autor);
                                        break;
                                    case 3:
                                        System.out.println("Ingresa el año de publicacion del libro a cambiar");
                                        añoPublicacion = sc.nextLine();
                                        biblioteca.actualizarInfo(3, ISBN, añoPublicacion);
                                        break;
                                    case 4:
                                        System.out.println("Ingresa el ISBN del libro a cambiar");
                                        nuevoISBN = sc.nextLine();
                                        biblioteca.actualizarInfo(4, ISBN, nuevoISBN);
                                        break;
                                    case 5:
                                        System.out.println("Ingresa la cantidad de libros disponibles a cambiar");
                                        nuevoDisponibles = sc.nextLine();
                                        biblioteca.actualizarInfo(5, ISBN, nuevoDisponibles);
                                        break;
                                    case 6:
                                        System.out.println("Ingresa el titulo a cambiar");
                                        titulo = sc.nextLine();
                                        System.out.println("Ingresa el autor del libro a cambiar");
                                        autor = sc.nextLine();
                                        System.out.println("Ingresa el año de publicacion del libro a cambiar");
                                        añoPublicacion = sc.nextLine();
                                        System.out.println("Ingresa el ISBN del libro a cambiar");
                                        nuevoISBN2 = sc.nextInt();
                                        System.out.println("Ingresa la cantidad de libros disponibles a cambiar");
                                        disponibles = sc.nextInt();
                                        biblioteca.actualizarInfoLibro(ISBN, titulo, autor, añoPublicacion, nuevoISBN2,
                                                disponibles);
                                        break;

                                    default:
                                        break;
                                }

                            }
                            break;
                        case 6:
                            // Regresar al menú principal
                            System.out.println("Regresaste exitosamente");
                            break;
                        default:
                            System.out.println("Opcion invalida. Regresaste correctamente");
                            break;

                    }

                    break;

                case 2:
                    // Submenú de gestión de Usuarios
                    System.out.println("""
                            Que quieres hacer?
                            1. Registrar Usuario.
                            2. Buscar Usuario.
                            3. Borrar Usuario.
                            4. Actualizar tipo de Usuario.
                            5. Mostrar Usuarios.
                            6. Regresar.
                            """);
                    seleccionSecundaria = sc.nextInt();
                    sc.nextLine();
                    switch (seleccionSecundaria) {
                        case 1:
                            // Registrar un Usuario
                            System.out.println("Ingresa el nombre del usuario");
                            String nombre = sc.nextLine();
                            System.out.println("Ingresa el identificacion del usuario");
                            identificacion = sc.nextInt();
                            System.out.println("""
                                    Escoge el tipo de usuario
                                    1. Estudiante.
                                    2. Profesor.
                                    3. Ciudadano.
                                    """);
                            tipoUsuario = sc.nextInt();
                            while (tipoUsuario < 1 || tipoUsuario > 3) {
                                System.out.println("""
                                        Error de selección.
                                        Escoge el tipo de usuario:
                                        1. Estudiante.
                                        2. Profesor.
                                        3. Ciudadano.
                                        """);
                                tipoUsuario = sc.nextInt();

                            }

                            biblioteca.registrarUsuario(nombre, identificacion, tipoUsuario);

                            break;
                        case 2:
                            // Buscar un usuario por Identificación
                            System.out.println("Ingresa la identificacion del usuario");
                            identificacion = sc.nextInt();
                            System.out.println(biblioteca.buscarUsuario(identificacion));

                            break;

                        case 3:
                            //Eliminar un usuario por identificación
                            System.out.println("Ingresa la identificacion del usuario a eliminar");
                            identificacion = sc.nextInt();
                            System.out.println(biblioteca.eliminarUsuario(identificacion));

                            break;
                        case 4:
                            //Actualizar el tipo de usuario por Identificación
                            System.out.println("Ingresa la identificacion del Usuario");
                            identificacion = sc.nextInt();
                            System.out.println("""
                                    Coloca el tipo de usuario a actualizar:
                                    1. Estudiante.
                                    2. Profesor.
                                    3. Ciudadano.
                                    """);
                            tipoUsuario = sc.nextInt();
                            while (tipoUsuario < 1 || tipoUsuario > 3) {
                                System.out.println("""
                                        Error de Selección.
                                        Coloca el tipo de usuario a actualizar:
                                        1. Estudiante.
                                        2. Profesor.
                                        3. Ciudadano.
                                        """);
                                tipoUsuario = sc.nextInt();

                            }
                            biblioteca.actualizarInfoUsuario(identificacion, tipoUsuario);
                            break;
                        case 5:
                            //Mostrar tlos usuarios Registrados
                            biblioteca.mostrarUsuarios();
                            break;
                        case 6:
                            //Regresar al Menu principal
                            System.out.println("Regresaste exitosamente");
                            break;
                        default:
                            System.out.println("Opcion invalida. Regresaste correctamente");
                            break;
                    }
                    break;

                case 3:
                //Submenu de Gestion de Prestamos
                    System.out.println("""
                            1. Solicitar prestamo.
                            2. Mostrar prestamos.
                            3. Regresar.
                            """);
                    seleccionSecundaria = sc.nextInt();
                    sc.nextLine();
                    switch (seleccionSecundaria) {
                        case 1:
                            // Solicitar un prestamo de un libro
                            System.out.println("Ingresa la identificacion del usuario");
                            identificacion = sc.nextInt();
                            if (!biblioteca.buscarUsuario(identificacion).equals("Usuario no encontrado")) {
                                System.out.println("Ingresa el ISBN del libro");
                                ISBN = sc.nextInt();
                                sc.nextLine();
                                System.out.println(
                                        "Ingresa la fecha de Prestamo del Libro dd/MM/yyyy HH:mm, Ejemplo: 30/03/2025 15:45 ");
                                String fechaTexto = sc.nextLine();

                                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

                                LocalDateTime fechaPrestamo = LocalDateTime.parse(fechaTexto, formatter);
                                System.out.println(biblioteca.solicitarPrestamo(identificacion, ISBN, fechaPrestamo));

                            } else {
                                System.out.println("No se encontro usuario");
                            }

                            break;
                        case 2:
                            // Mostrar todos los Prestamos 
                            biblioteca.mostrarPrestamos();

                            break;
                        case 3:
                            // Regresar al Menu Principal
                            System.out.println("Regresaste exitosamente");
                            break;

                        default:
                            System.out.println("Opcion invalida. Regresaste correctamente");
                            break;
                    }

                    break;
                case 4:
                    // Solicitar un Libro a Devolver.
                    System.out.println("Ingresa la identificacion del usuario");
                    identificacion = sc.nextInt();
                    biblioteca.buscarUsuarioPrestamos(identificacion);
                    System.out.println("Ingresa el ISBN del libro a devolver");
                    ISBN = sc.nextInt();
                    sc.nextLine();
                    System.out.println(
                            "Ingresa la fecha de Devolucion del libro dd/MM/yyyy HH:mm, Ejemplo: 30/03/2025 15:45 ");
                    String fechaTexto = sc.nextLine();

                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

                    LocalDateTime fechaDevolucion = LocalDateTime.parse(fechaTexto, formatter);
                    System.out.println(biblioteca.devolverLibro(identificacion, ISBN, fechaDevolucion));

                    break;
                case 5:
                    // Submenu de busqueda de Libro
                    System.out.println("""
                            Quieres buscar un Libro por su titulo o autor?
                            1. Buscar libro por Autor.
                            2. Buscar libro por Titulo.
                            3. Regresar.
                            """);
                    seleccionSecundaria = sc.nextInt();
                    sc.nextLine();
                    switch (seleccionSecundaria) {
                        case 1:
                            // Buscar un libro por Su autor.
                            System.out.println("Ingresa el Autor");
                            autor = sc.nextLine();
                            biblioteca.buscarPorAutor(autor);
                            break;
                        case 2:
                            // Buscar un Libro por el titulo 
                            System.out.println("Ingresa el titulo");
                            titulo = sc.nextLine();
                            System.out.println(biblioteca.buscarPorTitulo(titulo));
                            break;

                        case 3:
                        // Regresar al menu principal
                            System.out.println("Regresaste exitosamente");
                            break;

                        default:
                            System.out.println("Opcion invalida. Regresaste correctamente");
                            break;
                    }

                    break;

                case 6:
                    //Salir del Programa.
                    System.out.println("Saliste exitosamente.");
                    return;
                default:
                    System.out.println("Opcion no valida, Saliste exitosamente.");
                    return;

            }
        }
    }
}
