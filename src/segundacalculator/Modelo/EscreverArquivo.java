package segundacalculator.Modelo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class EscreverArquivo
{
    private  String linha;
    
    
    public EscreverArquivo(String linha) throws IOException
    {
        this.linha = linha;
        escrever(this.linha);
    }
    
    private void escrever(String linha) throws IOException
    {     
        // Cria arquivo
        File file = new File("teste.txt");

        // Se o arquivo nao existir, ele gera
        if (!file.exists()) {
            file.createNewFile();
        }

        // Prepara para escrever no arquivo
        FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
        BufferedWriter bw = new BufferedWriter(fw);
            
        // Escreve e fecha arquivo
        bw.write(linha);
        bw.close();
    }
    
    
}
