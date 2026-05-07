package src.com.clinica.model;
package src.main.java.com.clinica.model;

public abstract class Usuario {
    protected String cedula; // Único en el sistema
    protected String nombreCompleto;
    protected String correo;
    protected String telefono;
    protected String fechaNacimiento;
    protected String direccion;
    protected Rol rol; // Atributo tipo enum
    protected String nombreUsuario; // Máximo 15 caracteres
    protected String contrasenia; // Validar seguridad

    public Usuario(String cedula, String nombreCompleto, String correo, String telefono, 
                   String fechaNacimiento, String direccion, Rol rol, 
                   String nombreUsuario, String contrasenia) {
        this.cedula = cedula;
        this.nombreCompleto = nombreCompleto;
        this.correo = correo;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.rol = rol;
        this.nombreUsuario = nombreUsuario;
        this.contrasenia = contrasenia;
    }

    // Método abstracto que cada rol debe implementar
    public abstract String obtenerPermisos();

    // Getters y Setters básicos
    public String getCedula() { return cedula; }
    public String getNombreCompleto() { return nombreCompleto; }
    public Rol getRol() { return rol; }
}