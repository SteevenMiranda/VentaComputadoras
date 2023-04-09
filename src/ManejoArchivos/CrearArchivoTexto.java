package ManejoArchivos;

import Clases.RegistroComputadoras;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;

public class CrearArchivoTexto {
        private Formatter salida;

    public void abrirArchivo() {
        try {
            salida = new Formatter("Computadoras.txt");
        }  
        catch (SecurityException securityException) {
            System.err.println("No tiene acceso de escritura a este archivo.");
            System.exit(1);
        }     
        catch (FileNotFoundException ﬁlesNotFoundException) {
            System.err.println("Error al crear el archivo.");
            System.exit(1);
        } 
    } 

    public String agregarRegistros(int numero, String marca, String modelo, double costo, int stock) {   
        RegistroComputadoras compu = new RegistroComputadoras();
        String mensaje = "";

        try   
        {
            compu.establecerNumero(numero);
            compu.establecerMarca(marca);
            compu.establecerModelo(modelo);
            compu.establecerCosto(costo);
            compu.establecerStock(stock);
    
            if (compu.obtenerNumero() > 0) {
                               
                salida.format("%d %s %s %.2f %d\n", compu.obtenerNumero(), 
                        compu.obtenerMarca(), compu.obtenerModelo(), 
                        compu.obtenerCosto(), compu.obtenerStock());
                mensaje = "Registro agregado";
            }           
            else {
                mensaje = "El numero de cuenta debe ser mayor que 0.";
            }  
        } 
        catch (FormatterClosedException formatterClosedException) {
            mensaje = "Error al escribir en el archivo.";

        }  
        catch (NoSuchElementException elementException) {
            mensaje = "Entrada invalida. Intente de nuevo.";

        }    
        return mensaje;
    } 

    public void cerrarArchivo() {
        if (salida != null) {
            salida.close();
        }
    } 
}
