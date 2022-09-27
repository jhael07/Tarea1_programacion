public class Ejercicio3 {
    public void loop() {
        int pares = 2;

        System.out.println("Numeros pares del 2 al 10");
        while (pares % 2 == 0 && pares <= 10) {
            System.out.println(pares);

            pares += 2;
        }
        System.out.println("\n");
    }
}
