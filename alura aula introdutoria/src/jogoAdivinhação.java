import java.util.Random;
import java.util.Scanner;

public class jogoAdivinhação {
    public static void main(String[] args) {
        int numSec = new Random().nextInt(50);
        int rodadas = 0;
        int numJog = 0;
        System.out.println("Um número de 0 a 50 foi escolhido, tente adivinhar qual é, você tem 5 tentativas. ");

        while (rodadas < 5 || numSec == numJog) {
            rodadas++;
            Scanner leitura = new Scanner(System.in);
            numJog = leitura.nextInt();

            if (numJog < numSec) {
                System.out.println("0 número maior");
            } else if (numJog > numSec) {
                System.out.println("0 número menor");
            } else if (numSec == numJog) {
                System.out.println("Parabéns, você acertou");
                break;
            }
        }

        if (rodadas == 5 && numSec != numJog) {
            System.out.println("Você perdeu, o número era: ");
            System.out.println(numSec);
        }
    }
}
