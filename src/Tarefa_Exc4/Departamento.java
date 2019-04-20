package Tarefa_Exc4;
import java.util.List;

public class Departamento  {

    private String departamento;
    private List<Funcionario> funcionarios;

    public Departamento() {
    }

    public Departamento(String departamento, List<Funcionario> funcionarios) {
        this.departamento = departamento;
        this.funcionarios = funcionarios;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public void listaDeFuncionarios(List<Funcionario> dept)
    {
        System.out.println("==================================\nDepartamento de " + getDepartamento() + "\n==================================");
    for (int i = 0; i <dept.size(); i++) {
        System.out.println("\n==================================\nFuncionário(a)\n==================================" +
                "\nNome: " + dept.get(i).getNome() + "\nData da admissão: " + dept.get(i).getDataDeAdmissao() + "\nSalário: R$" + dept.get(i).getSalario()  + "\n==================================");
            }
    }
    public void transferirDep (Funcionario func,List<Funcionario> novoDpt){
        System.out.println("\n===================================" + "\nTransferindo funcionário(a): " + func.getNome() + "\nDepartamento: " + this.departamento + "\n===================================");
        funcionarios.remove(func);
        novoDpt.add(func);
    }
}
