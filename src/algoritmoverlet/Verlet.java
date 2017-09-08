/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmoverlet;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Caio
 */
public class Verlet {
    
    public List<atomo> r(ArrayList<Velocidade> v,ArrayList<MatrizAcc> mc, List<atomo> atm ){
        double dt=0.1;int k=0;
        List<atomo> newAtomo = new ArrayList<>();
        for(atomo atmA : atm){
            double m = atmA.massa;
            
            atmA.posicao[0]= atmA.posicao[0]+v.get(k).vel[0]*0.1 + mc.get(k).acc[0]*(Math.pow(0.1, 2)/2);
            atmA.posicao[1]= atmA.posicao[1]+v.get(k).vel[1]*0.1 + mc.get(k).acc[1]*(Math.pow(0.1, 2)/2);
            atmA.posicao[2]= atmA.posicao[2]+v.get(k).vel[2]*0.1 + mc.get(k).acc[2]*(Math.pow(0.1, 2)/2);
            
           
            k++;
            newAtomo.add(atmA);
        }
        System.out.println(newAtomo);
        return newAtomo;
    }
    
    public ArrayList<Velocidade> v (ArrayList<Velocidade> velat,ArrayList<MatrizAcc> accAt, ArrayList<MatrizAcc> accProx){
        ArrayList<Velocidade> newVel = new ArrayList<>();
        int c=0;
        for (Velocidade v : velat){
            
            v.vel[0] = v.vel[0] + 0.5*(accAt.get(c).acc[0]+accProx.get(c).acc[0])*0.1;
            v.vel[1] = v.vel[1] + 0.5*(accAt.get(c).acc[1]+accProx.get(c).acc[1])*0.1;
            v.vel[2] = v.vel[2] + 0.5*(accAt.get(c).acc[2]+accProx.get(c).acc[2])*0.1;
            c++;
            newVel.add(v);
        }
        
       // System.out.println(newVel);
        return newVel;
    }
    
    
}
