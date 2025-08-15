
package matematicalinguaportuguesa;

import java.util.Scanner;
import java.lang.Math;

public class VolumeCaixa {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do lado da caixa em metros: ");
        double lado = sc.nextDouble();
        
        double volume = Math.pow(lado, 3);
        int volumeArredondado = (int) Math.floor(volume);
        System.out.println("Volume da caixa d'água: " + volumeArredondado + " m³");
    }
}
