package com.pmadera.mascotas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class ActivityFavoritos extends AppCompatActivity {

    private ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoritos);


        Toolbar miActionBar=(Toolbar)findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listaMascotas = (RecyclerView) findViewById(R.id.rvMascotasFavotitas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm);


        CargoMascotas();

        CargoAdaptador();



    }

    private void CargoMascotas() {

        mascotas = new ArrayList<>();

        mascotas.add(new Mascota("Chico", "Beagle", 2010, "Blanco", R.drawable.chico));
        mascotas.add(new Mascota("Coco", "Dálmata", 2010, "Amarillo", R.drawable.coco));
        mascotas.add(new Mascota("Mico", "Cocker Spaniel", 2010, "Amarillo", R.drawable.mico));
        mascotas.add(new Mascota("Nico", "Schnauzer", 2010, "Amarillo", R.drawable.nico));
        mascotas.add(new Mascota("Simba", "Pug", 2010, "Amarillo", R.drawable.simba));



    }

    private void CargoAdaptador() {


        MascotaAdaptadorFavoritos oAdaptador=new MascotaAdaptadorFavoritos(mascotas,this);
        listaMascotas.setAdapter(oAdaptador);
    }

}