// Soma a média das notas com cada peso e mostra, média e se o aluno foi aprovado ou não

package Decisão;

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double trabalholab;
        double avlisemestral;
        double examefinal;
        double Media;

        for (int i = 0; i < 5; i++){
            System.out.print("Informe a nota do trabalho de laboratório: ");
            trabalholab = entrada.nextDouble();

            System.out.print("Informe a nota da avaliação semestral: ");
            avlisemestral = entrada.nextDouble();

            System.out.print("Informe a nota do exame final: ");
            examefinal = entrada.nextDouble();

            Media = ((trabalholab * 5) + (avlisemestral * 3.3) + (examefinal* 2)) / 3;

            if (Media >= 2 && Media <= 2.9) {
                System.out.println("Aluno reprovado");
            } else if (Media >= 3 && Media <= 4.9) {
                System.out.println("Aluno de recuperção");
            } else {
                System.out.println("Aluno aprovado");
            }
            System.out.println("Média: " + Media);

        }
        entrada.close();
    }
}
