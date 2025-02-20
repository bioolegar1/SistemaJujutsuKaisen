import java.util.Random;

abstract class JujutsuSorcerer  implements JujutsuFighter{

    protected String name;
    protected String nivel;
    protected String ataqueEspecial;
    protected int lifePoints = 30;

    public JujutsuSorcerer(String name, String nivel, String ataqueEspecial) {
        this.name = name;
        this.nivel = nivel;
        this.ataqueEspecial = ataqueEspecial;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getNivel() {
        return nivel;
    }

    public String getAtaqueEspecial() {
        return ataqueEspecial;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public boolean estaVivo() {
        return lifePoints > 0;
    }

    public void atacar(JujutsuFighter adversario) {
        Random rand = new Random();
        int dano = rand.nextInt(20) + 10;
        adversario.receberDano(dano);
        System.out.println(name + " usou " + ataqueEspecial + " e causou " + dano + " de dano em " + adversario.getName());
    }

    public void receberDano(int dano) {
        lifePoints -= dano;
        if (lifePoints< 0) lifePoints = 0;
        System.out.println(name + " Agora tem " +  lifePoints + " de vida. \n");
    }

    public void showInfo() {
        System.out.println("\n\uD83C\uDF00" + name + " - Nivel: " +  nivel);
        System.out.println("Ataque especial: " + ataqueEspecial);
        System.out.println("Life points: " + lifePoints);

    }
}
