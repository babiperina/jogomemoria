package controller;

import model.Grupo;
import model.Imagem;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static utils.Constants.GRUPOS;

/**
 * Created by alunom35 on 16/10/2018.
 */
public class GrupoController {

    private List<Grupo> grupos = new ArrayList<Grupo>();

    private Grupo grupoSorteado = null;
    private List<Imagem> imagensSorteadas = new ArrayList<Imagem>();

    public GrupoController() { }

    public GrupoController(List<Grupo> grupos) {
        this.grupos = grupos;
    }


    public List<Grupo> getGrupos() {
        return this.grupos;
    }

    public Grupo getGrupoSorteado() {
        return this.grupoSorteado;
    }

    public List<Imagem> getImagensSorteadas() {
        return this.imagensSorteadas;
    }

    public void sortearImagens() {
        List<Imagem> imagens = new ArrayList<Imagem>();
        List<Imagem> copiaGrupoSorteado = this.getGrupoSorteado().getImagens();

        int numeroSorteado;

        Random generator = new Random();

        do{
            numeroSorteado = generator.nextInt(copiaGrupoSorteado.size());
            imagens.add(copiaGrupoSorteado.get(numeroSorteado));
            copiaGrupoSorteado.remove(numeroSorteado);
        } while(imagens.size()<6);

        this.imagensSorteadas = imagens;
    }

    public void sortearGrupo() { this.grupoSorteado = this.grupos.get(new Random().nextInt(this.grupos.size())); }

    public void inicializarGrupos(){
        this.grupos = GRUPOS();
    }
}
