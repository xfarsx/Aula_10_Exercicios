package Exc4;

public class Funcionario {

    private String nome;
    private int numeroDeRegistro;

    public Funcionario() {
    }
    public Funcionario(String nome, int numeroDeRegistro) {
        this.nome = nome;
        this.numeroDeRegistro = numeroDeRegistro;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroDeRegistro() {
        return numeroDeRegistro;
    }

    public void setNumeroDeRegistro(int numeroDeRegistro) {
        this.numeroDeRegistro = numeroDeRegistro;
    }

    @Override
    public boolean equals(Object outroFuncionario) {
        if (!(outroFuncionario instanceof Funcionario)){return false;}
        if (((Funcionario) outroFuncionario).getNumeroDeRegistro() == this.getNumeroDeRegistro()){return true;}
        return false;
    }
}
