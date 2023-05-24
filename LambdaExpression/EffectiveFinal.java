package LambdaExpression;

public class EffectiveFinal {

    static int num = 1; // // global variable have final or not , when access in anonymous inner class , this is not necessary to final
    public static void main(String[] args) {
        // final int num = 1; // local variable have final or not , when access in anonymous inner class, this is alway final

        Runnable runnable = new Runnable()  {
            public void run() {
                System.out.println(num); // 1 // 12
            }
        };

        num = 12;

        runnable.run();

    }
}
