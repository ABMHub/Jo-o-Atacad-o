
package joaoatacadao;

import joaoatacadao.produto.Celular;
import joaoatacadao.produto.Computador;
import joaoatacadao.produto.Eletroeletronico;
import joaoatacadao.produto.Filmes;
import joaoatacadao.produto.Periferico;
import joaoatacadao.produto.Produto;
import joaoatacadao.produto.Vestuario;

public class ItemPedido {
    private float subtotal;
    private int quantidade;
    Produto produto;

    public ItemPedido(String []dados) {
        
        switch(dados[0].charAt(0))
        {
            //celular
            case 'a': 
            case 'A':
                produto = new Celular(dados[6], dados[7], dados[8], dados[9], dados[4], dados[5], 
                          dados[1], dados[0], Float.parseFloat(dados[2]), dados[3]);
                break;
            
            case 'b': 
            case 'B':
                produto = new Computador(dados[6], dados[7], dados[8], dados[9], Boolean.getBoolean(dados[10]), dados[4], 
                          dados[5], dados[1], dados[0], Float.parseFloat(dados[2]), dados[3]);
                break;
                
            case 'c': 
            case 'C':
                produto = new Eletroeletronico(dados[4], dados[5], Boolean.getBoolean(dados[6]), dados[1], dados[0], 
                          Float.parseFloat(dados[2]), dados[3]);
                break;
                
            case 'd': 
            case 'D':
                produto = new Filmes(dados[6], Integer.parseInt(dados[7]), dados[4], dados[5], dados[1], dados[0], 
                        Float.parseFloat(dados[2]), dados[3]);
                break;    
            
            case 'e': 
            case 'E':
                produto = new Periferico(dados[6], dados[7], dados[4], dados[5], dados[1], dados[0], 
                Float.parseFloat(dados[2]), dados[3]);
                break;
            
            case 'f': 
            case 'F':
                produto = new Vestuario(dados[4], dados[5], dados[6], dados[1], dados[0], Float.parseFloat(dados[2]), dados[3]);
                break;    
                
            case 'g':
            case 'G':
                produto = new Filmes(dados[6], Integer.parseInt(dados[7]), dados[4], dados[5], dados[1], dados[0], 
                          Float.parseFloat(dados[2]), dados[3]);
                break;
                
            default:
                break;   //Deu ruim
        }
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
        subtotal = (float)quantidade * produto.getValor();
    }
    
}
