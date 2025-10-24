package com.marxam.buck;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.marxam.buck.R;

public class seguidosactivity extends AppCompatActivity {
    private ImageView imageView1, imageView2, imageView3, imageView4, imageView5, imageView6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seguidos);

        Button botonVolver = findViewById(R.id.btnVolverSeguidos);
        botonVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
        imageView4 = findViewById(R.id.imageView4);
        imageView5 = findViewById(R.id.imageView5);
        imageView6 = findViewById(R.id.imageView6);


        imageView1.setImageResource(R.drawable.caballeros_del_zodiaco);
        imageView2.setImageResource(R.drawable.dandadan);
        imageView3.setImageResource(R.drawable.dr_stone);
        imageView4.setImageResource(R.drawable.jujutsu_kaisen);
        imageView5.setImageResource(R.drawable.kimetsu_no_yaiba);
        imageView6.setImageResource(R.drawable.my_hero_academia);
    }
}
   