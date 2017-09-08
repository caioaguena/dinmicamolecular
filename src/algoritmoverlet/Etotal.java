
package algoritmoverlet;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Caio
 */
public class Etotal {
    public void etotal(double somaep,List<atomo> atm){
          double velmod = Math.pow(Math.sqrt(Math.pow(0.1, 2)+Math.pow(0.2, 2)+Math.pow(0.3, 2)),2);
          double massatotal = 0;
          for (atomo z : atm){
              massatotal = massatotal+z.massa;
          }
          double T= 0.5*(velmod*massatotal);
          double Etotal= T+somaep;
          System.out.println("Energia total: "+Etotal);
    }
}
