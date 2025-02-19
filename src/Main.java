public class Main {
    public static void main(String[] args) {
        System.out.println("\uD83D\uDD25 Feiticeiros Jujutsu e Seus níveis \uD83D\uDD25 \n");


        JujutsuSorcerer[] feiticeiros = {
                new GojouSatoru(),
                new GetoSuguru(),
                new NanamiKento(),
                new MakiZenin(),
                new NobaraKugisaki(),
                new MegumiFushiguro(),
                new YujiItadori()
        };

        for (JujutsuSorcerer feiticeiro : feiticeiros) {
            feiticeiro.showInfo();
        }

        JujutsuSorcerer gojo = new GojouSatoru();
        System.out.println(" \n \n Temos então !!!!");
        System.out.println("\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25");
        System.out.println(" O Feiticeiro Mais Forte: " + gojo.getName() + " - " + gojo.getNivel() + "e esse é meu ataque especial: " + gojo.getAtaqueEspecial());
        System.out.println("\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25");


    }
}