package mx.com.gm.peliculas.negocio;

import java.util.logging.Level;
import java.util.logging.Logger;
import mx.com.gm.peliculas.datos.AccesoDatos;
import mx.com.gm.peliculas.datos.AccesoDatosImpl;
import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.AccesoDatosEx;

/**
 *
 * @author NORVEY
 */
public class CatalogoPeliculasImpl implements CatalogoPeliculas {

    private final AccesoDatos datos;

    public CatalogoPeliculasImpl() {
        this.datos = new AccesoDatosImpl();
    }

    @Override
    public void agregarPelicula(String nombrePelicula) {
        Pelicula pelicula = new Pelicula(nombrePelicula);
        boolean anexar = false;
        try {
            anexar = datos.existe(NOMBRE_RECURSO);
            datos.escribir(pelicula, NOMBRE_RECURSO, anexar);

        } catch (AccesoDatosEx ex) {
            System.out.println("Error de acceso a Datos");
            ex.printStackTrace();
        }
    }

    @Override
    public void listarPeliculas(String nombreArchivo) {
    }

    @Override
    public void buscarPelicula(String nombreArchivo, String buscar) {
    }

    @Override
    public void inicarArchivo(String nombreArchivo) {
    }

}
