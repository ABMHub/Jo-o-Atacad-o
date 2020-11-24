package joaoatacadao.pessoa;

import java.util.Date;

public class Vendedor extends Funcionario {
    private int quantidadeVendas;

    public Vendedor(String nome, Date dataNascimento, long cpf, 
                    double salario, String identificação, int quantidadeVendas){
        super(nome, dataNascimento, cpf, salario, identificação);
        this.quantidadeVendas = quantidadeVendas;
    }

    public int getQuantidadeVendas() {
        return quantidadeVendas;
    }

    public void setQuantidadeVendas(int quantidadeVendas) {
        this.quantidadeVendas = quantidadeVendas;
    }

    @Override
    public String toString() {
        return super.toString() + ",\nVendedor: " + ",\nQuantidade de Vendas: " + quantidadeVendas;
    }
    
    
    
}