package com.marxam.buck;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdaptadorMangaRv extends RecyclerView.Adapter<AdaptadorMangaRv.ViewHolder> {

    private ArrayList<Manga> ListaManga;

    public AdaptadorMangaRv(ArrayList<Manga> listaManga) {
        this.ListaManga = listaManga;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ImagenManga;
        TextView NombreManga, DescripcionManga;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ImagenManga = itemView.findViewById(R.id.ivMangaImg);
            NombreManga = itemView.findViewById(R.id.tvMangaNombre);
            //DescripcionManga = itemView.findViewById(R.id.tvMangaDescripcion);
        }
    }

    @Override
    public AdaptadorMangaRv.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.manga_item_rv, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorMangaRv.ViewHolder holder, int position) {
        Manga manga = ListaManga.get(position);
        holder.NombreManga.setText(manga.getNombre());
        //holder.DescripcionManga.setText(manga.getDescripcion());
        holder.ImagenManga.setImageResource(manga.getImagenManga());
    }

    @Override
    public int getItemCount() {
        return ListaManga.size();
    }
}
