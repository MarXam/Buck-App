package com.marxam.buck;

import android.os.Bundle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class PerfilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        String usuario = getIntent().getStringExtra("usuario");
        TextView tvUsuario = findViewById(R.id.usuario);
        if (usuario != null) {
            tvUsuario.setText("Usuario: " + usuario);
        } else {
            tvUsuario.setText("Usuario: Invitado");
            Button btnSeguidos = findViewById(R.id.seguidos);
            Button btnHistorial = findViewById(R.id.historial);
            Button btnAjustes = findViewById(R.id.ajustes);
            Button btnCerrarSesion = findViewById(R.id.cerrarseccion);

            btnSeguidos.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent iSeguidos = new Intent(PerfilActivity.this, seguidosactivity.class);
                    startActivity(iSeguidos);
                }
            });

            btnHistorial.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent iHistorial = new Intent(PerfilActivity.this, historialactivity.class);
                    startActivity(iHistorial);
                }
            });

            btnAjustes.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent iAjustes = new Intent(PerfilActivity.this, ajustesactivity.class);
                    startActivity(iAjustes);
                }
            });
            btnCerrarSesion.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(PerfilActivity.this, "Sesión cerrada", Toast.LENGTH_SHORT).show();
                    Intent iLoginActivity = new Intent(PerfilActivity.this, LoginActivity.class);
                    iLoginActivity.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(iLoginActivity);
                    finish();
                }
            });

            BarraNavegacionHelper.setup(this, R.id.bmPerfil);

        }
    }}

