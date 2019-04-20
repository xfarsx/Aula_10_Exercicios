package Tarefa_Exc5;

public class Retangulo implements FormaGeometrica {

    private double base;
    private double altura;

    public Retangulo() {
    }

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void ImprimirCalculo() {
        System.out.println("Retangulo\n================\nBase: " + base + " m" + "\naltura: " + altura + " m");
        double area, perimetro;
        perimetro = base * 2 + altura * 2;
        System.out.println("Perimetro: " + perimetro + " m");
        area = base * altura;
        System.out.println("Area: " + area + " m2" + "\n================");

    }
}
