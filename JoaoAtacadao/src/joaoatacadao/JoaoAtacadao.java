package joaoatacadao;

import java.io.IOException;
import java.util.Arrays;
import telas.CadastrarCliente;
import telas.CadastrarFuncionario;
import telas.CadastrarProduto;
import telas.Caixa;
import telas.ListarProdutos;
import telas.Principal;

public class JoaoAtacadao {    
    
    public static void main(String[] args) throws IOException {
        //new NewJFrame().setVisible(true);
        //new CadastrarProduto().setVisible(true); 
        //new ListarProdutos().setVisible(true);
        //new GerenciaProdutos().setVisible(true);
        //new CadastrarCliente().setVisible(true);
        //new CadastrarFuncionario().setVisible(true);
        //new Caixa().setVisible(true);
        //System.out.println(Arrays.toString(BancoDeDados.leitor("lucas.txt", "aaaaaaaaaaaaaaaaa")) == "null" ? "Não existe" : "Existe" );
        /*try {
            BancoDeDados.remover("eletroeletronicos.txt", "4444");
            } catch (FileNotFoundException ex) {
            Logger.getLogger(JoaoAtacadao.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        //new NewJFrame().setVisible(true);
        //new CadastrarProduto().setVisible(true);
        //new ListarProdutos().setVisible(true);
        //new CadastrarFuncionario().setVisible(true);
        new Principal().setVisible(true);
        //System.out.println(Arrays.toString(BancoDeDados.leitor("lucas.txt", "aaaaaaaaaaaaaaaaa")) == "null" ? "Não existe" : "Existe" );
    }
    
}
