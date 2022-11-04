package cuadratica;

public class Cuadratica {

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

