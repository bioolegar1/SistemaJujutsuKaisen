public class Item {

    private String nome;
    private int efeito;

    public Item(String nome, int efeito) {
        this.nome = nome;
        this.efeito = efeito;
    }

    public void usar (Personagem personagem) {
        personagem.recuperarVida(efeito);
        System.out.println("Curou!" + personagem.getName() + " usou " + " e recuperou " + efeito + " de vida!");
    }



}
