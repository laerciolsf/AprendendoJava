public class RegraDe3Simples {
    public float res =0;

    public void calcular(float a1, float a2, float b1, String b2){
         res = (a1*a2)/b1;
         System.out.println(res);
    };
    public void calcular(float a1, float a2, String b1, float b2){
        res = (a1*a2)/b2;
        System.out.println(res);
    };
}
