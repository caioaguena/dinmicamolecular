
package algoritmoverlet;

import java.util.Scanner;

/**
 *
 * @author Caio
 */
public class PontencialLennardJones {

    public void calc() {
        //Potecial de Lennar-Jones
        double sigma = 0.3345, epsilon = 0.0661;
        System.out.println("Selecione a distancia inter-atomica:");
        Scanner sc = new Scanner(System.in);
        double dist = sc.nextDouble();
        double V = 4 * epsilon * (Math.pow((sigma / dist), 12) - Math.pow((sigma / dist), 6));
        System.out.println("V = " + V);

    }
}
