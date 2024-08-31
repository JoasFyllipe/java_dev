package estrutura_condicional;
import java.util.Scanner;

public class estrutura_switchcase {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        String dia;
        int x = 0;

        while (x!= 'q') {   //linha adicionada apenas para testar o laço

        x = sc.nextInt();
        
        switch (x) {
            case 1:
                dia = "domingo";
                break;
            case 2:
                dia = "segunda";
                break;
            case 3:
                dia = "terça";
                break;
            case 4:
                dia = "quarta";
                break;
            case 5:
                dia = "quinta";
                break;
            case 6:
                dia = "sexta";
                break;
            case 7:
                dia = "sabado";
                break;
            default:
                dia = "Valor inválido!";
                break;
            }
        
            System.out.println("Dia da semana: "+ dia);
        }
        sc.close();
    }
}
