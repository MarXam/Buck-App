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
            EditText Contraseña = findViewById(R.id.etLoginContraseña);
            Button btnLoginXml = findViewById(R.id.btLogIn);

            btnLoginXml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email = Email.getText().toString().trim();
                String password = Contraseña.getText().toString().trim();

                    if (email.equals("usuario@gmail.com") && password.equals("123456")) {
                        Intent intent = new Intent(LoginActivity.this, CatalogoActivity.class);
                        startActivity(intent);
                        finish();
                    } else {
                        Toast.makeText(LoginActivity.this, "Email o contraseña incorrectos", Toast.LENGTH_SHORT).show();
                    }
            }
        });
    }
}