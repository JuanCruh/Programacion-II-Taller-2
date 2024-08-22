import Clases.Notas;

import java.util.Scanner;

public class EjecutarNotas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Notas notas = new Notas();

        for (int i = 0; i <= 14; i ++) {
            System.out.println("Ingrese la nota #"+i);
            notas.insertar(i,scanner.nextDouble());
        }

        System.out.println("La nota mayor es: "+notas.calcMayor());
        System.out.println("La nota menor es: "+notas.calcMenor());
        System.out.println("El promedio de las notas es: "+notas.calPromedio());
        System.out.println("El procentaje de estudaintes con una nota igual o mayor a 3.0 es: "+notas.calPorcentaje());

    }
}
