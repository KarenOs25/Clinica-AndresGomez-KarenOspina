package com.clinica.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionMySQL {
    private static final String URL = "jdbc:mysql://localhost:3306/clinica_db";
    private static final String USER = "root"; // Tu usuario de MySQL
    private static final String PASSWORD = "tu_contraseña"; // Tu contraseña de MySQL

    public static Connection getConexion() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.err.println("Error al conectar a MySQL: " + e.getMessage());
            return null;
        }
    }
}