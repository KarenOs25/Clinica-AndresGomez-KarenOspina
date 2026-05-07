package src.main.java.com.clinica.config;

import src.main.java.com.mongodb.client.MongoClient;
import src.main.java.com.mongodb.client.MongoClients;
import src.main.java.com.mongodb.client.MongoDatabase;

public class ConexionMongoDB {
    private static final String URI = "mongodb://localhost:27017";
    private static MongoClient mongoClient = null;

    public static MongoDatabase getBaseDatos() {
        if (mongoClient == null) {
            mongoClient = MongoClients.create(URI);
        }
        return mongoClient.getDatabase("clinica_nosql"); // Nombre de la BD en Mongo
    }
}