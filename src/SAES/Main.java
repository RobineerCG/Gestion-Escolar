
package SAES;
import Clases.Administrador;
import Clases.Alumno;
import Clases.Profesor;
import static Funciones_con_archivos.Manejo_ArchivosTXT.*; // IMPORTA METODOS PARA ARCHIVOS DE TEXTO
import static Clases.ArrayLists.*;

public class Main { 
    public static void main(String[] args) {      
        //ATRIBUTOS 
            //Objetos
        Alumno plantilla_alumno = new Alumno();
        Administrador plantilla_administrador = new Administrador();
        Profesor plantilla_profesor = new Profesor();
            // VARIABLES
        int i;
            // DECLARACION DE USUARIOS PREDETERMINADOS
        plantilla_alumno.create("1", "Mike", "Gutierrez", "Villalpando", 19, "mike99", "password",false);
        alumnos.add(plantilla_alumno);
        plantilla_administrador.create("1", "Roberto", "Cordova", "Galvan", 21,"cogar98", "password", true);
        administradores.add(plantilla_administrador);
        plantilla_profesor.create("1", "Ernesto", "Filio", "Lopez", 70 , "Filio", "password",false);
        profesores.add(plantilla_profesor);
            // ARCHIVOS TXT
        IniciaTXT("Administradores"); // recupera toda la info del archivo Administradores en ArrayLists
        IniciaTXT("Alumnos");
        IniciaTXT("Profesores");
        /* for(i = 0 ; i < administradores.size() ; i++)
        System.out.println(administradores.get(i).getId() + administradores.get(i).nombre + " " + administradores.get(i).a_paterno + administradores.get(i).a_materno
        + administradores.get(i).edad + administradores.get(i).credenciales.user + administradores.get(i).credenciales.password +
        administradores.get(i).Privilegios_Administrativos);*/
        // LAS VENTANAS EMPIEZAN AQUI
        Inicio_Sesion Frame = new Inicio_Sesion();
        Frame.setVisible(true);
        
    }
    
}
