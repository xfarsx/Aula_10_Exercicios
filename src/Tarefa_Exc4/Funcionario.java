package Tarefa_Exc4;

import java.util.List;

public class Funcionario extends Departamento {

    private String nome;
    private String dataDeAdmissao;
    private double salario;

    public Funcionario() {
    }
    public Funcionario(String nome, String dataDeAdmissao, double salario) {
        this.nome = nome;
        this.dataDeAdmissao = dataDeAdmissao;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataDeAdmissao() {
        return dataDeAdmissao;
    }

    public void setDataDeAdmissao(String dataDeAdmissao) {
        this.dataDeAdmissao = dataDeAdmissao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void aumentoDeSalario (double aumento)
    {
        double novoSalario;
        novoSalario = getSalario() * aumento;
        System.out.println("\n====================================" + "\nFuncionário(a): " + getNome() + "\nAntigo Salário: R$ " + getSalario() +
                "\nNovo salário: R$ " + novoSalario + "\n====================================");
    }
}
