package com.marxam.buck;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import androidx.recyclerview.widget.GridLayoutManager;

public class MainActivity extends AppCompatActivity {

    private RecyclerView VistaManga;
    private AdaptadorMangaRv adaptadorMangaRv;
    private ArrayList<Manga> ListaManga;

    @SuppressLint("NotifyDataSetChanged")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Vincular RecyclerView
        VistaManga = findViewById(R.id.rvVistaManga);
        VistaManga.setLayoutManager(new GridLayoutManager(this, 2));

        // Crear y llenar lista
        ListaManga = new ArrayList<>();
        ListaManga.add(new Manga("Naruto ooooooooooooooo", "Hola", R.drawable.logo_buck));
        ListaManga.add(new Manga("One Piece", "Piratas buscando el One Piece", R.drawable.logo_buck));
        ListaManga.add(new Manga("Attack on Titan", "Humanos luchando contra titanes", R.drawable.logo_buck));

        // Configurar adaptador
        adaptadorMangaRv = new AdaptadorMangaRv(ListaManga);
        VistaManga.setAdapter(adaptadorMangaRv);

        BarraNavegacionHelper.setup(this, R.id.bmHome);

    }
}
