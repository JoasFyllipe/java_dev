package estrutura_condicional;

import java.util.Scanner;

public class Estrutura_if_else {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas Horas?");
        int hora = sc.nextInt();

        if(hora<12){
            System.out.println("Bom dia");    
        }
        else if(hora > 12 && hora <= 18){
            System.out.println("Boa tarde");
        }else{
            System.out.println("Boa noite");
        }
    
        sc.close();
    }
    
}
