package com.clinica.model;

public class RecursosHumanos extends Usuario {

    public RecursosHumanos(String cedula, String nombreCompleto, String correo, String telefono, 
                           String fechaNacimiento, String direccion, String nombreUsuario, 
                           String contrasenia) {
        super(cedula, nombreCompleto, correo, telefono, fechaNacimiento, direccion, Rol.RECURSOS_HUMANOS, nombreUsuario, contrasenia);
    }

    @Override
    public String obtenerPermisos() {
        // RRHH no puede ver pacientes, medicamentos ni procedimientos
        return "ACCESO_GESTION_PERSONAL_SOLO"; 
    }
}