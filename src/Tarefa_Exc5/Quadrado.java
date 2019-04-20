package Tarefa_Exc5;

public class Quadrado implements FormaGeometrica {

    private double lado;

    public Quadrado() {
    }

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public void ImprimirLados() {
            System.out.println("================\nLado: " + lado);
            lado = lado * 4;
            System.out.println("Perimetro: " + lado);
            System.out.println("Area: " + lado + "\n===============");
    }
}
