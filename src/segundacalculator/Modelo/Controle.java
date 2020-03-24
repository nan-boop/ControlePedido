/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundacalculator.Modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Dell-9BQM7S1
 */
public class Controle{
    private String Pedido="";
    
    public void controle(String nome,String produto,String rua, String numerocasa, String cidade, Double valortotal) throws IOException{
     Validacao valida=new Validacao();
     valida.getvalidacao(nome, produto, rua, numerocasa, cidade, valortotal);
     String content = nome+","+produto+","+rua+","+numerocasa+","+cidade+","+valortotal.toString()+"\r\n";

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
            bw.write(content);
            bw.close();
            
    }
    public void lerarquivo() throws FileNotFoundException, IOException{
        FileReader ler = new FileReader("teste.txt");
            BufferedReader reader = new BufferedReader(ler);  
            String linha;
            while( (linha = reader.readLine()) != null ){
                this.Pedido += linha+"+";
            }
    }

    public String getPedido()
    {
        return Pedido;
    }
    

}
