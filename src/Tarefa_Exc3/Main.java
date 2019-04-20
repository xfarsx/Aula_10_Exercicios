package Tarefa_Exc3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x, i;
        List<Integer> numeros = new ArrayList<>();
        NumeroDecrescente nDcrescente = new NumeroDecrescente();

        System.out.println("Digite a quantidade de números!");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        nDcrescente.setNumero(x);
        for (i = 0; i<=x; i++){
            numeros.add(i);
        }
        nDcrescente.decrescente(numeros);
    }

}
