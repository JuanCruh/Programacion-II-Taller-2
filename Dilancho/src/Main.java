import Clases.OPERACIONES;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        OPERACIONES operaciones = new OPERACIONES();
        int operacion;

        System.out.println("Ingrese el primer dato");
        operaciones.setNum1(teclado.nextInt());

        System.out.println("Ingrese el segundo dato");
        operaciones.setNum2(teclado.nextInt());

        System.out.println("Escoja una operación");
        System.out.println("1.Suma");
        System.out.println("2.Resta");
        System.out.println("3.Multiplicación");
        operacion = teclado.nextInt();

        switch (operacion) {
            case 1:
                System.out.println("El resultado de la suma es "+ operaciones.suma());
                break;

            case 2:
                System.out.println("El resultado de la resta es "+ operaciones.resta());
                break;

            case 3:
                System.out.println("El resultado de la multiplicación es "+ operaciones.multiplicación());
                break;

            default:
                System.out.println("Esta operación no es posible");
                break;
        }
    }
}