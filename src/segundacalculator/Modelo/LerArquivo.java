package segundacalculator.Modelo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LerArquivo
{
    private String nomeArquivo;
    private String linhasArquivo;
    
    public LerArquivo(String nomeArquivo) throws IOException
    {
        this.nomeArquivo = nomeArquivo;
        Ler(this.nomeArquivo);
    }
    
    private void Ler(String nomeArquivo) throws FileNotFoundException, IOException
    {
        
        FileReader ler = new FileReader(nomeArquivo);
        BufferedReader reader = new BufferedReader(ler);  
        String linha;
        
        this.linhasArquivo = "";
        
        while( (linha = reader.readLine()) != null )
        {
            this.linhasArquivo += linha + ";"; 
        }
        
        
        
    }

    public String getLinhasArquivo()
    {
        return linhasArquivo;
    }
    
    
    
    
}
