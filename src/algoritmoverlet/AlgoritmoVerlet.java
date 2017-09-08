package algoritmoverlet;

import algoritmoverlet.qtdAtomos;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AlgoritmoVerlet {

    static qtdAtomos a1 = new qtdAtomos();
    static criacaoAtomos a2 = new criacaoAtomos();
    static MatrixDistancia a3 = new MatrixDistancia();
    static Etotal a5 = new Etotal();
    static potencialMultAtms a4 = new potencialMultAtms();
    static Aceleracao a6 = new Aceleracao();
    static Verlet a7 = new Verlet();

    public static void main(String[] args) {
        ArrayList<Velocidade> vel = new ArrayList<>();
        List<atomo> atm = a2.Catomos(a1.Natomos());

        for (int i = 0; i < atm.size(); i++) {
            Velocidade aux = new Velocidade();
            aux.vel[0] = 0.1;
            aux.vel[1] = 0.2;
            aux.vel[2] = 0.3;
            vel.add(aux);
        }

        //  a4.potencial(a3.calcDist(atm));
        //  a5.etotal(a4.potencial(a3.calcDist(atm)), atm);
        ArrayList<MatrizAcc> accAtual = a6.acc2(a3.calcDist3(atm), atm);
        for (int i = 0; i <= 1000; i++) {
            System.out.println("Passo numero: " + i);
            atm = a7.r(vel, accAtual, atm);
            ArrayList<MatrizAcc> accProx = a6.acc2(a3.calcDist3(atm), atm);
            vel = a7.v(vel, accAtual, accProx);
            accAtual = accProx;
        }

    }

}
