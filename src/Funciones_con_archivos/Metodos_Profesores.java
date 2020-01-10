package Funciones_con_archivos;

import static Clases.ArrayLists.Archivos;
import Clases.Profesor;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Metodos_Profesores extends Metodos_Abstractos{
    public static void escribeTXT(ArrayList<Profesor> Profesores)
    {
        try
        {
            PrintWriter escritura = new PrintWriter(Archivos.get(2)); // REVISA EL FILE 2 = PROFESORES
            for(int i = 0 ; i < Profesores.size() ; i++)
            {
                escritura.print(Profesores.get(i).getId() + " , ");
                escritura.print(Profesores.get(i).nombre + " , ");
                escritura.print(Profesores.get(i).a_paterno + " , ");
                escritura.print(Profesores.get(i).a_materno + " , ");
                escritura.print(Profesores.get(i).edad + " , ");
                escritura.print(Profesores.get(i).credenciales.user + " , ");
                escritura.print(Profesores.get(i).credenciales.password + " , ");
                escritura.print(Profesores.get(i).Privilegios_Administrativos + "\n");
            }
            escritura.close();
            System.out.println("ARCHIVO " + Archivos.get(1) + " INICIADO CORRECTAMENTE");
        }
        catch(FileNotFoundException ex)
        {
            ex.printStackTrace(System.out);
        }           
    }    
    
}
