
package algoritmoverlet;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Caio
 */
public class Etotal {
    public double somaT (List<atomo> atm, ArrayList<Velocidade> vel){
         double t=0,mv=0;
         int k=0;
         for(atomo at: atm){
             mv = Math.sqrt(Math.pow(vel.get(k).vel[0], 2)+Math.pow(vel.get(k).vel[1], 2)+Math.pow(vel.get(k).vel[2], 2));
             t = t + at.massa*Math.pow(mv, 2);
         }
         
         t = t/2;
         return t;
    }
}
