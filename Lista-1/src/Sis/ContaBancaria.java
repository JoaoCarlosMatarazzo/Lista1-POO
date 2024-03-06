package Sis;
public class ContaBancaria {
    int numero;
    String titular;
    double saldo;
    void depositar(double valor){
        saldo+= valor;
        System.out.println("Deposito realizado com sucesso, parabéns!");
    }
    void sacar(double valor){
        if (valor > saldo)
            System.out.print("Desculpa, saldo insuficiente, tente novamente.");
        else{
            saldo -= valor;
            System.out.print("Saque realizado com sucesso.");
        }
    }
    void exibir(){
        System.out.print("Seu saldo atual é de:R$ "+saldo);
    }
}
