import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        JujutsuSorcerer[] feiticeiros = {
                new MakiZenin(),
                new YujiItadori(),
                new MegumiFushiguro(),
                new YuttaOkkotsu(),
                new NobaraKugisaki()
        };
        Vilao[] viloes = {
                new Mahito(),
                new Sukuna()
        };


        System.out.println("Escolha o Seu Feiticeiro Jujutsu!");
        for (int i = 0; i < feiticeiros.length; i++) {
            System.out.println((i + 1) + ". " + feiticeiros[i].getName());
        }

        System.out.println("Digite o número do Seu Feiticeiro Jujutsu!");
        int escolhaJogador = scanner.nextInt() - 1 ;


        if (escolhaJogador < 0  || escolhaJogador >= feiticeiros.length){
            System.out.println("Escolha inválida! Saindo do Jogo...");
        }

        JujutsuSorcerer jogador = feiticeiros[escolhaJogador];
        Vilao computador = viloes[random.nextInt(viloes.length)];

        System.out.println("\n" + jogador.getName() + " VS " + computador.getName());
        System.out.println("Que a batalha comece! \n");

        while(jogador.estaVivo() && computador.estaVivo()){
            //turno jogador
            System.out.println("Sua vez de atacar! Escolha um golpe: ");
            for(int i = 0; i < jogador.getAtaques().length; i++){
                Ataque ataque = jogador.getAtaques()[i];
                System.out.println((1 + i) + ". " + ataque.getNome() + (ataque.podeUsar()? "" : "(CoolDown)"));
            }

            int escolhaAtaque;
            while(true){
                System.out.println("Escolha o número do ataque: ");
                escolhaAtaque = scanner.nextInt() - 1;

                if (escolhaAtaque >= 0 && escolhaAtaque < jogador.getAtaques().length && jogador.getAtaques()[escolhaAtaque].podeUsar()){
                    break;
                }
                System.out.println("Ataque indisponível! Escolha outro. ");
            }

            Ataque ataqueEscolhido =  jogador.getAtaques()[escolhaAtaque];
            ataqueEscolhido.usar();
            computador.receberDano(ataqueEscolhido.getDano());
            System.out.println(jogador.getName() + " usou " + ataqueEscolhido.getNome() + " causando "  + ataqueEscolhido.getDano() + " de Dano!");

            if (!computador.estaVivo()) {
                System.out.println("Você VENCEU! " + computador.getName() + " foi derrotado");
                break;
            }

            Thread.sleep(1000);

            //Turno do computador
            System.out.println("\n Turno do Adversario ...");
            Ataque ataqueComputador;
            do {
                ataqueComputador = computador.getAtaques()[random.nextInt(computador.getAtaques().length)];
            }while (!ataqueComputador.podeUsar());

            ataqueComputador.usar();
            jogador.receberDano(ataqueComputador.getDano());
            System.out.println(computador.getName() + " usou " + ataqueComputador.getNome() + " causando "+ ataqueComputador.getDano()+ " de Dano!");

            if (!jogador.estaVivo()){
                System.out.println("\n Você Foi derrotado! " + computador.getName() + " venceu a Batalha!");
            }
        }

        System.out.println("\n \uD83C\uDFAE Fim do jogo!! Obrigado por jogar. !!!\uD83C\uDFAE ");

        scanner.close();
    }
}