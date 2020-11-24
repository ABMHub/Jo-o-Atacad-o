package joaoatacadao.pessoa;

import java.util.Date;

public abstract class Pessoa {
    protected String nome;
    protected Date dataNascimento;
    protected long cpf;
    
    public Pessoa(String nome, Date dataNascimento, long cpf){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public long getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ",\nData de Nascimento: " + dataNascimento + ",\nCPF: " + cpf;
    }
 
    
}
