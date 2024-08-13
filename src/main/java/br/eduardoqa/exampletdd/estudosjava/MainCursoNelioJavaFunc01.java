package br.eduardoqa.exampletdd.estudosjava;

import java.util.Scanner;

public class MainCursoNelioJavaFunc01 {


    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);


            System.out.println("enter if tree numbers please: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();


            if(a > b && a > c){

            System.out.println("o Maior Numero é o A:  " + a);

            } else if (b > c) {
                    System.out.println("não é o maior numero:");


            }else {

                    System.out.println("");

            }

            sc.close();

    }

}
