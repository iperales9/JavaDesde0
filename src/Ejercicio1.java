public class Ejercicio1 {
    public static void main(String[] args) {


        // Ejericio 1
        /*
        Supongamos que un cubo rectangular tiene las dimensiones: largo=15, ancho=23,
        alto=12. Obtén su volumen.
        */
        int largo = 15;
        int ancho = 23;
        int alto = 12;

        int voluen = largo * ancho * alto;
        System.out.println("El volumen de la caja es: " + voluen);

        // Ejericio 2
        /*
        Obtén la energía cinética si la masa es m = 12 kg y la velocidad es v = 3 m/s,
        imprime el resultado con solo 2 decimales
        */

        double m = 12;
        double v = 3;
        double energiaCinetica = 0.5 * m * Math.pow(v, 2);
        System.out.printf("La energía cinética es: %.2f\n", energiaCinetica);

        // Ejericio 3
        /*
        ¿Qué tipos variables utilizarías para los siguiente valores? Ejemplo: Si tenemos 1
        usamos una variable de tipo int.
        */
        char c = 'R';
        long numero = 1495970192837664L;
        double decimal = 12.5;
        boolean verdad = true;
        int integer = 90;
        String string = "No tengo trono ni reina, ni nadie que me comprenda, pero sigo siendo el rey";
        double num = 6.626070040;

        // Ejericio 4
        /*
        Supongamos que promueves tu empresa en Google y debes calcular el costo
        promedio para 180 clics, donde los clics tienen los siguientes costos

        60 clics = $0.30 cada uno
        100 clics = $0.25 cada uno
        20 clics = $0.80 cada uno
        Imprime el costo promedio que tendrás. Puedes encontrar la definición de costo
        promedio aquí:

        https://support.google.com/google-ads/answer/14074?hl=es-419

         */

        int clics60 = 60;
        int clics100 = 100;
        int clics20 = 20;

        double costo60 = 0.30;
        double costo100 = 0.25;
        double costo20 = 0.80;

        double costoPromedio = (clics60 * costo60)+(clics100 * costo100)+(clics20 * costo20);
        double costoPromedioMasIVA = costoPromedio * 1.16;

        System.out.println("El costo promedio es: " + costoPromedioMasIVA);

    }

}
