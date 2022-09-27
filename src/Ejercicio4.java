public class Ejercicio4 {
    public void loop() {
        int x = 0, y = 1, z = 0;

        System.out.println("Suma de numeros del 1 al 20");
        for (int i = 0; i <= 18; i++) {
            x += 1;
            y += 1;
            z = y;

            System.out.println(x + " + " + (z) + " = " + (x + z));
            x = (x + y) - 1;
        }
        System.out.println("\n");
    }

}
