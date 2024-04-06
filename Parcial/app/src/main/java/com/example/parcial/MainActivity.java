package com.example.parcial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText Nombre;

    private EditText Apellido;

    private EditText Cedula;

    private EditText Edad;

    private Button Indus;

    private Button Teleco;

    private Button Software;

    private Button Hotel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Nombre = findViewById(R.id.Nombre);
        Apellido = findViewById(R.id.Apellido);
        Cedula = findViewById(R.id.Cedula);
        Edad = findViewById(R.id.Edad);
        Indus = findViewById(R.id.Indus);
        Teleco = findViewById(R.id.Teleco);
        Software = findViewById(R.id.Software);
        Hotel = findViewById(R.id.Hotel);

        Indus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            }
        });

        Teleco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            }
        });

        Software.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            }
        });

        Hotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            }
        });
    }


}