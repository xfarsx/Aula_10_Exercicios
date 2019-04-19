package Exc4;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario ("Fernando", 0204);
        Funcionario funcionario1 = new Funcionario ("Nadia", 0205);
        Funcionario funcionario2 = new Funcionario ("Erick", 0206);
        Funcionario funcionario3 = new Funcionario ("Nalva", 0207);
        Funcionario funcionario4 = new Funcionario ("Natália", 0207);

        List<Funcionario> listaDeFuncionarios = new ArrayList<>();

        listaDeFuncionarios.add(funcionario);
        listaDeFuncionarios.add(funcionario1);
        listaDeFuncionarios.add(funcionario2);
        listaDeFuncionarios.add(funcionario3);

        //System.out.println(listaDeFuncionarios.contains(funcionario4)); Resp: true

        System.out.println(funcionario4.equals(funcionario));//false
        System.out.println(funcionario4.equals(funcionario1));//false
        System.out.println(funcionario4.equals(funcionario2));//false
        System.out.println(funcionario4.equals(funcionario3));//true

        System.out.println(funcionario4.equals(listaDeFuncionarios));//false
    }

}
