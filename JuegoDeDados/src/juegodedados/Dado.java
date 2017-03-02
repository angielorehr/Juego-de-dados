/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegodedados;

import java.util.Random;

/**
 *
 * @author labing506
 */
public class Dado {
    
    int valor;
    
    Random aleatorio= new Random();
   public void lanzar(){
        valor=aleatorio.nextInt(6)+1;
    }
}
