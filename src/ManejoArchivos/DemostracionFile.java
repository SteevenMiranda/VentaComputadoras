package ManejoArchivos;

import java.io.File;

public class DemostracionFile {

    public String analizarRuta(String ruta) {
         
        File nombre = new File(ruta);
        String datos;
        if (nombre.exists()) 
        { 
            datos = nombre.getName() + " existe \n"
                    + (nombre.isFile() ? "es un archivo\n" : "no es un archivo\n")
                    + (nombre.isDirectory() ? "es un directorio\n"
                    : "no es un directorio\n")
                    + (nombre.isAbsolute() ? "es ruta absoluta\n"
                    : "no es ruta absoluta\n")
                    + "Ultima modiﬁcacion: " + nombre.lastModified()
                    + "Tamanio: " + nombre.length()
                    + "Ruta: " + nombre.getPath()
                    + "Ruta absoluta: " + nombre.getAbsolutePath()
                    + "Padre: " + nombre.getParent();

            if (nombre.isDirectory())
            {
                String directorio[] = nombre.list();
                datos += "\n\nContenido del directorio:\n";
                for (String nombreDirectorio : directorio) {
                    datos += "\n" + nombreDirectorio;
                }
            }
        } 
        else 
        {
            datos = ruta + " no existe.";
        }  
        return datos;
    }
}
