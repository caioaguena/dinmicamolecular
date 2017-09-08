
package algoritmoverlet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Caio
 */
public class criacaoAtomos {
    public List<atomo> Catomos(int x) {
         List<atomo> atm = new ArrayList<>();
         for (int i = 1; i <= x; i++) {
            System.out.println("Insira a massa do atomo:");
            Scanner sc3 = new Scanner(System.in);
            double massa = sc3.nextDouble();
            System.out.println("Insira a posição do atomo:");
            Scanner sc4 = new Scanner(System.in);
            double[] pos = new double[3];
            for (int j = 0; j < pos.length;) {
                pos[j] = sc4.nextDouble();
                j++;
            }
            atomo novoatomo = new atomo();
            novoatomo.massa = massa;
            novoatomo.posicao = pos;
            atm.add(novoatomo);
        }
        System.out.println(atm);
        return atm;
    }
}
