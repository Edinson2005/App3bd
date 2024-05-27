package com.edinson.basededatos.controller;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.edinson.basededatos.Pais;
import com.edinson.basededatos.R;
import com.edinson.basededatos.model.BdHelper;
import com.edinson.basededatos.model.ManangerBd;

public class MainActivity extends AppCompatActivity {
    // DECLARA MI CLASE CONEXION
    ManangerBd manangerBd;
    SQLiteDatabase bd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //HAGO UN LLAMADO A MI CONEXION

        manangerBd = new ManangerBd(MainActivity.this);
        //insertar Datos Pais
///////////SE comentan por q no se utiliza en la main///////////
      //  long resul = manangerBd.insertDatos();
        //if(resul<0){
          //  Toast.makeText(this, "No inserto" + resul, Toast.LENGTH_SHORT).show();
        //}else {
          // Toast.makeText(this, "Datos insertados"+ resul, Toast.LENGTH_SHORT).show();
        //}

        //insertar Datos DAtos
        long result = manangerBd.insertarDatos2();
        if(result<0){
            Toast.makeText(this, "No inserto" + result, Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "Datos insertados"+ result, Toast.LENGTH_SHORT).show();
        }


        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goNext = new Intent(MainActivity.this, Pais.class);
                startActivity(goNext);

            }
        });


    }

}