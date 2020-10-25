package com.pmadera.mascotas;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MascotaAdaptadorFavoritos extends RecyclerView.Adapter<MascotaAdaptadorFavoritos.MascotaViewHolder>{
    private ArrayList<Mascota> mascotas;
    private Activity activity;

    public MascotaAdaptadorFavoritos(ArrayList<Mascota> mascotas, Activity activity) {
        this.mascotas = mascotas;
        this.activity = activity;
    }

    @NonNull
    @Override
    public MascotaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_favoritos,parent,false);


        return new MascotaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull final MascotaViewHolder mascotaViewHolderholder, int position) {
        final Mascota oMascota=mascotas.get(position);

        mascotaViewHolderholder.imgFotoFavoritos.setImageResource(oMascota.getFoto());
        mascotaViewHolderholder.tvNombreMascotaCVFavoritos.setText(oMascota.getNombre());


    }

    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    public static class MascotaViewHolder extends RecyclerView.ViewHolder{
        private ImageView imgFotoFavoritos;
        private ImageButton btnRaitearCVFavoritos;
        private TextView tvNombreMascotaCVFavoritos;
        private TextView tvCantidadRaitingCVFavoritos;
        private ImageButton btnCantRaitingCVFavoritos;


        public MascotaViewHolder(@NonNull View itemView) {
            super(itemView);

            imgFotoFavoritos=(ImageView)itemView.findViewById(R.id.imgFotoFavoritos);
            btnRaitearCVFavoritos=(ImageButton)itemView.findViewById(R.id.btnRaitearCVFavoritos);
            tvNombreMascotaCVFavoritos=(TextView)itemView.findViewById(R.id.tvNombreMascotaCVFavoritos);
            tvCantidadRaitingCVFavoritos=(TextView)itemView.findViewById(R.id.tvCantidadRaitingCVFavoritos);
            btnCantRaitingCVFavoritos=(ImageButton)itemView.findViewById(R.id.btnCantRaitingCVFavoritos);



        }


    }

}
