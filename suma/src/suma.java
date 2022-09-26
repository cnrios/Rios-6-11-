import java.util.Scanner;


public class suma
{

    public static void main(String[] args)
    {

        int n1, n2, Suma, Resta, Multiplicacion, Division;

        Scanner teclado = new Scanner( System.in );

        System.out.print("numero:");
        n1= teclado.nextInt();

        System.out.print("numero:");
        n2 = teclado.nextInt();

        
        Suma = n1 + n2;

        System.out.println("La suma de " +n1+" + "+n2+ " = " +Suma);

        Resta = n1 - n2;

        System.out.println("La Resta de " +n1+ " - " +n2+ " = " +Resta);
        
        Multiplicacion = n1 * n2;
        
        System.out.println("La Multiplicacion de " +n1+ " * " +n2+ " = " +Multiplicacion);
        
        Division = n1 / n2;
        
        System.out.println("La Division de " +n1+ " / " +n2+ " = " +Division);
        


    }
}
