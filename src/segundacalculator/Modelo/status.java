package segundacalculator.Modelo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class status
{
    private final String conteudo;
    private String stringValidada;
    
    public status(String conteudo)
    {
        this.conteudo = conteudo;
    }
    
    public List<List> validarString()
    {
        List<List> linhas = new ArrayList<>();
        
        
        String[] linha = this.conteudo.split(";");
        
        for (String linha1 : linha)
        {
            List<String> campos = new ArrayList<>();
            String[] campo = linha1.split(",");
            campos.addAll(Arrays.asList(campo));
            linhas.add(campos);
        }
        

        return linhas;
    }
    
    
    
    
}
