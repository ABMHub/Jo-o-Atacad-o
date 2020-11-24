
package joaoatacadao.produto;

public class Produto {
    protected String nome;
    protected String codigoDeBarras;
    protected float valor;
    protected String marca;

    public Produto(String nome, String codigoDeBarras, float valor, String marca) {
        this.nome = nome;
        this.codigoDeBarras = codigoDeBarras;
        this.valor = valor;
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }

    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public float getValor() {
        return valor;
    }

    public String getMarca() {
        return marca;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodigoDeBarras(String codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ",\nCódigo de Barras: " + codigoDeBarras + ",\nValor: " + valor + ",\nMarca: " + marca;
    }
    
    
}
