package joaoatacadao.pessoa;

import java.util.Date;

public class Gerente extends Funcionario {
    private String senhaGerente;

    public Gerente(String nome, String dataNascimento, long cpf, 
                    double salario, String identificação, String senhaGerente){
        super(nome, dataNascimento, cpf, salario, identificação);
        this.senhaGerente = senhaGerente;
    }

    public String getSenhaGerente() {
        return senhaGerente;
    }

    public void setSenhaGerente(String senhaGerente) {
        this.senhaGerente = senhaGerente;
    }
    
    @Override
    public String toString() {
        return super.toString() + ",\nSenha do Gerente: " + senhaGerente;
    }
}
