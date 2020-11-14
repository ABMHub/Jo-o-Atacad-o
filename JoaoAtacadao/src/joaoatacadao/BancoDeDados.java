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
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class BancoDeDados {
    
    public static void escritor(String arquivo, String dadoQueSeraEscrito) throws IOException { 
        BufferedWriter bufferDeEscrita = new BufferedWriter(new FileWriter(arquivo, true));
        for (int i = 0; i < 1000; i++) {
            bufferDeEscrita.append(dadoQueSeraEscrito);
        }
        bufferDeEscrita.close();
    }
    
    public static String[] pesquisa(String arquivo, String codigo) throws FileNotFoundException {
        Scanner entrada = new Scanner(new File(arquivo));
        entrada.useDelimiter(codigo);
        entrada.next();
        
        entrada.useDelimiter("\n");
        entrada.next();
        
        if (!(entrada.hasNextLine()))
            return null;
        
        entrada.useDelimiter(";");
        
        String[] vetor = entrada.next().split(",");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (vetor[i].split(":"))[1];
        }
        
        entrada.close();
        return vetor;
    }
    
    public static ArrayList leitura(String arquivo, int pg) throws FileNotFoundException {
        
        Scanner entrada = new Scanner(new File(arquivo));
        for (int i = 0; i < pg*10; i++) {
            entrada.useDelimiter(";");
            entrada.next();
            entrada.useDelimiter("\n");
            entrada.next();
            if (!(entrada.hasNextLine()))
                return null;
        }
        
        ArrayList lista = new ArrayList();
        
        for (int j = 0; j < 10; j++){
            entrada.useDelimiter(";");
            String[] vetor = entrada.next().split(",");
            for (int i = 0; i < vetor.length; i++) {
                vetor[i] = (vetor[i].split(":"))[1];
            }
            lista.add(vetor);
            
            entrada.useDelimiter("\n");
            entrada.next();
            
            if (!(entrada.hasNextLine()))
                return lista;
        }
        
        entrada.close();
        return lista;
    }
}
