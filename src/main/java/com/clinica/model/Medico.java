package src.main.java.com.clinica.model;

public class Medico extends Usuario {
    private String especialidad;

    public Medico(String cedula, String nombreCompleto, String correo, String telefono, 
                  String fechaNacimiento, String direccion, String nombreUsuario, 
                  String contrasenia, String especialidad) {
        // Envia los datos al constructor del padre (Usuario)
        super(cedula, nombreCompleto, correo, telefono, fechaNacimiento, direccion, Rol.MEDICO, nombreUsuario, contrasenia);
        this.especialidad = especialidad;
    }

    @Override
    public String obtenerPermisos() {
        return "ACCESO_TOTAL_HISTORIAL_CLINICA"; // Los médicos tienen acceso total
    }

    public String getEspecialidad() { return especialidad; }
}