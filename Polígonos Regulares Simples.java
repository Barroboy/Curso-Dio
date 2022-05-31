/*
Na geometria Euclidiana, um polígono regular é um polígono em que todos
os ângulos são iguais e todos os lados tem o mesmo comprimento.
Um polígono simples é aquele cujos segmentos de reta não se interceptam.
Abaixo pode-se ver vários mosaicos feitos por polígonos regulares.

Você deve escrever um programa que, dados o número e o
comprimento dos lados de um polígono regular, mostre seu perímetro.
*/

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    long N = scan.nextLong();
		long L = scan.nextLong();
		long P = N * L;
		System.out.println(P);
  }
}
