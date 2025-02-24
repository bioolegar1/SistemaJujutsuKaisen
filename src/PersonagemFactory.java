import java.util.ArrayList;
import java.util.List;

public class PersonagemFactory {
    public static List<Feiticeiro> criarFeiticeiro() {
        List<Feiticeiro> feiticeiros = new ArrayList<>();

        feiticeiros.add(new Feiticeiro("Yuji Itadori", "Feiticeiro de Grau Especial",20, new Ataque[]{
                new Ataque("Kokusen", 20),
                new Ataque("Renda", 20),
                new Ataque("Hakai Geri", 22),
                new Ataque("Ryõiki Tenkai: Fukuma Mizuhi", 30)
        }));

        feiticeiros.add(new Feiticeiro("Nanami Kento", "Feiticeiro de 1ª Classe!", 25,new Ataque[]{
                new Ataque("Hiritsu Juhõ", 23),
                new Ataque("Senbun", 19),
                new Ataque("Jikansa", 21),
                new Ataque("Ryõiki Tenkai", 29)
        }));

        feiticeiros.add(new Feiticeiro("Yuta Okkotsu", "Feiticeiro de Grau Especial",22, new Ataque[]{
                new Ataque("Katana Tamashii", 24),
                new Ataque("Inori Ju", 20),
                new Ataque("Rika Kengen", 27),
                new Ataque("Ryõiki Tenkai: Hanten", 32)
        }));

        return feiticeiros;
    }


    public static List<Vilao> crarViloes() {
        List<Vilao> viloes = new ArrayList<>();
        viloes.add(new Vilao("Hyomen Sukuna", "Rei das maldições", 31,new Ataque[]{
            new Ataque("Kai", 25),
            new Ataque("Enju", 20),
            new Ataque("Hachi", 18),
            new Ataque("Ryõiki Tenkai: Fukuma Mizushi", 35),

        }));

        viloes.add(new Vilao("Mahito", "Espirito Amaldiçoado", 23,new Ataque[]{
                new Ataque("Muitenpen", 20),
                new Ataque("Kon Hen` yõ", 18),
                new Ataque("Shõju", 22),
                new Ataque("Ryõiki Tenkai: Jihen Endonka", 30),

        }));

        viloes.add(new Vilao("Jogo", "Espirito Amaldiçoado de Fogo",19, new Ataque[]{
                new Ataque("Karekimushi", 22),
                new Ataque("Enran", 25),
                new Ataque("Shakunetsu Hõsha", 20),
                new Ataque("Ryõiki Tenkai: Kazan Saigai", 25),
        }));


        return viloes;
    }
}
