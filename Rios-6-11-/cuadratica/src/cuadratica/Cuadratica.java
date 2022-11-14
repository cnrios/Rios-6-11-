package cuadratica;

public class Cuadratica {

   public int suma( int Num1,  int Num2){
      return  Num1 + Num2;
   }

   public int resta( int Num1,  int Num2){
      return  Num1 - Num2;
   }

   public int multi( int Num1,  int Num2){
      return  Num1 * Num2;
   }

   public int div( int Num1,  int Num2){
      return  Num1 / Num2;
   }

   public static double[] cuadra(double a, double b, double c){
      double b2 = b * b;
      double cuentaI= b2 - (4*a*c);
      double raiz = (double) Math.sqrt(cuentaI);

      double SP = ((-b + raiz) / 2*a);
      double RP = ((-b - raiz) / 2*a);

      double result[]= {SP, RP};
      return result;

   }
}

