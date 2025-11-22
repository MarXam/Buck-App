package com.marxam.buck;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PerfilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        Button btnSeguidosXml = findViewById(R.id.btSeguidos);
        Button btnHistorialXml = findViewById(R.id.btHistorial);
        Button btnAjustesXml = findViewById(R.id.btAjustes);
        Button btnCerrarSesionXml = findViewById(R.id.btCerrarSesion);

        btnSeguidosXml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent iSuegidos = new Intent(PerfilActivity.this, SeguidosActivity.class);
                startActivity(iSuegidos);

            }
        });

        btnHistorialXml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent iHistorial = new Intent(PerfilActivity.this, HistorialActivity.class);
                startActivity(iHistorial);

            }
        });

        btnAjustesXml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent iAjustes = new Intent(PerfilActivity.this, AjustesActivity.class);
                startActivity(iAjustes);

            }
        });

        btnCerrarSesionXml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent iCerrarSesion = new Intent(PerfilActivity.this, LoginActivity.class);
                iCerrarSesion.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(iCerrarSesion);
                finish();

            }
        });

        BarraNavegacionHelper.setup(this, R.id.bmPerfil);
    }
}
