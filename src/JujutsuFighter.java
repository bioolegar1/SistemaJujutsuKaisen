public interface JujutsuFighter {

    String getName();
    String getNivel();
    String getAtaqueEspecial();
    void atacar(JujutsuFighter adversario);
    int getLifePoints();
    boolean estaVivo();
    void receberDano(int dano);
}
