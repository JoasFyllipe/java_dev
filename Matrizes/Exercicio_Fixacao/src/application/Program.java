package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de linhas: ");
        int m = sc.nextInt();
        System.out.print("Quantidade de colunas: ");
        int n = sc.nextInt();
        System.out.println();

        int [][] mat = new int[m][n];
        for (int i=0; i< mat.length; i++){
            for(int j=0; j<mat[i].length; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.print("Digite um número: ");
        int x = sc.nextInt();
        sc.nextLine();

        for (int i=0; i<mat.length; i++){ // verifica se o valor de x existe dentro da matriz (pode se repetir)
            for (int j=0; j<mat[i].length; j++){
                if(mat[i][j] == x){
                    System.out.println("Position: "+ i +","+ j + ":");
                    if(j>0){ // imprime o valor a esquerda caso exista
                        System.out.println("Left: "+ mat[i][j-1]);
                    }
                    if (i>0){ // imprime o valor acima caso exista
                        System.out.println("Up: "+ mat[i-1][j]);
                    }
                    if(j<mat[i].length-1){ // imprime o valor a direita caso exista
                        System.out.println("Right: "+ mat[i][j+1]);
                    }
                    if(i<mat.length-1){ // imprime o valor abaixo caso exista
                        System.out.println("Down: "+ mat[i+1][j]);
                    }
                }
            }
        }

        sc.close();
    }
}
