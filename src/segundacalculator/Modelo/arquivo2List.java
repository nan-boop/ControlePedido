/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundacalculator.Modelo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jorge
 */
public class arquivo2List
{
    private List<List> pedidos = new ArrayList<List>();
    
    
    public arquivo2List(String nomeArquivo) throws IOException
    {
        LerArquivo ler = new LerArquivo(nomeArquivo);
        String linha = ler.getLinhasArquivo();
            
            
        List<List> linhas = new ArrayList<List>();
            
        String[] linhaSplit = linha.split(";");

        for (int i = 0; i < linhaSplit.length; i++)
        {

            String[] campos = linhaSplit[i].split(",");
            List<String> Campos = new ArrayList<String>();

            for (int j = 0; j < campos.length; j++)
            {

               Campos.add(campos[j]);

            }

            linhas.add(Campos);

        }
        
        this.pedidos = linhas;
        
    }

    public List<List> getPedidos()
    {
        return pedidos;
    }
    
}
