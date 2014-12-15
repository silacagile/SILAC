/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitarios;

import java.util.HashMap;

/**
 *
 * @author Jorge Aguirre
 */
public class Constantes {
    /** dbms soportados codificados */
    public static final int POSTGRESQL = 1;
    public static final int SQLITE = 2;

    /** formato de las fechas */
    public static final String DATEFORMAT = "dd/MM/yyyy";

    /** Postgres datos para la conexion */
    public static final String POSTGRESQL_DRIVER = "org.postgresql.Driver";
    public static final String POSTGRESQL_DBURL = 
            "jdbc:postgresql://localhost:5432/Silac";
    public static final String POSTGRESQL_USER = "postgres";
    public static final String POSTGRESQL_PASS = "postgres";

    /** SQLite datos para la conexion */
    public static final String SQLITE_DRIVER = "org.sqlite.JDBC";
    public static final String SQLITE_DBURL = "jdbc:sqlite:silac.db";
    
    public static HashMap<String, String> atributos = new HashMap<String, String>();
    
           
}
