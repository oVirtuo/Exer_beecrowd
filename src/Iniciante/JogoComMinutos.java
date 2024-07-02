package Iniciante;

import java.io.IOException;
import java.util.Scanner;


public class JogoComMinutos {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        // Recebe "xHora xMinuto yHora yMinuto"
        //Se  "xHora xMinuto yHora yMinuto" são iguais, passaram-se 24h
        //yHora - xHora = Horas de jogo
        //Se xMinuto + yMinuto >=60, deve zerar e somar 1 no total de horas
        
        String linha = sc.nextLine();
        String[] numeros = linha.split(" ");
        
        int xHora = Integer.parseInt(numeros[0]);
        int xMinuto = Integer.parseInt(numeros[1]);
        int yHora = Integer.parseInt(numeros[2]);
        int yMinuto = Integer.parseInt(numeros[3]);

        int h;
        int m;

        if (xHora == yHora && xMinuto == yMinuto){
            h = 24;
            m = 0;
            System.out.println("O JOGO DUROU " + h + " HORA(S) E " + m + " MINUTO(S)");
        }else{
            if(yHora < xHora){
                if ((m = yMinuto - xMinuto) < 0){
                    h = (24 - (xHora - yHora)) - 1;
                    m = 60 + m;
                    System.out.println("O JOGO DUROU " + h + " HORA(S) E " + m + " MINUTO(S)");
                }else if (yMinuto == xMinuto){
                    h = 24 - (xHora - yHora);
                    m = 0;
                    System.out.println("O JOGO DUROU " + h + " HORA(S) E " + m + " MINUTO(S)");
                }else{
                    h = 24 - (xHora - yHora);
                    m = yMinuto - xMinuto;
                    System.out.println("O JOGO DUROU " + h + " HORA(S) E " + m + " MINUTO(S)");
                }
            }else if (yHora == xHora){
                if (xMinuto > yMinuto){
                    h = 23;
                    m = 60 - (xMinuto - yMinuto);
                    if(m < 0){
                        m = 60 - m;
                        System.out.println("O JOGO DUROU " + h + " HORA(S) E " + m + " MINUTO(S)");
                    }else{
                        System.out.println("O JOGO DUROU " + h + " HORA(S) E " + m + " MINUTO(S)");
                    }
                }else{
                    h = 0;
                    m = yMinuto - xMinuto;
                    System.out.println("O JOGO DUROU " + h + " HORA(S) E " + m + " MINUTO(S)");
                }
            }else if (yMinuto == xMinuto){
                h = yHora - xHora;
                m = 0;
                System.out.println("O JOGO DUROU " + h + " HORA(S) E " + m + " MINUTO(S)");
            }else if ((m = yMinuto - xMinuto) < 0){
                h = (yHora - xHora) - 1;
                m = 60 + m;
                System.out.println("O JOGO DUROU " + h + " HORA(S) E " + m + " MINUTO(S)");
            }else{
                h = yHora - xHora;
                m = yMinuto - xMinuto;
                System.out.println("O JOGO DUROU " + h + " HORA(S) E " + m + " MINUTO(S)");
            }
        }
        

        sc.close();
    }
    
}
