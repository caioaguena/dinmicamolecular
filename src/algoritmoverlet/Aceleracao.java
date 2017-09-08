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
public class Aceleracao {

    public ArrayList<MatrizAcc> acc(ArrayList<MatrizPotencialSomado> m, List<atomo> atm) {
        int k = 0;
        ArrayList<MatrizAcc> acc = new ArrayList<>();
        for (atomo y : atm) {
            double d = y.massa;
            MatrizAcc ace = new MatrizAcc();
            for (int i = k; i == k; i++) {
                for (int l = 0; l < 3; l++) {
                    double acel = m.get(i).posicao[l] / d;
                    switch (l) {
                        case 0:
                            ace.acc[0] = acel;
                            break;
                        case 1:
                            ace.acc[1] = acel;
                            break;
                        case 2:
                            ace.acc[2] = acel;
                            break;
                    }
                }
            }
            acc.add(ace);
            k++;
        }
        System.out.println("" + acc);
        return acc;
    }

    public ArrayList<MatrizAcc> acc2(ArrayList<ArrayList<distanciaAtomos>> m, List<atomo> atm) {
        int cont=0;
        ArrayList<MatrizAcc> acc = new ArrayList<>();
        for (ArrayList<distanciaAtomos> latm : m) {
            
            double x = 0, y = 0, z = 0;
            for (distanciaAtomos datm : latm) {
                for (int i = 0; i < 3; i++) {
                    if (datm.posicao[i] != 0) {
                        switch (i) {
                            case 0:
                                x = x + (datm.posicao[i] / atm.get(cont).massa);
                                break;
                            case 1:
                                y = y + (datm.posicao[i] / atm.get(cont).massa);
                                break;
                            case 2:
                                z = z + (datm.posicao[i] / atm.get(cont).massa);
                                break;
                        }
                    }
                }
            }

            cont++;
            MatrizAcc macc = new MatrizAcc();
            macc.acc[0]=x;macc.acc[1]=y;macc.acc[2]=z;
            acc.add(macc);
        }

       // System.out.println(acc);
        return acc;
    }
}
