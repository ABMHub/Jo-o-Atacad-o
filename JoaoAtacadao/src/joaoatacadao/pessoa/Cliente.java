package joaoatacadao.pessoa;

import java.util.Date;

public class Cliente extends Pessoa {
    private double saldoEmConta;
    private String senhaCartaoFidelidade;

    public Cliente(String nome, Date dataNascimento, long cpf, 
                   double saldoEmConta, String senhaCartaoFidelidade) {
        super(nome, dataNascimento, cpf);
        this.saldoEmConta = saldoEmConta;
        this.senhaCartaoFidelidade = senhaCartaoFidelidade;
    }

    public double getSaldoEmConta() {
        return saldoEmConta;
    }

    public String getSenhaCartaoFidelidade() {
        return senhaCartaoFidelidade;
    }

    public void setSaldoEmConta(double saldoEmConta) {
        this.saldoEmConta = saldoEmConta;
    }

    public void setSenhaCartaoFidelidade(String senhaCartaoFidelidade) {
        this.senhaCartaoFidelidade = senhaCartaoFidelidade;
    }

    @Override
    public String toString() {
        return super.toString() + ",\nSaldo em Conta: " + saldoEmConta + ",\nSenha do Cartão Fidelidade: " + senhaCartaoFidelidade;
    }
    
}
