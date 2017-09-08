
package algoritmoverlet;

import java.util.Scanner;

/**
 *
 * @author Caio
 */
public class qtdAtomos {

    public int Natomos() {
        int Natomos = 0;
        System.out.println("Selecione o numero de atomos:");
        Scanner sc2 = new Scanner(System.in);
        Natomos = sc2.nextInt();
        return Natomos;
    }
}
