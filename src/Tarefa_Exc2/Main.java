package Tarefa_Exc2;

public class Main {

    public static void main(String[] args) {

        Pessoa pUm = new Pessoa("Fernando",30);
        Pessoa pDois = new Pessoa("Erick",35);
        Pessoa pTres = new Pessoa("Leno",55);

        pUm.testeIdade(pDois.getIdade(),pTres.getIdade());
        pDois.testeIdade(pUm.getIdade(),pTres.getIdade());
        pTres.testeIdade(pUm.getIdade(),pDois.getIdade());

    }

}
