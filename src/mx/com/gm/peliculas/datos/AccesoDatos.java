package mx.com.gm.peliculas.datos;

import java.util.ArrayList;
import java.util.List;
import mx.com.gm.peliculas.domain.Pelicula;

/**
 *
 * @author NORVEY
 */
public interface AccesoDatos {

    public static boolean existe(String nombreArchivo){
        return true;
    }
    
    public static List<Pelicula> listar(String nombre){
        return new ArrayList();
    }
    
    public static void escribir(Pelicula pelicula, String nombreArchivo,boolean anexar){
            
    }
    
    public static String buscar(String nombreArchivo, String buscar){
        return "hola";
    }
    
    public static void crear(String nombreArchivo){
        
    }
    
    public static void borrar(String nombreArchivo){
        
    }
    
}
