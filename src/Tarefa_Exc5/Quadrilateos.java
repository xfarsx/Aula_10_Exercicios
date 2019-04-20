package Tarefa_Exc5;

public abstract class Quadrilateos implements FormaGeometrica{

    private double lado1;
    private double lado2;
    private double lado3;
    private double lado4;

    public Quadrilateos() {
    }

    public Quadrilateos(double lado1) {
        this.lado1 = lado1;
    }

    public Quadrilateos(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public Quadrilateos(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public Quadrilateos(double lado1, double lado2, double lado3, double lado4) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.lado4 = lado4;
    }


}
