package com.edinson.basededatos.controller;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.edinson.basededatos.model.BdHelper;

public class MainActivity extends AppCompatActivity {
    // DECLARA MI CLASE CONEXION
    BdHelper bdHelper;
    SQLiteDatabase bd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //HAGO UN LLAMADO A MI CONEXION
        bdHelper = new BdHelper(MainActivity.this);
        bd = bdHelper.getWritableDatabase();//ABRO BASE DE DATOS EN MODO ESCRITURA

        Toast.makeText(this, "Base de datos creada Satisfactoriamente", Toast.LENGTH_SHORT).show();


    }

}