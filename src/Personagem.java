import java.sql.SQLOutput;
import java.util.Random;

public class Personagem  implements JujutsuFighter{

        protected String name;
        protected String nivel;
        protected int lifePoints = 100;
        int armadura;
        protected Ataque[] ataques = new Ataque[4];

        public Personagem(String name, String nivel, int armadura ,Ataque[] ataques) {
            this.name = name;
            this.nivel = nivel;
            this.armadura = armadura;
            this.ataques = ataques;
        }

        @Override
        public String getName() {
            return name;
        }

        public String getNivel() {
            return nivel;
        }

        public int getLifePoints() {
            return lifePoints;
        }

        public boolean estaVivo() {
            return lifePoints > 0;
        }


        public Ataque[] getAtaques() {
            return ataques;
        }


        public void receberDano(int dano) {
            Random rand = new Random();
            int chanceDefesa = rand.nextInt(100);

            if (chanceDefesa < armadura) {
                System.out.println("Ataque Bloqueado!!" + name + "\n Eu estava preaprado para esse golpe !");
            return;
            }

            int danoReduzido = (int) (dano * (1 - (armadura / 100.0)));





            lifePoints -= danoReduzido;
            if (lifePoints< 0) lifePoints = 0;
            System.out.println(name + " Recebeu " + danoReduzido + "de dano após defesa parcial.");
            System.out.println(name + "Agora tem: \n" + lifePoints + " PONTOS DE VIDA!");

        }

}
