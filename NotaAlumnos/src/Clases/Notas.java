package Clases;

public class Notas {
    private double[] notas = new double[15];
    private double sumaNotas = 0;
    private double mayorNota = Double.MIN_VALUE;
    private double menorNota = Double.MAX_VALUE;
    private int posicionMenorNota = -1;

    public void insertar(int pos, double num) {
        this.notas[pos] = num;
    }

    public double calcMayor() {
        double mayor = 0;
        for (int i = 0; i <= 14; i++) {
            if (notas[i] > mayor) {
                mayor = notas[i];
            }
        }
        return mayor;
    }

    public double calPorcentaje() {
        double sumatoria = 0;
        for (int i = 0; i <= 14; i++) {
            if (notas[i] >= 3.0) {
                sumatoria = sumatoria + 1;
            }
        }
        double porcentaje = (sumatoria/15)*100;

        return porcentaje;
    }

    public int calcMenor() {
        double menor = 50;
        int posicion = 0;
        for (int i = 0; i >= 14; i++) {
            if (notas[i] < menor) {
                menor = notas[i];
                posicion = i;
            }
        }
        return posicion;
    }

    public double calPromedio() {
        double sumatoria = 0;
        for (int i = 0; i <= 14; i++) {
            sumatoria = sumatoria + notas[i];
        }
        double promedio = (sumatoria/15);

        return promedio;
    }
}
