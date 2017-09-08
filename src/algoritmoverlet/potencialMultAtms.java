package algoritmoverlet;
//l
import java.util.ArrayList;

public class potencialMultAtms {

    public double potencial(ArrayList<ArrayList<Double>> distancia) {
        double somaep = 0;
        int k = 0;
        double sigma = 0.3345, epsilon = 0.0661;
        for (ArrayList<Double> z : distancia) {
            for (int i = k; i < z.size(); i++) {
                if (z.get(i) != 0) {
                    double V = 4 * epsilon * (Math.pow((sigma / z.get(i)), 12) - Math.pow((sigma / z.get(i)), 6));
                    somaep = somaep + V;
                }
            }
            k++;
        }
        System.out.println("Energia potencial total: " + somaep);
        return somaep;
    }

    public ArrayList<MatrizPotencialSomado> potencialMatriz(ArrayList<ArrayList<distanciaAtomos>> distancia) {
        ArrayList<MatrizPotencialSomado> aaa = new ArrayList<>();
        double sigma = 0.3345, epsilon = 0.0661;
        double x=0,y=0,z=0;
        for (ArrayList<distanciaAtomos> o : distancia) {
            x=0;y=0;z=0;
            
            for (distanciaAtomos oo : o) {
                for (int i = 0; i < 3; i++) {                    
                    if (oo.posicao[i] != 0) {
                        switch(i){          
                            case 0:x =x+ (4721523*oo.posicao[0])/( 2500000*Math.pow(sigma, 2)*Math.sqrt(Math.pow(oo.posicao[0], 2)+Math.pow(oo.posicao[1], 2)+Math.pow(oo.posicao[2], 2))  )  ;break;
                            case 1:y =y+ (4721523*oo.posicao[1])/( 2500000*Math.pow(sigma, 2)*Math.sqrt(Math.pow(oo.posicao[0], 2)+Math.pow(oo.posicao[1], 2)+Math.pow(oo.posicao[2], 2))  ) ;break;
                            case 2:z =z+ (4721523*oo.posicao[2])/( 2500000*Math.pow(sigma, 2)*Math.sqrt(Math.pow(oo.posicao[0], 2)+Math.pow(oo.posicao[1], 2)+Math.pow(oo.posicao[2], 2))  ) ;break;
                        }
                    }

                }
            }
            
            MatrizPotencialSomado ms = new MatrizPotencialSomado();
            ms.posicao[0]=x; ms.posicao[1]=y; ms.posicao[2]=z;
            aaa.add(ms);
        }
        System.out.println(aaa);
        return aaa;
    }

}
