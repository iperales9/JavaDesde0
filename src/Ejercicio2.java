import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        // Ejercicio 1
            /*
            Crea un programa que te pida una cantidad en miligramos para una poción
            multijugos, el valor debe ser de tipo entero, si el valor es mayor a 100 imprime
            “¡Felicidades, es una buena poción!”, de lo contrario imprime “La poción es
            mediocre, sangre sucia inmunda
            */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa la cantidad en miligramos para una poción multijugos: ");
        int cantidad = scanner.nextInt();
        if (cantidad > 100) {
            System.out.println("¡Felicidades, es una buena poción!");
        } else {
            System.out.println("La poción es mediocre, sangre sucia inmunda");
        }

        // Ejercicio 2
            /*
            Escribe un programa que te diga si un carro de Uber puede iniciar su recorrido, para
            esto se necesitan dos cosas, que el conductor esté cerca y que esté disponible, el
            programa te pedirá dos valores, la distancia del conductor en kilómetros y su
            disponibilidad, donde false = no disponible y true = disponible, según los datos que
            insertes imprime lo siguiente:
            ➢ Si la distancia es menor o igual a 0.5 km y el conductor está disponible,
            imprime “Listo para iniciar recorrido”
            ➢ Si la distancia es menor o igual a 0.5 km y el conductor NO está disponible,
            imprime, “Conductor cercano, pero no disponible”
            ➢ Si la distancia es mayor a 0.5 km y el conductor está disponible, imprime,
            “Conductor disponible pero muy lejos, aplicarán tarifas más altas”
            ➢ Si la distancia es mayor a 0.5 km y el conductor NO está disponible, imprime,
            “No hay conductores disponibles”
            ➢ Usa if-else para esto
            ➢ Para negar una validación debes usar el símbolo !, por ejemplo if
            (!isAvailable)
            ➢ No olvides imprimir las instrucciones antes de pedir las variables de entrada
            */

        System.out.println("Ingresa la distancia del conductor en kilómetros: ");
        double distancia = scanner.nextDouble();
        System.out.println("¿El conductor está disponible? (true/false): ");
        boolean disponible = scanner.nextBoolean();

        if (distancia <= 0.5 && disponible) {
            System.out.println("Listo para iniciar recorrido");
        } else if (distancia <= 0.5 && !disponible) {
            System.out.println("Conductor cercano, pero no disponible");
        } else if (distancia > 0.5 && disponible) {
            System.out.println("Conductor disponible pero muy lejos, aplicarán tarifas más altas");
        } else {
            System.out.println("No hay conductores disponibles");
        }

        // Ejercicio 3
        /*
        Haz un ciclo for y while que obtenga la sumatoria de los números hasta n, ejemplo,
        para 5 debes obtener 15 (1+2+3+4+5), para 3 debes obtener 6. Imprime el resultado
        así: “La suma es 15” usando formatos de String
        */

        System.out.println("Ingresa un número entero: ");
        int n = scanner.nextInt();
        int sumatoria = 0;
        for (int i = 1; i <= n; i++) {
            sumatoria += i;
        }
        System.out.printf("La suma es %d\n", sumatoria);

        // Ejercicio 4
        /*
        Escribe un programa que imprima “¿Cómo es el clima de hoy?”, dependiendo del
        número que insertes te imprima los siguientes valores
        ➢ 1 = “Soleado”
        ➢ 2 = “Nublado”
        ➢ 3 = “Lluvioso”
        ➢ 4 = “Tormentoso”
        ➢ 5 = “Nevado”
        Si insertas cualquier otro valor debe imprimir “Pregúntale a Google”
        Recomendación: Usa Switch.
        */

        System.out.println("¿Cómo es el clima de hoy? (1-5): ");
        int clima = scanner.nextInt();
        switch (clima) {
            case 1:
                System.out.println("Soleado");
                break;
            case 2:
                System.out.println("Nublado");
                break;
            case 3:
                System.out.println("Lluvioso");
                break;
            case 4:
                System.out.println("Tormentoso");
                break;
            case 5:
                System.out.println("Nevado");
                break;
            default:
                System.out.println("Pregúntale a Google");
        }

        // Ejericio 5

        /*
        Para un Arreglo de String de títulos de películas, imprime el título de la película con
        el título más largo. Por ejemplo si tenemos un arreglo con los valores:
        {“Jumanji”, “Toy Story”, “Pulp Fiction”, “Batman: El caballero de la noche”, “Kill Bill”}
        Debería imprimir “Batman: El caballero de la noche”.
        RETO OPCIONAL: Imprime el índice del título más largo, para el ejemplo anterior,
        debería imprimir el 3, porque es el índice de “Batman: El caballero de la noche”
        */

        String [] peliculas = {"Jumanji", "Toy Story", "Pulp Fiction", "Batman: El caballero de la noche", "Kill Bill"};

        int indice = 0;
        int max = 0;
        for (int i = 0; i < peliculas.length; i++) {
            if (peliculas[i].length() > max) {
                max = peliculas[i].length();
                indice = i;
            }
        }
        System.out.println(peliculas[indice]);

        // Ejercicio 6

        /*
        EJERCICIO RETO SUPER SAYAYÍN: Escribe un programa que para un número N,
        imprima los números pares desde 1 hasta N, por ejemplo si N = 6, debe imprimir “2,
        4, 6”. Hazlo con un for o un while. Si el número es menor o igual a 0, debes imprimir
        “Inserta un número positivo”
        TIP: Para saber si un número es par, debes obtener el residuo de ese número al ser
        dividido entre 2, si el residuo es 0, entonces el número es par. Por ejemplo si quieres
        saber si 4 es par, divides 4/2 = 2 y te sobran 0, entonces 4 es par, en cambio para
        5/2 = 2 y sobra 1, entonces es impar, para obtener el residuo de una división en Java
        puedes utilizar %, ejemplo: 4 % 2 = 0 y 5 % 2 = 1
        */

        System.out.println("Ingresa un número entero: ");
        int N = scanner.nextInt();
        if (N <= 0) {
            System.out.println("Inserta un número positivo");
        } else {
            for (int i = 1; i <= N; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + ", ");
                }
            }
        }

    }
}
