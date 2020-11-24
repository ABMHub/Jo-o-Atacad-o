package joaoatacadao;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        bufferDeEscrita.append(dadoQueSeraEscrito.trim());
        
        bufferDeEscrita.close();
    }
    
    public static void reescritor(String arquivo, String dadoQueSeraEscrito) throws IOException { 
        BufferedWriter bufferDeEscrita = new BufferedWriter(new FileWriter(arquivo));
        bufferDeEscrita.write(dadoQueSeraEscrito);
        
        bufferDeEscrita.close();
    }
    
    public static String[] pesquisa(String arquivo, String codigo) throws FileNotFoundException {
        Scanner entrada = new Scanner(new File(arquivo));

        
        if (!(entrada.hasNextLine())) {
            entrada.close();
            return null;
        }
            
        
        entrada.useDelimiter(codigo);
        entrada.next();
        
        if (!(entrada.hasNextLine())) {
            entrada.close();
            return null;
        }
        
        entrada.useDelimiter(",");
        String[] codigoAux = {entrada.next()};

        entrada.useDelimiter("\n");
        entrada.next();

        
        if (!(entrada.hasNextLine())) {
            entrada.close();
            return null;
        }

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
        
        if (!(entrada.hasNextLine())) {
            entrada.close();
            return null;
        }
        
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
                System.out.println(vetor[i]);
            }
            lista.add(vetor);
            
            entrada.useDelimiter("\n");
            entrada.next();
            
            if (!(entrada.hasNextLine())) {
                entrada.close();
                return lista;
            }   
            System.out.println("a");
        }
        
        entrada.close();
        return lista;
    }
    
    private static void alterar(String arquivo, String codigo, String dado, boolean remover) throws FileNotFoundException {
        Scanner entrada = new Scanner(new File(arquivo));
        String texto = new String("");
        String codAnalise;
        String stringAux;
        
        if (!(entrada.hasNextLine())) {
            entrada.close();
            return;
        }
        
        do {                       
            entrada.useDelimiter(",");
            stringAux = entrada.next();
            codAnalise = stringAux.split(":")[1];
            
            if (codAnalise.equals(codigo)) {
                entrada.useDelimiter(";");
                entrada.next();
                
                entrada.useDelimiter("\n");
                entrada.next();
                
                if (!remover) {
                    texto = texto + dado;
                }
                
                while (entrada.hasNextLine()) {
                    entrada.useDelimiter(";");
                    texto = texto + entrada.next();
                    
                    entrada.useDelimiter("\n");
                    texto = texto + entrada.next();
                }
            }
            
            else {
                entrada.useDelimiter(";");
                texto = texto + stringAux + entrada.next();
                
                entrada.useDelimiter("\n");
                texto = texto + entrada.next();
            }
                        
        } while(entrada.hasNextLine());
        
        
        try {
            reescritor(arquivo, texto.trim());
        } catch (IOException ex) {
            Logger.getLogger(BancoDeDados.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        entrada.close();
    }
    
    public static void editar (String arquivo, String codigo, String dado) throws FileNotFoundException {
        alterar(arquivo, codigo, dado, false);
    }
    
    public static void remover (String arquivo, String codigo) throws FileNotFoundException {
        alterar(arquivo, codigo, null, true);
    }
}