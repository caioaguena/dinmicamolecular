
package algoritmoverlet;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Caio
 */
public class MatrixDistancia {

    public ArrayList<ArrayList<Double>> calcDist(List<atomo> atm) {
        ArrayList<ArrayList<Double>> distancia = new ArrayList<>();
        for (atomo x1 : atm) {
            ArrayList<Double> distancia2 = new ArrayList<>();
            for (atomo x2 : atm) {
                double modulo = Math.sqrt(Math.pow(x2.posicao[0] - x1.posicao[0], 2) + Math.pow(x2.posicao[1] - x1.posicao[1], 2) + Math.pow(x2.posicao[2] - x1.posicao[2], 2));
                distancia2.add(modulo);
            }
            distancia.add(distancia2);
        }
       // System.out.println(distancia);
        return distancia;
    }

    //retorna x,y e z
    public ArrayList<ArrayList<distanciaAtomos>> calcDist2(List<atomo> atm) {
        ArrayList<ArrayList<distanciaAtomos>> distanciaXYZ = new ArrayList<>();
        double sigma = 0.3345, epsilon = 0.0661;
        for (atomo at1 : atm) {
            ArrayList<distanciaAtomos> distanciaTemp = new ArrayList<>();
            for (atomo at2 : atm) {
                distanciaAtomos dist = new distanciaAtomos();
                dist.posicao[0] = at2.posicao[0] - at1.posicao[0];

                dist.posicao[1] = at2.posicao[1] - at1.posicao[1];

                dist.posicao[2] = at2.posicao[2] - at1.posicao[2];

                distanciaTemp.add(dist);
            }
            distanciaXYZ.add(distanciaTemp);
        }

        for (ArrayList<distanciaAtomos> o : distanciaXYZ) {
            System.out.print(o);
            System.out.println("");
        }

        return distanciaXYZ;
    }

    //retorna o dv/dx na vdd
    public ArrayList<ArrayList<distanciaAtomos>> calcDist3(List<atomo> atm) {
        ArrayList<ArrayList<distanciaAtomos>> distanciaXYZ = new ArrayList<>();
        double sigma = 0.3345, epsilon = 0.0661;
        for (atomo at1 : atm) {
            ArrayList<distanciaAtomos> distanciaTemp = new ArrayList<>();
            for (atomo at2 : atm) {
                distanciaAtomos dist = new distanciaAtomos();
                distanciaAtomos dist2 = new distanciaAtomos();
                dist.posicao[0] = at2.posicao[0] - at1.posicao[0];
                dist.posicao[1] = at2.posicao[1] - at1.posicao[1];
                dist.posicao[2] = at2.posicao[2] - at1.posicao[2];
                if (dist.posicao[0] != 0) {
                    dist2.posicao[0] = (4721523 * Math.abs(dist.posicao[0])) / ((2500000 * (Math.pow(sigma, 2))) * Math.sqrt(Math.pow(Math.abs(dist.posicao[0]), 2) + Math.pow(Math.abs(dist.posicao[1]), 2) + Math.pow(Math.abs(dist.posicao[2]), 2)));
                }
                
                if (dist.posicao[1] != 0) {
                    dist2.posicao[1] = (4721523 * Math.abs(dist.posicao[1])) / ((2500000 * (Math.pow(sigma, 2))) * Math.sqrt(Math.pow(Math.abs(dist.posicao[0]), 2) + Math.pow(Math.abs(dist.posicao[1]), 2) + Math.pow(Math.abs(dist.posicao[2]), 2)));
                }
                dist.posicao[2] = at2.posicao[2] - at1.posicao[2];
                if (dist.posicao[2] != 0) {
                    dist2.posicao[2] = (4721523 * Math.abs(dist.posicao[2])) / ((2500000 * (Math.pow(sigma, 2))) * Math.sqrt(Math.pow(Math.abs(dist.posicao[0]), 2) + Math.pow(Math.abs(dist.posicao[1]), 2) + Math.pow(Math.abs(dist.posicao[2]), 2)));
                }
                
                distanciaTemp.add(dist2);
            }
            distanciaXYZ.add(distanciaTemp);
        }
//        System.out.println("dv/dx de um atomo para outro");
//        for (ArrayList<distanciaAtomos> o : distanciaXYZ) {
//            System.out.print(o);
//            System.out.println("");
//        }

        return distanciaXYZ;
    }
}
