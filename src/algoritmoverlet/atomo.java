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
public class atomo {
    double massa;
    double[] posicao = new double[3];

    public double getMassa() {
        return massa;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public double[] getPosicao() {
        return posicao;
    }

    public void setPosicao(double[] posicao) {
        this.posicao = posicao;
    }
    
      @Override
   public String toString() {
        return ("Massa: "+ massa+" Posição: "+ Arrays.toString(posicao)+"\n");
   }
}
