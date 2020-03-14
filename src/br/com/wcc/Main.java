package br.com.wcc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        String  op;
        SomaInteiro somaInt = new SomaInteiro();
        Float somaFloat = new Float();
        Double somaDouble = new Double();
        Tabuada resultado = new Tabuada();

        System.out.println("Qual é o tipo de variavel ? \n 1-Int \n 2-Float \n 3-Double \n 4- Tabuada");
        op=entrada.nextLine();

        switch (op){
            case "Int":
            System.out.println("N1:");
             int i1= entrada.nextInt();
             System.out.println("N2: ");
             int i2= entrada.nextInt();
             somaInt.setInteiro(i1,i2);
             System.out.println(somaInt.Soma());
             break;

            case "Float":
                System.out.println("F1:");
                float f1= entrada.nextFloat();
                System.out.println("F2: ");
                float f2= entrada.nextFloat();

                somaFloat.setFloat(f1,f2);
                System.out.println("Soma: " + somaFloat.Soma());
                break;
            case "Double":
                System.out.println("D1: ");
                double d1=entrada.nextDouble();
                System.out.println("D2");
                double d2= entrada.nextDouble();

                somaDouble.setDouble(d1,d2);
                System.out.println(somaDouble.Soma());
            break;

            case "Tabuada":
                System.out.println("T:");
                 int t=entrada.nextInt();
                System.out.println(resultado.Tabuada(t));


            break;
            default:
                System.out.println("Escrita Incorreta");
        }
    }
}
