
package matematicalinguaportuguesa;

import java.util.Scanner;
import java.lang.Math;

public class Desconto {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o valor da venda: ");
        double valor = sc.nextDouble();
        System.out.print("Informe o percentual de desconto: ");
        double desconto = sc.nextDouble();
        
        double valorFinal = valor - (valor * desconto / 100);
        valorFinal = Math.floor(valorFinal);
        System.out.println("Valor final com desconto: " + (int)valorFinal);
    }
}
