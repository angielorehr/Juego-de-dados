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
public class Jugador {
    
   int valor;
   int dadito;
   int billetera;

    public int getDadito() {
        return dadito;
    }

    public void setDadito(int dadito) {
        this.dadito = dadito;
        valor=dadito;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }

    public double lanzar(){
    billetera= 100000;
       return 0;
    }

     
    
}
