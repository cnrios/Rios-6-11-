import java.util.Scanner;


public class suma
{

    public static void main(String[] args)
    {

        int n1, n2, Suma;

        Scanner teclado = new Scanner( System.in );

        System.out.print("numero:");
        n1= teclado.nextInt();

        System.out.print("numero:");
        n2 = teclado.nextInt();

        Suma = n1 + n2;


        System.out.prrintln("La suma de" +n1+" + "+n2+ ".");
    }
}
