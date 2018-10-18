package utils;

import model.Grupo;

import java.util.ArrayList;

public class Constants {

    static public ArrayList<Grupo> GRUPOS() {
        ArrayList<Grupo> grupos =  new ArrayList<Grupo>();

        Grupo grupo1 = new Grupo();
        grupo1.setNome("Animais");
        grupo1.addImagem("cachorro");
        grupo1.addImagem("gato");
        grupo1.addImagem("elefante");
        grupo1.addImagem("gavião");
        grupo1.addImagem("leão");
        grupo1.addImagem("rato");

        Grupo grupo2 = new Grupo();
        grupo2.setNome("Times de Futebol");
        grupo2.addImagem("Fortaleza");
        grupo2.addImagem("Ceará");
        grupo2.addImagem("Flamengo");
        grupo2.addImagem("São Paulo");
        grupo2.addImagem("Cruzeiro");
        grupo2.addImagem("Ferroviário");

        grupos.add(grupo1);
        grupos.add(grupo2);

        return grupos;
    }

}
