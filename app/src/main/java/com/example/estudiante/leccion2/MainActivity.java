package com.example.estudiante.leccion2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText txtNombre;
    private Button btnIngrese;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNombre=(EditText)findViewById(R.id.txtNombre);
        btnIngrese=(Button)findViewById(R.id.btnIngrese);

        btnIngrese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, botonEntrada.class);
                i.putExtra("nombre", txtNombre.getText().toString());
                startActivity(i);
                finish();

            }
        });
    }
}
