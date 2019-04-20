package Tarefa_Exc2;

public class Pessoa {

    private String nome;
    private int idade;

    public Pessoa() {
    }
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    public void testeIdade (Integer idadeUm, Integer idadeDois){
        if (idadeUm > this.getIdade() && idadeDois > this.getIdade())
        {
            System.out.println("Mais Novo = " + this.getNome());
        }
        if (idadeUm < this.getIdade() && idadeDois < this.getIdade())
        {
            System.out.println("Mais Velho = " + this.getNome());
        }
        if (idadeUm == this.getIdade() || idadeDois == this.getIdade())
        {
            System.out.println("Mesma idade");
        }

    }

}
