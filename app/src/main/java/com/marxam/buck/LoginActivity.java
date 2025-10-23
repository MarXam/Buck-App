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
        public class LoginActivity extends AppCompatActivity {
            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_login);
                EditText etEmail = findViewById(R.id.etLoginEmail);
                EditText etPassword = findViewById(R.id.etLoginContraseña);
                Button btnLogin = findViewById(R.id.btLogIn);
                btnLogin.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String email = etEmail.getText().toString().trim();
                        String password = etPassword.getText().toString().trim();
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
    }
}