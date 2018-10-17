/**
 * Created by babiperina on 09/10/2018.
 */
public class Escore {

    private int pontuacao;

    private String nome;

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean verificarNovoEscore(int novaPontuacao){
        return novaPontuacao > pontuacao;
    }
}
