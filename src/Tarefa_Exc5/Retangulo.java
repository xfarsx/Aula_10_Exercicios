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
    public void ImprimirLados() {
        System.out.println("================\nBase: " + base + "\naltura: " + altura);
        double area, perimetro;
        perimetro = base * 2 + altura * 2;
        System.out.println("Perimetro: " + perimetro);
        area = base * altura;
        System.out.println("Area: " + area + "\n===============");

    }
}
