import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
    
        int N = sc.nextInt();

        for(int i = 1; i<=N; i++){
            int x = sc.nextInt();
            
            if(x>=10 && x<=20){
                System.out.println(x+" in");
            }
            else{
                System.out.println(x+" out");
            }
        }        
    
    }
}