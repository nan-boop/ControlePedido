/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundacalculator.Modelo;

/**
 *
 * @author Dell-9BQM7S1
 */
public class Validacao{
    
    private String Nome;
    private String Nome_Produto;
    private String Rua;
    private String Numero_Casa;
    private String Cidade;
    private Double Valor_Total;
 
    public void getvalidacao(String nome,String produto,String rua, String numerocasa, String cidade, Double valortotal){
        try
        {
    this.Nome=nome;
    this.Nome_Produto=produto;
    this.Rua=rua;
    this.Numero_Casa=numerocasa;
    this.Cidade=cidade;
    this.Valor_Total=valortotal;
        }
        catch (Exception e)
        {
        }
}
}