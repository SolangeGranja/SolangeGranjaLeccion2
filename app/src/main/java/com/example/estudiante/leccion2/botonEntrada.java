package com.example.estudiante.leccion2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class botonEntrada extends AppCompatActivity {

    private TextView txtEmpieza;
    private Button btnJuego;
    private String nombre="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boton_entrada);
        txtEmpieza=(TextView)findViewById(R.id.txtEmpieza);
        btnJuego=(Button)findViewById(R.id.btnjugar);



        nombre = getIntent().getStringExtra("nombre");

        txtEmpieza.setText("Empieza a Jugar " + nombre.toString());


        btnJuego.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(botonEntrada.this, juego.class);
                i.putExtra("nombre", nombre.toString());
                startActivity(i);

            }
        });
    }


    }





