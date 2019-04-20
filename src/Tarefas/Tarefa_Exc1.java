package Tarefas;

import java.util.Scanner;

public class Tarefa_Exc1 {

    public static void main(String[] args) {
        int num,numa,nums;

        System.out.println("Digite um numero: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        numa = num - 1;
        nums = num + 1;
        System.out.println("antecessor é: " + numa + " sucessor é: " + nums);

    }

}


