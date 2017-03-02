/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegodedados;

/**
 *
 * @author labing506
 */
public class Principal {
    
    public static void main(String[] args){
        
        
        Dado miDado1=new Dado();
        Dado miDado2=new Dado();
        
        Tablero mitablero= new Tablero();
        mitablero.setVisible(true);
        
        mitablero.miDadoGrafico1=miDado1;
        mitablero.miDadoGrafico2=miDado2;
            
        
    }
  
    
}
