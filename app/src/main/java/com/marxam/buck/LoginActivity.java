package com.marxam.buck;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acivity_login);

            EditText Email = findViewById(R.id.etLoginEmail);
            EditText Contrasena = findViewById(R.id.etLoginContraseña);
            Button btnLoginXml = findViewById(R.id.btLogIn);

            btnLoginXml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email = Email.getText().toString().trim();
                String contrasena = Contrasena.getText().toString().trim();

                    if (contrasena.isEmpty() && email.isEmpty()){
                        Toast.makeText(LoginActivity.this, "Debes ingresar un usuario y contraseña", Toast.LENGTH_SHORT).show();
                        return;
                    }

                    if (email.isEmpty()){
                        Toast.makeText(LoginActivity.this, "Debes ingresar un usuario", Toast.LENGTH_SHORT).show();
                        return;
                    }

                    if (contrasena.isEmpty()){
                        Toast.makeText(LoginActivity.this, "Debes ingresar uns contraseña", Toast.LENGTH_SHORT).show();
                        return;
                    }

                    if (email.equals("a") && contrasena.equals("1")) {
                        Toast.makeText(LoginActivity.this, "Bienvenido", Toast.LENGTH_SHORT).show();

                        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                        intent.putExtra("usuario", email);
                        startActivity(intent);

                        finish();
                    } else {
                        Toast.makeText(LoginActivity.this, "Email o contraseña incorrectos", Toast.LENGTH_SHORT).show();return;
                    }
                }
        }   );
    }
}