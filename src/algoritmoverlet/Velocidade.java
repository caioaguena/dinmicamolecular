/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmoverlet;

import java.util.Arrays;

/**
 *
 * @author Caio
 */
public class Velocidade {
    double[] vel = new double[3];
    
     @Override
   public String toString() {
        return ("Velocidade(x,y,z): "+ Arrays.toString(vel)+"\n");
   }
}
