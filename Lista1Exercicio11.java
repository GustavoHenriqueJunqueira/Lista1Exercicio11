package lista1exercicio11;

import java.util.Scanner;

public class Lista1Exercicio11 {

    public static void main(String[] args) {
        
        System.out.println("Programa para calcular a quantidade de tijolos para uma parede");
        
        float QTD, CT, LT, TMT , CP,LP, TMP;
        
        System.out.println("Digite as medidas do tijolo começando por COMPRIMENTO: ");
        Scanner teclado =new Scanner(System.in);
        CT = teclado.nextFloat();
        System.out.println("Agora digite a largura do tijolo: ");
        LT = teclado.nextFloat();
        
        TMT = CT*LT;
        
        System.out.println("O tamanho do tijolo em centimetros é de: " +TMT);
        System.out.println("Agora digite o COMPRIMENTO da parede: ");
        CP = teclado.nextFloat();
        System.out.println("Entre agora com a medida da largura da parede:");
        LP = teclado.nextFloat();
        
        TMP = CP * LP;
        
        System.out.println("O tamanho da parede é de: " + TMP);
        
        QTD = TMP/TMT;
        
        System.out.println("A quantidade de tijolos para subir toda a parede vai ser necessario: " +QTD);
       
    }
    
}
