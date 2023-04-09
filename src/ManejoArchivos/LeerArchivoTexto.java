package ManejoArchivos;

import Clases.RegistroComputadoras;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class LeerArchivoTexto {
    private Scanner entrada;


    public void abrirArchivo() {
        try {
            entrada = new Scanner(new File("Computadoras.txt"));
        }  
        catch (FileNotFoundException ﬁleNotFoundException) {
            System.err.println("Error al abrir el archivo.");
            System.exit(1);
        } 
    }  

    public ArrayList<RegistroComputadoras> leerRegistros() {  
        ArrayList<RegistroComputadoras> registros = new ArrayList<RegistroComputadoras>();
        try
        {
            while (entrada.hasNext()) {
                RegistroComputadoras compu = new RegistroComputadoras();
                compu.establecerNumero(entrada.nextInt());
                compu.establecerMarca(entrada.next());
                compu.establecerModelo(entrada.next());
                compu.establecerCosto(entrada.nextDouble());
                compu.establecerStock(entrada.nextInt());
                registros.add(compu);
            }  
        } 
        catch (NoSuchElementException elementException) {
            System.err.println("El archivo no esta bien formado.");
            entrada.close();
            System.exit(1);
        }   
        catch (IllegalStateException stateException) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        } 
        return registros;
    }  

    public void cerrarArchivo() {
        if (entrada != null) {
            entrada.close(); 
        }
    } 
}
