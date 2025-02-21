public class Personagem  implements JujutsuFighter{

        protected String name;
        protected String nivel;
        protected int lifePoints = 100;
        protected Ataque[] ataques = new Ataque[4];

        public Personagem(String name, String nivel, Ataque[] ataques) {
            this.name = name;
            this.nivel = nivel;
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
            lifePoints -= dano;
            if (lifePoints< 0) lifePoints = 0;
            System.out.println(name + " Agora tem " +  lifePoints + " de vida. \n");
        }
}
