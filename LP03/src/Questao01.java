//Escreva um programa que vai ler um número, 
//o sistema vai escrever na tela a tabuada de 1 até 10 do número digitado.

import java.util.Scanner;

public class Questao01 {

    public static void main(String[] args) {
        int num ;
        Scanner ler = new Scanner (System.in);
        System.out.println ("Informe o Número para o Cálculo");
        num = ler.nextInt();
        for (int i=1; i<= 10; i++) {
            System.out.println(num + " x " + i + " = "+ (num*i));
        }
        ler.close();
    }   
}

    

