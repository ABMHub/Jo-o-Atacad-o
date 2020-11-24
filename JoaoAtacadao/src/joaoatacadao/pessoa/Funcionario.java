package joaoatacadao.pessoa;
import java.util.Date;

public class Funcionario extends Pessoa {
    protected double salario;
    protected String identificação;

    public Funcionario(String nome, String dataNascimento, long cpf, 
                       double salario, String identificação) {
        super(nome, dataNascimento, cpf);
        this.salario = salario;
        this.identificação = identificação;
    }

    public double getSalario() {
        return salario;
    }

    public String getIdentificação() {
        return identificação;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setIdentificação(String identificação) {
        this.identificação = identificação;
    }

    @Override
    public String toString() {
        return super.toString() + ",\nSalário: " + salario + ",\nIdentificação: " + identificação;
    }
    
    
    
}
