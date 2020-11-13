/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joaoatacadao;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class BancoDeDados {
    
    public static void escritor(String arquivo, String dadoQueSeraEscrito) throws IOException { 
        BufferedWriter bufferDeEscrita = new BufferedWriter(new FileWriter(arquivo, true));
        for (int i = 0; i < 1000; i++){
            bufferDeEscrita.append(dadoQueSeraEscrito);
        }
        bufferDeEscrita.close();
    }
    
    public static String[] leitor(String arquivo, String codigo) throws FileNotFoundException {
        Scanner entrada = new Scanner(new File(arquivo));
        entrada.useDelimiter(codigo);
        entrada.next();
        
        if (!(entrada.hasNextLine()))
            return null;
        
        entrada.useDelimiter("\n");
        entrada.next();
        entrada.useDelimiter(";");
        
        String[] vetor = entrada.next().split(",");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (vetor[i].split(":"))[1];
        }
        
        entrada.close();
        return vetor;
    }   
}
