package Exc3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Aluno aluno = new Aluno("Fernando", 1230);
        Aluno aluno1 = new Aluno("Julia", 1231);
        Aluno aluno2 = new Aluno("Michele", 1232);
        Aluno aluno3 = new Aluno("Diego", 1233);
        Aluno aluno4 = new Aluno("Bruna", 1233);

        List<Aluno> listaDeAlunos = new ArrayList<>();
        listaDeAlunos.add(aluno);
        listaDeAlunos.add(aluno1);
        listaDeAlunos.add(aluno2);
        listaDeAlunos.add(aluno3);

        System.out.println(listaDeAlunos.contains(aluno4));

        System.out.println(aluno4.equals(aluno));
        System.out.println(aluno4.equals(aluno1));
        System.out.println(aluno4.equals(aluno2));
        System.out.println(aluno4.equals(aluno3));

    }

}
