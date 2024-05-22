package com.edinson.basededatos.model;

public class Constantes {
    // Nombre de la base de datos
    public static final String NOM_BD = "Prueba";
    public static final int VERSION_BD = 1;

    // Sentencia para crear la tabla CIUDAD
    public static final String SENTENCIATABLA = "CREATE TABLE Pais (cod TEXT, nombre TEXT)";

    // Sentencia para crear la tabla DATOS
    public static final String TABLA = "CREATE TABLE Datos (cod TEXT, nombre TEXT, apellido TEXT, edad TEXT, correo TEXT, telefono TEXT)";
}
