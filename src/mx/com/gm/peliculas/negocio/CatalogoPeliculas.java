package mx.com.gm.peliculas.negocio;

/**
 *
 * @author NORVEY
 */
public interface CatalogoPeliculas {
    
    String NOMBRE_RECURSO="Peliculas.txt";
    
    void agregarPelicula(String nombrePelicula);
    
    void listarPeliculas(String nombreArchivo);
    
    void buscarPelicula(String nombreArchivo, String buscar);
    
    void inicarArchivo(String nombreArchivo);
}
