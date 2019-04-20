package Tarefa_Exc5;

public class Quadrado implements FormaGeometrica {

    private double lado;

    public Quadrado() {
    }

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public void ImprimirCalculo() {
            System.out.println("Quadrado\n================\nLado: " + lado + " m");
            lado = lado * 4;
            System.out.println("Perimetro: " + lado + " m");
            System.out.println("Area: " + lado + " m2"  + "\n================");
    }
}
