package Sis;

public class Cachorro {
    String raca;
    int tamanho;
    String cor;
    boolean tem_rabo;

    public Cachorro(String raca, int tamanho, String cor, boolean tem_rabo){
        this.raca=raca;
        this.tamanho=tamanho;
        this.cor = cor;
        this.tem_rabo=tem_rabo;
    }
    void late(){
        System.out.println("Eu sou o Pluto, da raça "+raca+" o meu tamanho é de "+tamanho+"cm, e a cor do meu pelo é "+cor);

        if(tem_rabo)
            System.out.println("E eu tenho um rabo! (^-^) ");
        else
            System.out.println("Mas infelizmente, eu não tenho um rabo! (;-;) ");
    }

    public static void main(String[] args) {
        // Criando 3 objetos da classe Cachorro
        Cachorro cachorro1 = new Cachorro("Labrador", 50, "Dourado", true);
        Cachorro cachorro2 = new Cachorro("Poodle", 30, "Branco", true);
        Cachorro cachorro3 = new Cachorro("Pastor Alemão", 60, "Preto", true);

        // Enviando mensagem completa das características dos cachorros
        cachorro1.late();
        cachorro2.late();
        cachorro3.late();
    }
}
