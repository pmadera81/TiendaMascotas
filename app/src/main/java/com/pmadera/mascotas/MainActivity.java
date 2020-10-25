package com.pmadera.mascotas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;
    private FloatingActionButton btnTopFive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);

        listaMascotas = (RecyclerView) findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm);


        CargoMascotas();

        CargoAdaptador();



       btnTopFive=(FloatingActionButton)findViewById(R.id.btnTopFive);

        btnTopFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, ActivityFavoritos.class);

                startActivity(intent);
            }
        });

    }



    private void CargoMascotas() {


            mascotas = new ArrayList<>();

            mascotas.add(new Mascota("Bimba", "Labrador", 2010, "Amarillo", R.drawable.bimba));
            mascotas.add(new Mascota("Chico", "Beagle", 2010, "Blanco", R.drawable.chico));
            mascotas.add(new Mascota("Chiqui", "Golden Retriever", 2010, "Amarillo", R.drawable.chiqui));
            mascotas.add(new Mascota("Coco", "Dálmata", 2010, "Amarillo", R.drawable.coco));
            mascotas.add(new Mascota("Luna", "Boxer", 2010, "Amarillo", R.drawable.luna));
            mascotas.add(new Mascota("Mico", "Cocker Spaniel", 2010, "Amarillo", R.drawable.mico));
            mascotas.add(new Mascota("Nico", "Schnauzer", 2010, "Amarillo", R.drawable.nico));
            mascotas.add(new Mascota("Rocky", "Chihuahua", 2010, "Amarillo", R.drawable.rocky));
            mascotas.add(new Mascota("Simba", "Pug", 2010, "Amarillo", R.drawable.simba));
            mascotas.add(new Mascota("Toby", "Border Collie", 2010, "Amarillo", R.drawable.toby));


    }

    private void CargoAdaptador() {
        MascotaAdaptador oAdaptador=new MascotaAdaptador(mascotas,this);
        listaMascotas.setAdapter(oAdaptador);
    }




}