package com.edinson.basededatos;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.edinson.basededatos.model.ManangerBd;

public class Pais extends AppCompatActivity {
    Button datos ,guardar;
    ManangerBd manangerBd;
    EditText codi,nombres;
    String cod, nombre;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pais);

        guardar = findViewById(R.id.guarda);
        codi = findViewById(R.id.cod);
        nombres = findViewById(R.id.nombre);

        manangerBd = new ManangerBd(Pais.this);

        guardar .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cod = codi.getText().toString();
                nombre = nombres.getText().toString();
                long resul = manangerBd.insertDatos(cod,nombre);
                if(resul<0){
                    Toast.makeText(Pais.this, "No inserto" + resul, Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(Pais. this, "Datos insertados"+ resul, Toast.LENGTH_SHORT).show();
                }


            }
        });


        ///BOTON DE DATOS
        datos = findViewById(R.id.datos);
        datos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goNext = new Intent( Pais.this, Datos.class);
                startActivity(goNext);
            }
        });
    }
}