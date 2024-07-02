package Iniciante;

import java.util.Scanner;
import java.io.IOException;

public class DividindoCirculos {

    // Função para calcular o coeficiente binomial C(n, k)
    public static long binomial(int n, int k) {
        if (k > n) {
            return 0;
        }
        if (k == 0 || k == n) {
            return 1;
        }
        long resultado = 1;
        for (int i = 1; i <= k; i++) {
            resultado = resultado * (n - i + 1) / i;
        }
        return resultado;
    }

    // Função para calcular o número de partes em que o círculo é dividido
    public static long calcularPartes(int N) {
        if (N == 1) {
            return 1;
        }
        if (N == 2) {
            return 2;
        }
        if (N == 3) {
            return 4;
        }
        long partes = 1 + binomial(N, 2) + binomial(N, 4);
        return partes;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long resultado = calcularPartes(N);
        System.out.println(resultado);
        sc.close();
    }
}
