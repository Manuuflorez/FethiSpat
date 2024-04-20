package com.example.proyecto;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Perfil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);
    }

    public void inicio (View view){
        Intent intent = new Intent(view.getContext(), PaginaInicial.class);
        startActivity(intent);
    }

    public void salir (View view){
        Intent intent = new Intent(view.getContext(), MainActivity.class);
        startActivity(intent);
    }
}