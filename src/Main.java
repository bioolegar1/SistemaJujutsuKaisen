import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        JujutsuSorcerer[] feiticeiros = {
                new GojouSatoru(),
                new GetoSuguru(),
                new NanamiKento(),
                new MakiZenin(),
                new NobaraKugisaki(),
                new MegumiFushiguro(),
                new YujiItadori()
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
        JujutsuSorcerer computador = feiticeiros[random.nextInt(feiticeiros.length)];

        System.out.println("\n" + jogador.getName() + " VS " + computador.getName());
        System.out.println("Que a batalha comece! \n");

        while (jogador.estaVivo() && computador.estaVivo()) {
            System.out.println("⚡ Sua vez de atacar! ⚡⚡⚡");
            jogador.atacar(computador);

            if (!jogador.estaVivo()) {
                System.out.println("\uD83C\uDF89 Parabens " +  computador.getName() + " foi derrotado! Você Venceu!");
            break;
            }

            System.out.println("⚠\uFE0F Turno do adversário... ⚠\uFE0F");
            computador.atacar(jogador);

            if (!jogador.estaVivo()) {
                System.out.println("💀 Você foi derrotado! " + computador.getName() + " venceu a batalha. 💀");
            }
        }

        System.out.println("\n \uD83C\uDFAE Fim do jogo!! Obrigado por jogar. !!!\uD83C\uDFAE ");


    }
}