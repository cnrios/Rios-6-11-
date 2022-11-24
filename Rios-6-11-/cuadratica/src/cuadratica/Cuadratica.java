package cuadratica;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nullable;

import java.lang.constant.Constable;

public class Cuadratica {

   public int suma(int Num1, int Num2) {
      return Num1 + Num2;
   }

   public int resta(int Num1,    int Num2) {
      return Num1 - Num2;
   }

   public int multi(int Num1, int Num2) {
      return Num1 * Num2;
   }

   public Constable div(int Num1, int Num2) {
      if (Num2 == 0) {
         return null;
      } else {
         int result = Num1 / Num2;
         return result;
      }
   }

   public static double @Nullable [] cuadra(double a, double b, double c) {
      double b2 = b * b;
      double cuentaI = b2 - (4 * a * c);
      double raiz = (double) Math.sqrt(cuentaI);

      double cuenta = (double )raiz;


      double verificacion = cuenta;

      if (verificacion % 2 == 0){
         double SP = ((-b + raiz) / 2 * a);
         double RP = ((-b - raiz) / 2 * a);

         double result[] = {SP, RP};
         return result;

      }
      return null;
   }
}

