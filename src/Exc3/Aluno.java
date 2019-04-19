package Exc3;

public class Aluno {

    private String nome;
    private int numeroDeAluno;

    public Aluno() {
    }
    public Aluno(String nome, int numeroDeAluno) {
        this.nome = nome;
        this.numeroDeAluno = numeroDeAluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroDeAluno() {
        return numeroDeAluno;
    }

    public void setNumeroDeAluno(int numeroDeAluno) {
        this.numeroDeAluno = numeroDeAluno;
    }

    @Override
    public boolean equals(Object outroAluno) {
        if(!(outroAluno instanceof Aluno)){return false;}
        if (((Aluno) outroAluno).getNumeroDeAluno() == this.getNumeroDeAluno()){return true;}
        return false;
    }
}
