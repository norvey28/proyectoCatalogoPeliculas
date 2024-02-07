package cpjlaboratoriofinal;

import java.util.Scanner;
import mx.com.gm.peliculas.negocio.CatalogoPeliculas;

/**
 *
 * @author NORVEY
 */
public class CPJLaboratorioFinal {
    
    Scanner scanner = new Scanner(System.in);
    int opcion;
    String nombreArchivo;
    CatalogoPeliculas catalogoPeliculas;
    
    public void main(String[] args) {
        do{
            System.out.println("Elige una opcion:");
            System.out.println("1.- Iniciar catalogo peliculas");
            System.out.println("2.- Agregar pelicula");
            System.out.println("3.- Listar Peliculas");
            System.out.println("4.- Buscar Pelicula");
            System.out.println("0.- Salir");
            try{
                opcion = scanner.nextInt();
            }catch(Exception ex){
                ex.printStackTrace(System.out);
                System.out.println("Seleccione un valor numerico por favor");
            }
            
            switch (opcion) {
                case 1:
                    
                    break;
                default:
                    throw new AssertionError();
            }
        }while(opcion!=0);
        
    }
    
}
