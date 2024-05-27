package com.edinson.basededatos.model;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.edinson.basededatos.Pais;

public class ManangerBd {
    BdHelper bdHelper; // Declaro la clase donde esta la conexion de la base de datos
    SQLiteDatabase bd; //declaro variable de tipo SQlite database para los metodos de la bd
    public ManangerBd (Context context){
        bdHelper = new BdHelper(context); // llamo a la conexion de la base de datos

    }
    //MEtodo que abre mi base de datos en modo escritura
    public void  openBdWr(){
        bd= bdHelper.getWritableDatabase();
        }
    //MEtodo que abre mi base de datos en modo lectura
        public void openBdRd(){
            bd = bdHelper.getReadableDatabase();
        }

    //METODO INSERTAR DATOS
        public long insertDatos(String cod, String nombre){
            openBdWr();// paso 1 abro al bd en mode escritura
            ContentValues values = new ContentValues();
            values.put("cod",cod);// paso 2 lleno el contenedor
            values.put("nombre", nombre);
            long resul = bd.insert("Pais", null,values);

            //en la variable resul se almacena el resultado de la iserción
            //-1 si no inserta, o un valor mayor de cero si inserta en la bd
            return resul;
        }

        public long insertarDatos2(){
            openBdWr();
            ContentValues values = new ContentValues();
            values.put("cod","1");
            values.put("nombre","Edinson");
            values.put("apellido","campo");
            values.put("edad","18");
            values.put("correo", "example@.com");
            values.put("telefono","3144022619");
            long result= bd.insert("Datos",null,values);

            return result;
        }
    }

