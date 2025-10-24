package com.marxam.buck;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class ajustesactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajustes);

        ImageView imagenajustes = findViewById(R.id.imagenajustes);

        imagenajustes.setOnClickListener(v ->
                Toast.makeText(this, "Felicidades encontraste... Nada", Toast.LENGTH_SHORT).show()
        );
    }
}
