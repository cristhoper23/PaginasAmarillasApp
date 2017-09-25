package com.cristhoper.paginasamarillasapp.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.ExpandedMenuView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.cristhoper.paginasamarillasapp.R;
import com.cristhoper.paginasamarillasapp.adapters.RecyclerViewAdapter;
import com.cristhoper.paginasamarillasapp.models.Empresa;

import java.util.ArrayList;
import java.util.List;

public class EmpresaActivity extends AppCompatActivity {

    private RecyclerView recyclerViewEmpresa;
    private RecyclerViewAdapter adaptadorEmpresa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empresa);

        recyclerViewEmpresa = (RecyclerView) findViewById(R.id.recyclerEmpresa);
        //Definimos la forma de la lista. En este caso vertical (similar a la de un listview)
        recyclerViewEmpresa.setLayoutManager(new LinearLayoutManager(this));

        adaptadorEmpresa = new RecyclerViewAdapter(obtenerEmpresas());
        recyclerViewEmpresa.setAdapter(adaptadorEmpresa);
    }

    public List<Empresa> obtenerEmpresas(){
        List<Empresa> empresas = new ArrayList<>();

        empresas.add(new Empresa(1,"Restaurante","El Real Sabor","Mz I Lt 1 Gr Sc.2 Villa el Salvador - Lima - Lima",
                                "01 288 0524", "realsabor@gmail.com", "www.elrealsabor.com", R.drawable.img_real_sabor, "El mejor pollo está aquí"));

        return empresas;
    }
}
