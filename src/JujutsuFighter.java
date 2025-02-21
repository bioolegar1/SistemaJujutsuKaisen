public interface JujutsuFighter {

    String getName();
    String getNivel();
    int getLifePoints();
    boolean estaVivo();
    void receberDano(int dano);
}
