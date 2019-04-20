package Tarefa_Exc5;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Quadrado quad = new Quadrado(4);
        Retangulo retangulo = new Retangulo(2,4);
        Circulo circulo = new Circulo(2.5);

        List<Double> formas = new ArrayList<>();

        quad.ImprimirLados();
        retangulo.ImprimirLados();
        circulo.ImprimirLados();


    }
}
