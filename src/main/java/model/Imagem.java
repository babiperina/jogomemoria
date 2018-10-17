package model;

/**
 * Created by alunom35 on 16/10/2018.
 */
public class Imagem {

    private String nome;

    private String caminho;

    public Imagem(String nome, String caminho) {
        this.nome = nome;
        this.caminho = caminho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCaminho() {
        return caminho;
    }

    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }
}
