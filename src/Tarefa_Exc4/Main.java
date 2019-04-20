package Tarefa_Exc4;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String digitar;
        int digitarN;
        double num = 0;

        List<Departamento> departamentos = new ArrayList<>();
        Empresa novaEmpresa = new Empresa ("GessoPro",departamentos,"25.245.174/0001-25");
        List<Funcionario> fContabilidade = new ArrayList<>();
        List<Funcionario> fVendas = new ArrayList<>();
        Departamento contabilidade = new Departamento("Contabilidade",fContabilidade);
        Departamento vendas = new Departamento("Vendas",fVendas);
        Funcionario func1 = new Funcionario("Fernando","11/04/2016",6587.0);
        Funcionario func2 = new Funcionario("Júlio","24/06/2016",3450.0);
        Funcionario func3 = new Funcionario("Gabriela","15/04/2016",3200.0);
        Funcionario func4 = new Funcionario("Bianca","07/11/2016",4550.0);

        departamentos.add(contabilidade);
        departamentos.add(vendas);
        fContabilidade.add(func1);
        fContabilidade.add(func2);
        fVendas.add(func3);
        fVendas.add(func4);

        System.out.println("================================\nEmpresas Registradas!\n================================");
        System.out.println("\nRazão Social: " + novaEmpresa.getNome() + "\nCNPJ: " + novaEmpresa.getCnpj() + "\n================================");

        //Pergunta se quer listar e ver os departamentos que existem na empresa
        System.out.println("Verificar os departamentos da empresa? (S) = Sim / (N) = Não");
        Scanner sc = new Scanner (System.in);
        digitar = sc.next().toUpperCase();//Assegura que a tecla digitada passa para UpperCase
        while (!digitar.equals("S") && !digitar.equals("N")){//Assegura que a tecla digitada seja 'Sim' ou 'Não'
            System.out.println("Erro! Digite correto novamente!");
            digitar = sc.next().toUpperCase();}

        if (digitar.equals("S")) {
            for (int i = 0; i < departamentos.size(); i++){//printa os departamentos
                System.out.println("\n===============================\n" + departamentos.get(i).getDepartamento() + "\n===============================\n");}
        }

        if (digitar.equals("N"))//Se não segue com o programa e pergunta se quer ver todos os departamentos e todos os funcionários.
        {
            System.out.println("Listar departamentos e funcionários? (S) = Sim / (N) = Não");
        }

        Scanner sc1 = new Scanner (System.in);
        digitar = sc1.next().toUpperCase();

        while (!digitar.equals("S") && !digitar.equals("N"))
        {
            System.out.println("Erro! Digite correto novamente!");
            digitar = sc1.next().toUpperCase();;
        }

        if (digitar.equals("S"))
        {
                novaEmpresa.listarTudo(departamentos);//método para rodar todos os departamentos e todos os funcionários (formatados).
        }
        if (digitar.equals("N"))//Se não, pergunta se quer ver a lista de funcionários de cada departamento
        {
            System.out.println("Verificar listda de Funcionários por departamento? (C) = Contabilidade / (V) = Vendas / (N) = Não");
        }
        Scanner sc2 = new Scanner (System.in);
        digitar = sc2.next().toUpperCase();

        while (!digitar.equals("C") && !digitar.equals("V") && !digitar.equals("N"))
        {
            System.out.println("Erro! Digite correto novamente!");
            digitar = sc2.next().toUpperCase();
        }
        if (digitar.equals("C"))
        {
            contabilidade.listaDeFuncionarios(fContabilidade);//método para listar funcionário de um departamento específico
        }
       else if (digitar.equals("V"))
        {
            vendas.listaDeFuncionarios(fVendas);
        }
        if (digitar.equals("N")) {//Se não, pergunta se quer dar um funionário para algum fiuncionário.
            System.out.println("Dar aumento para um funcionário? Digite");
            System.out.println("(1)" + func1.getNome() + "\n(2)" + func2.getNome() + "\n(3)" + func3.getNome() + "\n(4)" + func4.getNome() + "\n(5)Continuar...");

            Scanner sc3 = new Scanner(System.in);
            digitarN = sc3.nextInt();

            while (digitarN < 1 && digitarN > 5) {
                System.out.println("Erro! Digite correto novamente!");
                digitarN = sc3.nextInt();
            }
            if (digitarN <5){
            System.out.println("Digite entre 10 e 100 (%)");
            Scanner sc4 = new Scanner(System.in);
            num = sc4.nextInt();

            while (num < 10 && num > 100) {
                System.out.println("Erro! Digite correto novamente!");
                num = sc4.nextInt();
            }}
            //lógica simples para aplicar aumento no salário do funcionário específico.
            if (digitarN == 1) {
                num = (num / 100) + 1;
                func1.aumentoDeSalario(num);
            }
            if (digitarN == 2) {
                num = (num / 100) + 1;
                func2.aumentoDeSalario(num);
            }
            if (digitarN == 3) {
                num = (num / 100) + 1;
                func3.aumentoDeSalario(num);

            }
            if (digitarN == 4) {
                num = (num / 100) + 1;
                func4.aumentoDeSalario(num);
            }
            //Se não, pergunta se quer transferir funcionário de algum departamento
            if (digitarN == 5) {
                System.out.println("Deseja transferir alguém de departamento? ");
                System.out.println("(1)" + func1.getNome() + "\n(2)" + func2.getNome() + "\n(3)" + func3.getNome() + "\n(4)" + func4.getNome() + "\n(5) Não, Sair do programa.");
            }
            Scanner sc5 = new Scanner(System.in);
            digitarN = sc5.nextInt();

            while (digitarN < 1 && digitarN > 4) {
                System.out.println("Erro! Digite correto novamente!");
                digitarN = sc5.nextInt();
            }
            if (digitarN == 1) {
                contabilidade.transferirDep(func1, fVendas);//Método para Transferir o funcionário
                novaEmpresa.listarTudo(departamentos);//Imprime a lista mostrando a transferencia
            }
            if (digitarN == 2) {
                contabilidade.transferirDep(func2, fVendas);
                novaEmpresa.listarTudo(departamentos);
            }
            if (digitarN == 3) {
                vendas.transferirDep(func3, fContabilidade);
                novaEmpresa.listarTudo(departamentos);

            }
            if (digitarN == 4) {
                vendas.transferirDep(func4, fContabilidade);
                novaEmpresa.listarTudo(departamentos);
            }
            System.out.println();
            if (digitarN == 5) {//Se não, Sai do programa
                System.exit(0);
            }
        }
    }
}
