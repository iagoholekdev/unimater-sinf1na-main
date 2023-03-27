import java.util.Scanner;
public class MediaSimples {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int count = 0;
        double sum = 0;
        double number;
        boolean continua;
        do {
            System.out.println("Informe um número: ");
            number = myScanner.nextDouble();
            continua = number >= 0;
            if (continua) {
                count++;
                sum = sum + number;
            }
        } while (continua);
        double media = sum / count;
        System.out.printf("A média %2f e %d é igual a: %2f", sum, count, media);
        myScanner.close();
    }
}
