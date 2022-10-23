//Escreva um programa que vai ler a idade de 5 pessoas, 
//o sistema vai mostrar quantas são maior ou iguais a 18 e quantas são de menor.

import java.util.Scanner;

public class Questao05 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in) ;
        float[] idade = new float[5];        
        for(int i =0;i<idade.length;i++){        
        System.out.printf("Insira o %d° peso: ", i+1);       
        idade[i] = sc.nextFloat();       
        }
        for(int i =0;i<idade.length;i++){ 
        for(int j =0;j<idade.length;j++){
        float t = idade[i]; 
        idade[i] = idade[j]; 
        idade[j] = t;
        }
        }
        }
        System.out.printf("Min: %.2f", idade[0]);
        System.out.printf("\nMax: %.2f", idade[idade.length-1]);
        }
        
}
