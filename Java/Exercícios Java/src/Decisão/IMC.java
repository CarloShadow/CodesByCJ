package Decisão;

import java.util.Scanner;

public class IMC {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double peso;
        double altura;
        double resultado;

        System.out.print("Digite o seu peso: ");
        peso = input.nextDouble();

        System.out.print("Digite a sua altura: ");
        altura = input.nextDouble();

        resultado = peso/(altura*altura);

        System.out.println("IMC: " + resultado);

        if(resultado < 18.5){
            System.out.println("Abaixo do peso");

        }else if(resultado >= 18.6 && resultado <= 24.9) {
            System.out.println("Saudável");
        }else if(resultado >= 25 && resultado <= 29.9){
            System.out.println("Peso em excesso");
        }else if(resultado >= 30 && resultado <= 34.9){
            System.out.println("Obesidade Grau I");
        }else if(resultado >= 35 && resultado <= 39.9){
            System.out.println("Obesidade Grau II(severa)");
        }else{
            System.out.println("Obesidade Grau III(mórbida)");
        }
        }
    }

