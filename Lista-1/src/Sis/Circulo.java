package Sis;

public class Circulo {
    public static void main(String[] args) {
        double raio = 5.0; // Exemplo de raio
        Circulo circulo = new Circulo(raio);

        System.out.println("Área do círculo: " + circulo.calcularArea());
        System.out.println("Perímetro do círculo: " + circulo.calcularPerimetro());
    }
    private final double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

}