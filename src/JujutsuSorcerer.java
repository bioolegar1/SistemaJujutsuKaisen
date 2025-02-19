abstract class JujutsuSorcerer  implements JujutsuFighter{

    protected String name;
    protected String nivel;
    protected String ataqueEspecial;

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

    public void showInfo() {
        System.out.println("Eu sou  " + name + ", um feiticeiro de nível:   " + nivel + " !!!");
        System.out.println(" Esse é meu Ataque especial: " + ataqueEspecial + "\uD83D\uDD25\uD83D\uDD25 \n");

    }
}
