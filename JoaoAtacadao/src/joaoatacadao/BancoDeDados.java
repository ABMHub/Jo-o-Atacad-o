package joaoatacadao;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class BancoDeDados {
    
    public static String[] concatArray(String[] vetor, String[] vetor2) {
        String[] vetorRetorno = new String[vetor.length + vetor2.length];
        for (int i = 0; i < vetor.length; i++) {
            vetorRetorno[i] = vetor[i];
        }
        for (int i = vetor.length; i < vetor.length + vetor2.length; i++) {
            vetorRetorno[i] = vetor2[i-vetor.length];
        }
        return vetorRetorno;
    }
    
    public static void criaArquivos () throws IOException {
        File arq;
        String[] nomesArquivos = {"livros.txt", "filmes.txt", "perifericos.txt",
            "celulares.txt", "computadores.txt", "eletroeletronicos.txt", "vestuario.txt", "lucas.txt"};
        
        for (int i = 0; i < nomesArquivos.length; i++) {
            arq = new File(nomesArquivos[i]);
            arq.createNewFile();
        }
    }
    
    public static void escritor(String arquivo, String dadoQueSeraEscrito) throws IOException { 
        BufferedWriter bufferDeEscrita = new BufferedWriter(new FileWriter(arquivo, true));
        bufferDeEscrita.append(dadoQueSeraEscrito);
        
        bufferDeEscrita.close();
    }
    
    public static void reescritor(String arquivo, String dadoQueSeraEscrito) throws IOException { 
        BufferedWriter bufferDeEscrita = new BufferedWriter(new FileWriter(arquivo));
        bufferDeEscrita.write(dadoQueSeraEscrito);
        
        bufferDeEscrita.close();
    }
    
    public static String[] pesquisa(String arquivo, String codigo) throws FileNotFoundException {
        Scanner entrada = new Scanner(new File(arquivo));

        if (!(entrada.hasNextLine()))
            return null;

        entrada.useDelimiter(codigo);
        entrada.next();

        if (!(entrada.hasNextLine()))
            return null;

        entrada.useDelimiter(",");
        String[] codigoAux = {entrada.next()};

        entrada.useDelimiter("\n");
        entrada.next();

        if (!(entrada.hasNextLine()))
            return null;

        entrada.useDelimiter(";");

        String[] vetor = entrada.next().split(",");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (vetor[i].split(":"))[1];
        }

        String[] arrayRetorno = concatArray(codigoAux, vetor);

        entrada.close();
        return arrayRetorno;
    }

    
    public static ArrayList leitura(String arquivo, int pg) throws FileNotFoundException {
        Scanner entrada = new Scanner(new File(arquivo));
        
        if (!(entrada.hasNextLine()))
                return new ArrayList();
        
        for (int i = 0; i < pg*10; i++) {
            entrada.useDelimiter(";");
            entrada.next();
            entrada.useDelimiter("\n");
            entrada.next();
            if (!(entrada.hasNextLine()))
                return null;
        }
        
        ArrayList lista = new ArrayList();
        
        for (int j = 0; j < 10; j++) {
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