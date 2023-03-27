
import java.util.Scanner;
import java.util.Random;
public class Exercicios {
    public static void main(String[] args){
        System.out.println("Jogo de adivinhação");
        Random random = new Random();
        boolean acertou = false;
        int result = random.nextInt(100) + 1;
        Scanner myScanner = new Scanner(System.in);
        do {
            System.out.println("Jogo de adivinhação");
            int aposta = myScanner.nextInt();
            if (aposta > result) {
                System.out.println("Resultado é maior!");
            } else if (aposta < result) {
                System.out.println("Resultado é menor!");
            } else {
                acertou = true;
                System.out.println("Parabéns, você acertou!");
            }

        } while (!(acertou));
        System.out.println("Jogo encerrado");
        myScanner.close();

    }
}
