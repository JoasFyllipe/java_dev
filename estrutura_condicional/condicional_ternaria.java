package estrutura_condicional;

public class condicional_ternaria {

    public static void main(String[] args) {
            
    //sintaxe: (condição) ? valor_se_verdadeiro : valor_se_falso

    //condicional if/else
    double preco1 = 34.5;
    double desconto;
    if(preco1 < 20.0){
        desconto = preco1 * 0.1;
    }
    else {
        desconto = preco1 * 0.05;
    }
    System.out.println(desconto);

    //condicional ternaria
    double preco2 = 34.5;
    double desconto2 = (preco2 < 20.0) ? preco2 * 0.1 : preco2 * 0.05;
    System.out.println(desconto2);

    }
}