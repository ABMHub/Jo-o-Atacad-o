/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package joaoatacadao;

import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author lucas
 */
public class JoaoAtacadao {    
    
    public static void main(String[] args) throws IOException {
        System.out.println(Arrays.toString(BancoDeDados.leitor("lucas.txt", "aaaaaaaaaaaaaaaaa")) == "null" ? "Não existe" : "Existe" );
    }
    
}