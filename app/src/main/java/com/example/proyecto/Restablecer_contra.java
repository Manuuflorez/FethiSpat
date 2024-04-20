package com.example.proyecto;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Restablecer_contra extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restablecer_contra);
    }

    public void restablecer (View view){
    }

    public void registro (View view){
        Intent intent = new Intent(view.getContext(), Registro.class);
        startActivity(intent);
    }

    public void inicio_sesion (View view){
        Intent intent = new Intent(view.getContext(), MainActivity.class);
        startActivity(intent);
    }
}