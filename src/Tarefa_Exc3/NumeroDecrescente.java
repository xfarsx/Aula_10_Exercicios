package Tarefa_Exc3;

import java.util.List;

public class NumeroDecrescente {

    private int numero;

    public NumeroDecrescente() {
    }
    public NumeroDecrescente(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void decrescente (List<Integer> nums)
    {   int i;
        System.out.println("\n ============ \n Decrescente \n ============ \n");
        for (i = getNumero() ; i >= 0 ; i--)
        {
            System.out.println(nums.get(i));
        }
    }
}
