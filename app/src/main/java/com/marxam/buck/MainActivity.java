package com.marxam.buck;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import androidx.recyclerview.widget.GridLayoutManager;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("NotifyDataSetChanged")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Vincular RecyclerView
        RecyclerView vistaManga = findViewById(R.id.rvVistaManga);
        vistaManga.setLayoutManager(new GridLayoutManager(this, 2));

        ArrayList<Manga> listaManga = new ArrayList<>();
        listaManga.add(new Manga("Berserk", "Un oscuro relato de venganza, poder y destino.", R.drawable.berserk_));
        listaManga.add(new Manga("Caballeros del Zodiaco", "Guerreros sagrados que luchan por la diosa Atenea usando su cosmos.", R.drawable.caballeros_del_zodiaco));
        listaManga.add(new Manga("Dandadan", "Una historia que mezcla acción sobrenatural y comedia juvenil.", R.drawable.dandadan));
        listaManga.add(new Manga("Dr. Stone", "La humanidad petrificada debe renacer gracias al poder de la ciencia.", R.drawable.dr_stone));
        listaManga.add(new Manga("Jujutsu Kaisen", "Un estudiante se convierte en recipiente de una maldición para proteger a los demás.", R.drawable.jujutsu_kaisen));
        listaManga.add(new Manga("Kimetsu no Yaiba", "Un joven cazador de demonios busca vengar a su familia y curar a su hermana.", R.drawable.kimetsu_no_yaiba));
        listaManga.add(new Manga("Kusuriya no Hitorigoto", "Una joven farmacéutica resuelve misterios en la corte imperial china.", R.drawable.kusuriya_no_hitorigoto));
        listaManga.add(new Manga("My Hero Academia", "En un mundo de héroes y villanos, un joven sin poderes busca convertirse en el mejor héroe.", R.drawable.my_hero_academia));
        listaManga.add(new Manga("Nana", "Dos chicas con el mismo nombre comparten sueños, amores y desilusiones en Tokio.", R.drawable.nana));
        listaManga.add(new Manga("One Piece", "Luffy y su tripulación buscan el tesoro más grande del mundo: el One Piece.", R.drawable.one_piece));
        listaManga.add(new Manga("One Punch Man", "Un héroe que derrota a cualquier enemigo de un solo golpe busca un verdadero desafío.", R.drawable.one_punch_man));
        listaManga.add(new Manga("Rurouni Kenshin", "Un exasesino errante busca redención en la era Meiji de Japón.", R.drawable.ruroni_kenshin));
        listaManga.add(new Manga("Tokyo Ghoul", "Un joven mitad humano mitad ghoul lucha por encontrar su lugar entre dos mundos.", R.drawable.tokyo_ghoul));
        listaManga.add(new Manga("Yu-Gi-Oh", "Cartas, duelo y la historia de un joven que descubre un antiguo juego con poderes misteriosos.", R.drawable.yu_hi_oh));

        AdaptadorMangaRv adaptadorMangaRv = new AdaptadorMangaRv(listaManga);
        vistaManga.setAdapter(adaptadorMangaRv);

        BarraNavegacionHelper.setup(this, R.id.bmHome);

    }
}
