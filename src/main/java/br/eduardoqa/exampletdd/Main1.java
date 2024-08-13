package br.eduardoqa.exampletdd;

import java.util.Scanner;

public class Main1 {


    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        int soma = 0;
//
//
//        while (x != 0) {
//            soma += x;
//            x = sc.nextInt();
//        }
//        System.out.println("o valor da soma é: "+ soma);
//        sc.close();
//


    // FOR (Ele repete um bloc de comandos para um certo intervalo de valores)



        //inicio: somente a primeira vez; condição: enquanto for V ele repete o comando; incremento: executa todas vez depois de voltar



        //ex: for (inicio; condição; incremento){
        //          comando 1
        //          comando 2
        //          }
        Scanner sc1 = new Scanner(System.in);


        int N = sc1.nextInt();
        int soma2 = 0;

        for (int i=0; i<=N; i++) {
              int x = sc1.nextInt();
              soma2 = soma2 + x;
             }
        System.out.println("a SOMA é : " + soma2);
        sc1.close();



    }




}