package mx.com.gm.peliculas.negocio;

/**
 *
 * @author NORVEY
 */
public interface CatalogoPeliculas {
    
    String NOMBRE_RECURSO="Peliculas.txt";
    
    void agregarPelicula(String nombrePelicula);
    
    void listarPeliculas();
    
    void buscarPelicula(String buscar);
    
    void inicarCatalogoPeliculas();
}
