package cuadratica;

public class Cuadratica {

   public static float[] cuadra(float a,float b, float c){
      float b2 = b * b;
      float cuentaI= b2 - (4* a * c);
      float raiz = (float) Math.sqrt(cuentaI);

      float SP = ((-b)+ raiz) / a * 2;
      float RP = ((-b)- raiz) / a * 2;

      float[] result= {SP, RP};
      return result;

   }
}

