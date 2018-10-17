package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by alunom35 on 16/10/2018.
 */
public class Grupo {

    private int id;

    private String nome;

    private List<Imagem> imagens;

    public Grupo(int id, String nome, List<Imagem> imagens) {
        this.id = id;
        this.nome = nome;
        this.imagens = imagens;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Imagem> getImagens() {
        return imagens;
    }

    public void setImagens(List<Imagem> imagens) {
        this.imagens = imagens;
    }
}