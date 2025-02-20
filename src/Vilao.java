import java.util.Random;

public abstract class Vilao  implements JujutsuFighter{

    protected  String nome;
    protected String nivel;
    protected int lifePoints = 100;
    protected Ataque[] ataques = new Ataque[4];

    public Vilao(String nome, String nivel, Ataque[] ataques) {
        this.nome = nome;
        this.nivel = nivel;
        this.ataques = ataques;
    }

    @Override
    public String getName() {
        return nome;
    }

    @Override
    public String getNivel() {
        return nivel;
    }

    @Override
    public int getLifePoints() {
        return lifePoints;
    }

    @Override
    public boolean estaVivo() {
        return lifePoints > 0;
    }

    public Ataque[] getAtaques() {
        return ataques;
    }

    @Override
    public void receberDano(int dano) {
        lifePoints -= dano;
        if (lifePoints < 0) lifePoints = 0; {
            System.out.println(nome + " agora tem " + lifePoints + " pontos de vida ! \n");
        }

    }
}
