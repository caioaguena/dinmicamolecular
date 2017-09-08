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
public class MatrizAcc {
     double[] acc = new double[3];
    
     @Override
   public String toString() {
        return ("Aceleração(x,y,z): "+ Arrays.toString(acc)+"\n");
   }
}
