package test.resources;

import controller.GrupoController;
import model.Grupo;
import model.Imagem;

import java.util.List;

public class TestResourceGrupoController extends GrupoController {

    public Integer getNumeroImagensSorteadas() { return this.getImagensSorteadas().size(); }

    public Integer getNumeroDeGrupos() { return this.getGrupos().size(); }

    public List<Grupo> getTodosOsGrupos() { return this.getGrupos(); }

    public String getNomesImagens() {
        String nomeImagens = "";

        for (Imagem imagem : this.getImagensSorteadas()) {

           nomeImagens += imagem.getNome();
        }

        return nomeImagens;
    }

    public Integer isTodasImagensDiferentes() {
        Integer contador = 0;

        for (Imagem imagem1: this.getImagensSorteadas()) {
            for (Imagem imagem2: this.getImagensSorteadas()) {
                if(imagem1.getNome().equals(imagem2.getNome())){
                    contador+=1;
                }
            }
        }

        return contador;
    }
}
