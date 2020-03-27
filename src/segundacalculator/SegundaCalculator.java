/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundacalculator;

import java.io.IOException;
import segundacalculator.Apresetacao.FrmAlmoxerifado;
import segundacalculator.Apresetacao.FrmPrincipal;

/**
 *
 * @author Dell-9BQM7S1
 */
public class SegundaCalculator
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException
    {
        FrmPrincipal Frmp=new FrmPrincipal();
        Frmp.setVisible(true);
        FrmAlmoxerifado FrmA= new FrmAlmoxerifado();
        FrmA.setVisible(true);
        
    }
    
}
