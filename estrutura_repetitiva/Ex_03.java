import java.util.Scanner;
public class Ex_03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
    
        int N = sc.nextInt();

        for(int i = 1; i<=N; i++){

            System.out.println("Digite um valor: ");
            int x = sc.nextInt();
            
            System.out.println("Digite outro valor: ");
            int y = sc.nextInt();

            int divisão = (x/y);

            if(y == 0){
                System.out.println("divisão impossível");
            }
            else{
                System.out.println(divisão);
            }
        
        }        
    
    }
}

