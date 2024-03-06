package Sis;

public class Pessoa {

    String nome;
    int idade;
    String cidade;
    public Pessoa(String nome, int idade, String cidade){
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
    }
    public void apresentar(){
        System.out.print(" Nome: " + nome);
        System.out.print(", Idade: " + idade);
        System.out.print(", Cidade: " + cidade);
    }
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Eragon",17, "Minas Gerais");
        Pessoa pessoa2 = new Pessoa("Arya",27, "São Paulo");

        System.out.println("Pessoa Nº1: ");
        pessoa1.apresentar();
        System.out.println("Pessoa Nº2: ");
        pessoa2.apresentar();
    }
}
