public class Ejercicio5 {
    public void loop() {

        int tabla = 2;
        System.out.println("Las tablas de multiplicar del 2 al 10");
        for (int x = 1; x < 10; x++) {
            System.out.println("Tabla del " + (x + 1));
            for (int i = 1; i <= 12; i++) {
                System.out.println(tabla * i);
            }
            System.out.println("\n");

            tabla += 1;
        }
    }
}
