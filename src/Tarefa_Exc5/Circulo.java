package Tarefa_Exc5;

public class Circulo implements FormaGeometrica {

    private double raio;

    public Circulo() {
    }
    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public void ImprimirLados() {
        double diametro,area;
        System.out.println("================\nRaio: " + raio);
        diametro = raio * 2;
        System.out.println("Diametro: " + diametro);
        area = raio * 2 * 3.14;
        System.out.println("Area: " + area + "\n===============");
    }
}
