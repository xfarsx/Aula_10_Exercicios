package Exc2;

public class Coca {

    private int tamanho;
    private double preco;


    public Coca() {
    }

    public Coca(int tamanho, double preco) {
        this.tamanho = tamanho;
        this.preco = preco;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public boolean equals(Object outraCoca) {
        if(!(outraCoca instanceof Coca)){return false;}
        if(((Coca) outraCoca).getTamanho() == this.getTamanho()){return true;}
        return false;
    }
}
