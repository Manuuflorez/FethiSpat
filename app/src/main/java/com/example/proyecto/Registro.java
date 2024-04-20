package com.example.proyecto;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.activity.EdgeToEdge;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Registro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        Spinner genderSpinner = findViewById(R.id.genderSpinner);
        String[] generoArray = getResources().getStringArray(R.array.genero_array);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, generoArray);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        genderSpinner.setAdapter(adapter);
    }

    public void registrar (View view){
        Intent intent = new Intent(view.getContext(), PaginaInicial.class);
        startActivity(intent);
    }

    public void terminosCondiciones (View view){
        Intent intent = new Intent(view.getContext(), TerminosCondiciones.class);
        startActivity(intent);
    }

    public void inicio_sesion (View view){
        Intent intent = new Intent(view.getContext(), MainActivity.class);
        startActivity(intent);
    }
}