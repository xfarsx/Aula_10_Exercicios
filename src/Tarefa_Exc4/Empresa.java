package Tarefa_Exc4;
import java.util.ArrayList;
import java.util.List;


public class Empresa extends Departamento {

    private String nome;
    List<Departamento> deptos = new ArrayList<>();
    private String cnpj;

    public Empresa() {
    }

    public Empresa(String nome, List<Departamento> deptos, String cnpj) {
        this.nome = nome;
        this.deptos = deptos;
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Departamento> getDeptos() {
        return deptos;
    }

    public void setDeptos(List<Departamento> deptos) {
        this.deptos = deptos;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public void listarTudo(List<Departamento> depts)
    {
        for (int i = 0;i<depts.size();i++) {
            System.out.println("===================================\nDepartamento de " + depts.get(i).getDepartamento() + "\n===================================");
            for (int x = 0; x < depts.get(i).getFuncionarios().size(); x++) {
                System.out.println("\n===================================\nFuncionário(a)\n===================================" +
                        "\nNome: " + depts.get(i).getFuncionarios().get(x).getNome() + "\nData da admissão: " + depts.get(i).getFuncionarios().get(x).getDataDeAdmissao() + "\nSalário: R$ " + depts.get(i).getFuncionarios().get(x).getSalario() + "\n===================================");
            }
        }
    }
}
