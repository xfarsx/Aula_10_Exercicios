package Tarefa_Exc5;

public class Circulo implements FormaGeometrica {

    private double raio;

    public Circulo() {
    }
    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public void ImprimirCalculo() {
        double diametro,area;
        System.out.println("Circulo\n================\nRaio: " + raio + " m");
        diametro = raio * 2;
        System.out.println("Diametro: " + diametro + " m");
        area = raio * 2 * 3.14;
        System.out.println("Area: " + area + " m2" + "\n================");
    }
}
