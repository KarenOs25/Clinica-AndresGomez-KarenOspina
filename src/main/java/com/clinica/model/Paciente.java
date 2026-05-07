//package src.com.clinica.model;
package src.main.java.com.clinica.model;

public class Paciente extends Persona {
    private Genero genero;
    private ContactoEmergencia contacto;
    private SeguroMedico seguro;

    public Paciente(String cedula, String nombre, String correo, String tel, 
                    String fechaNac, String dir, Genero genero, 
                    ContactoEmergencia contacto, SeguroMedico seguro) {
        // Enviamos los datos comunes a la clase Persona
        super(cedula, nombre, correo, tel, fechaNac, dir);
        this.genero = genero;
        this.contacto = contacto;
        this.seguro = seguro;
    }

    @Override
    public String obtenerPermisos() {
        return "ACCESO_SOLO_CONSULTA_PROPIA"; 
    }
}