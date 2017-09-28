package com.cristhoper.paginasamarillasapp.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.ExpandedMenuView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Toast;

import com.cristhoper.paginasamarillasapp.R;
import com.cristhoper.paginasamarillasapp.adapters.RecyclerViewAdapter;
import com.cristhoper.paginasamarillasapp.models.Empresa;
import com.cristhoper.paginasamarillasapp.repositories.EmpresaRepository;

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

        //Obtiene la búsqueda
        String busqueda = this.getIntent().getExtras().getString("rubro");

        //Obtiene la lista de empresas
        EmpresaRepository empRepo = EmpresaRepository.getInstance();
        List<Empresa> empresas = empRepo.getEmpresas();

        //Se coloca el adaptador en el RecyclerView
        adaptadorEmpresa = new RecyclerViewAdapter(filtroEmpresas(empresas, busqueda));

        recyclerViewEmpresa.setAdapter(adaptadorEmpresa);
    }

    public List<Empresa> filtroEmpresas(List<Empresa> emp, String rubro){
        List<Empresa> filtroEmpresas = new ArrayList<>();

        for (Empresa empresa : emp){
            if (empresa.getRubro().equals(rubro)){
                filtroEmpresas.add(empresa);
            }
        }
        return filtroEmpresas;
    }
}
