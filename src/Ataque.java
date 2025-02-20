public class Ataque {

    private String nome;
    private int dano;
    private long tempoUltimoUso;

    public Ataque(String nome, int dano) {
        this.nome = nome;
        this.dano = dano;
        this.tempoUltimoUso = 0;
    }


    public String getNome() {
        return nome;
    }

    public int getDano() {
        return dano;
    }

    public boolean podeUsar(){
        return (System.currentTimeMillis() - tempoUltimoUso) >= 3000;
    }

    public void user() {
        tempoUltimoUso = System.currentTimeMillis();
    }


    public void usar() {

    }
}
