
package SAES;

public class Alumno extends Persona {
    // ATRIBUTOS
    private String Id; // Id es PRIVADO
    // METODOS
    public String getId() {
        String id;
        id = this.Id;
        return id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }
}