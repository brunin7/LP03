//Escreva um programa que vai ler 2 números, 
//o sistema vai escrever na tela todos os número entre os 2 digitados.


import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Questao03 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n1, n2;
        String str[] = new String[2];  
        System.out.println("Digite o Primeiro Número: ");
        str[0] = input.readLine();
        System.out.println("Digite o Segundo Número: ");
        str[1] = input.readLine();
        n1 = Integer.parseInt(str[0]);
        n2 = Integer.parseInt(str[1]);
        if(n1 < n2) {
         for(int i = n1; i <= n2; i++) {
          System.out.println(i);
         }
        } else if (n2 < n1) {
         for(int i = n2; i <= n1; i++) {
          System.out.println(i);  
         }
        } else {      
         System.out.println(n1);
         System.out.println(n2);      
        }      
       }
    }