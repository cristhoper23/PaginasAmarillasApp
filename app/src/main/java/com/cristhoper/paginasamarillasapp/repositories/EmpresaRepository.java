package com.cristhoper.paginasamarillasapp.repositories;

import com.cristhoper.paginasamarillasapp.R;
import com.cristhoper.paginasamarillasapp.models.Empresa;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Cris on 28/09/2017.
 */

public class EmpresaRepository {
    private static EmpresaRepository _INSTANCE = null;

    private EmpresaRepository(){}

    public static EmpresaRepository getInstance(){
        if (_INSTANCE == null)
            _INSTANCE = new EmpresaRepository();
        return _INSTANCE;
    }

    private List<Empresa> empresas = new ArrayList<>();

    public List<Empresa> getEmpresas() {
        empresas.add(new Empresa(1,"Restaurante","El Real Sabor","Mz.I Lt 1 Gr Sc.2 Villa el Salvador - Lima - Lima",
                "(01) 288 0524", "realsabor@gmail.com", "www.elrealsabor.com", R.drawable.img_real_sabor, "El mejor pollo está aquí"));

        empresas.add(new Empresa(2,"Restaurante","Puerto de Chala","Mz.L Lt 27 Villa Alejandro 1º Etapa - Lurin, Lurín",
                "(01) 293 3868", "puertodechala@gmail.com", "www.puertodechala.com", R.drawable.bg_puerto_chala, "Cevichería & Restaurante"));

        empresas.add(new Empresa(3,"Banco","Banco de la Nación","Av. Revolución s/n, Plz. Solidaridad Sc.2 Gr 15 Mz CC - Villa El Salvador, Lima",
                "(01) 2879546", "bancodenacion@gmail.com", "www.bancodelanacion.com", R.drawable.bg_banco_nacion, "El banco más lento del mundo"));

        empresas.add(new Empresa(4,"Banco","Interbank","Juan Velasco Alvarado 2, Villa EL Salvador 15816 - Lima",
                "(01) 3119000", "interbank@banca.pe", "www.interbank.pe", R.drawable.bg_interbank, "El tiempo vale más que el dinero"));

        empresas.add(new Empresa(5,"Hotel","Marriot","Malecón de la Reserva 615, Cercado de Lima 15074 - Lima",
                "(01) 2177000", "jkmarriot@hotel.com", "http://www.espanol.marriott.com", R.drawable.bg_marriot, "Disfrute de unas maravillosas vistas al mar desde nuestro hotel en Miraflores"));

        empresas.add(new Empresa(6,"Hotel","Sheraton","Calle Alcanfores 290, Miraflores 15074 - Lima",
                "(01) 2061100", "sheraton@hotel.com", "http://www.fourpointsmiraflores.com", R.drawable.bg_sheraton, "Bienvenido al nuevo Four Points by Sheraton Miraflores que presenta 134 habitaciones confortables, incluidas 15 suites Classic y 2 suites con terraza. Hasta el respirar es fácil junto a nosotros."));

        return empresas;
    }
}
